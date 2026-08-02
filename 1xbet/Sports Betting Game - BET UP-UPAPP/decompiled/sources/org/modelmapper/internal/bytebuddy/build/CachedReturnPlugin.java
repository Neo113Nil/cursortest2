package org.modelmapper.internal.bytebuddy.build;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.modelmapper.internal.bytebuddy.asm.Advice;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.build.Plugin;
import org.modelmapper.internal.bytebuddy.description.field.FieldDescription;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.description.modifier.FieldPersistence;
import org.modelmapper.internal.bytebuddy.description.modifier.ModifierContributor;
import org.modelmapper.internal.bytebuddy.description.modifier.Ownership;
import org.modelmapper.internal.bytebuddy.description.modifier.SyntheticState;
import org.modelmapper.internal.bytebuddy.description.modifier.Visibility;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.dynamic.ClassFileLocator;
import org.modelmapper.internal.bytebuddy.dynamic.DynamicType;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.assign.Assigner;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatchers;
import org.modelmapper.internal.bytebuddy.utility.RandomString;

/* loaded from: classes4.dex */
public class CachedReturnPlugin extends Plugin.ForElementMatcher {
    private static final String NAME_INFIX = "_";
    private final RandomString randomString;

    @Target({ElementType.PARAMETER})
    @Retention(RetentionPolicy.RUNTIME)
    private @interface CacheField {
    }

    @Target({ElementType.METHOD})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Enhance {
        String value() default "";
    }

    public CachedReturnPlugin() {
        super(ElementMatchers.declaresMethod(ElementMatchers.isAnnotatedWith((Class<? extends Annotation>) Enhance.class)));
        this.randomString = new RandomString();
    }

    @Override // org.modelmapper.internal.bytebuddy.build.Plugin
    public DynamicType.Builder<?> apply(DynamicType.Builder<?> builder, TypeDescription typeDescription, ClassFileLocator classFileLocator) {
        Class<?> cls;
        for (MethodDescription.InDefinedShape inDefinedShape : typeDescription.getDeclaredMethods().filter(ElementMatchers.not(ElementMatchers.isBridge()).and(ElementMatchers.isAnnotatedWith((Class<? extends Annotation>) Enhance.class)))) {
            if (inDefinedShape.isAbstract()) {
                throw new IllegalStateException("Cannot cache the value of an abstract method: " + inDefinedShape);
            }
            if (!inDefinedShape.getParameters().isEmpty()) {
                throw new IllegalStateException("Cannot cache the value of a method with parameters: " + inDefinedShape);
            }
            String value = ((Enhance) inDefinedShape.getDeclaredAnnotations().ofType(Enhance.class).loadSilent()).value();
            if (value.isEmpty()) {
                value = inDefinedShape.getName() + NAME_INFIX + this.randomString.nextString();
            }
            if (!inDefinedShape.getReturnType().isPrimitive()) {
                cls = ReferenceAdvice.class;
            } else if (inDefinedShape.getReturnType().represents(Boolean.TYPE)) {
                cls = BooleanAdvice.class;
            } else if (inDefinedShape.getReturnType().represents(Byte.TYPE)) {
                cls = ByteAdvice.class;
            } else if (inDefinedShape.getReturnType().represents(Short.TYPE)) {
                cls = ShortAdvice.class;
            } else if (inDefinedShape.getReturnType().represents(Character.TYPE)) {
                cls = CharacterAdvice.class;
            } else if (inDefinedShape.getReturnType().represents(Integer.TYPE)) {
                cls = IntegerAdvice.class;
            } else if (inDefinedShape.getReturnType().represents(Long.TYPE)) {
                cls = LongAdvice.class;
            } else if (inDefinedShape.getReturnType().represents(Float.TYPE)) {
                cls = FloatAdvice.class;
            } else if (inDefinedShape.getReturnType().represents(Double.TYPE)) {
                cls = DoubleAdvice.class;
            } else {
                throw new IllegalStateException("Cannot cache a method that returns void: " + inDefinedShape);
            }
            TypeDescription asErasure = inDefinedShape.getReturnType().asErasure();
            ModifierContributor.ForField[] forFieldArr = new ModifierContributor.ForField[4];
            forFieldArr[0] = inDefinedShape.isStatic() ? Ownership.STATIC : Ownership.MEMBER;
            forFieldArr[1] = Visibility.PRIVATE;
            forFieldArr[2] = SyntheticState.SYNTHETIC;
            forFieldArr[3] = FieldPersistence.TRANSIENT;
            builder = builder.defineField(value, asErasure, forFieldArr).visit(Advice.withCustomMapping().bind(CacheField.class, (Advice.OffsetMapping) new CacheFieldOffsetMapping(value)).to(cls).on(ElementMatchers.is(inDefinedShape)));
        }
        return builder;
    }

    @HashCodeAndEqualsPlugin.Enhance
    protected static class CacheFieldOffsetMapping implements Advice.OffsetMapping {
        private final String name;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.name.equals(((CacheFieldOffsetMapping) obj).name);
        }

        public int hashCode() {
            return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.name.hashCode();
        }

        protected CacheFieldOffsetMapping(String str) {
            this.name = str;
        }

        @Override // org.modelmapper.internal.bytebuddy.asm.Advice.OffsetMapping
        public Advice.OffsetMapping.Target resolve(TypeDescription typeDescription, MethodDescription methodDescription, Assigner assigner, Advice.ArgumentHandler argumentHandler, Advice.OffsetMapping.Sort sort) {
            return new Advice.OffsetMapping.Target.ForField.ReadWrite((FieldDescription) typeDescription.getDeclaredFields().filter(ElementMatchers.named(this.name)).getOnly());
        }
    }

    private static class BooleanAdvice {
        @Advice.OnMethodEnter(skipOn = Advice.OnNonDefaultValue.class)
        protected static boolean enter(@CacheField boolean z) {
            return z;
        }

        @Advice.OnMethodExit
        protected static void exit(@Advice.Return(readOnly = false) boolean z, @CacheField boolean z2) {
        }

        private BooleanAdvice() {
            throw new UnsupportedOperationException("This class is merely an advice template and should not be instantiated");
        }
    }

    private static class ByteAdvice {
        @Advice.OnMethodEnter(skipOn = Advice.OnNonDefaultValue.class)
        protected static byte enter(@CacheField byte b) {
            return b;
        }

        @Advice.OnMethodExit
        protected static void exit(@Advice.Return(readOnly = false) byte b, @CacheField byte b2) {
        }

        private ByteAdvice() {
            throw new UnsupportedOperationException("This class is merely an advice template and should not be instantiated");
        }
    }

    private static class ShortAdvice {
        @Advice.OnMethodEnter(skipOn = Advice.OnNonDefaultValue.class)
        protected static short enter(@CacheField short s) {
            return s;
        }

        @Advice.OnMethodExit
        protected static void exit(@Advice.Return(readOnly = false) short s, @CacheField short s2) {
        }

        private ShortAdvice() {
            throw new UnsupportedOperationException("This class is merely an advice template and should not be instantiated");
        }
    }

    private static class CharacterAdvice {
        @Advice.OnMethodEnter(skipOn = Advice.OnNonDefaultValue.class)
        protected static char enter(@CacheField char c) {
            return c;
        }

        @Advice.OnMethodExit
        protected static void exit(@Advice.Return(readOnly = false) char c, @CacheField char c2) {
        }

        private CharacterAdvice() {
            throw new UnsupportedOperationException("This class is merely an advice template and should not be instantiated");
        }
    }

    private static class IntegerAdvice {
        @Advice.OnMethodEnter(skipOn = Advice.OnNonDefaultValue.class)
        protected static int enter(@CacheField int i) {
            return i;
        }

        @Advice.OnMethodExit
        protected static void exit(@Advice.Return(readOnly = false) int i, @CacheField int i2) {
        }

        private IntegerAdvice() {
            throw new UnsupportedOperationException("This class is merely an advice template and should not be instantiated");
        }
    }

    private static class LongAdvice {
        @Advice.OnMethodEnter(skipOn = Advice.OnNonDefaultValue.class)
        protected static long enter(@CacheField long j) {
            return j;
        }

        @Advice.OnMethodExit
        protected static void exit(@Advice.Return(readOnly = false) long j, @CacheField long j2) {
        }

        private LongAdvice() {
            throw new UnsupportedOperationException("This class is merely an advice template and should not be instantiated");
        }
    }

    private static class FloatAdvice {
        @Advice.OnMethodEnter(skipOn = Advice.OnNonDefaultValue.class)
        protected static float enter(@CacheField float f) {
            return f;
        }

        @Advice.OnMethodExit
        protected static void exit(@Advice.Return(readOnly = false) float f, @CacheField float f2) {
        }

        private FloatAdvice() {
            throw new UnsupportedOperationException("This class is merely an advice template and should not be instantiated");
        }
    }

    private static class DoubleAdvice {
        @Advice.OnMethodEnter(skipOn = Advice.OnNonDefaultValue.class)
        protected static double enter(@CacheField double d) {
            return d;
        }

        @Advice.OnMethodExit
        protected static void exit(@Advice.Return(readOnly = false) double d, @CacheField double d2) {
        }

        private DoubleAdvice() {
            throw new UnsupportedOperationException("This class is merely an advice template and should not be instantiated");
        }
    }

    private static class ReferenceAdvice {
        @Advice.OnMethodEnter(skipOn = Advice.OnNonDefaultValue.class)
        protected static Object enter(@CacheField Object obj) {
            return obj;
        }

        @Advice.OnMethodExit
        protected static void exit(@Advice.Return(readOnly = false, typing = Assigner.Typing.DYNAMIC) Object obj, @CacheField Object obj2) {
        }

        private ReferenceAdvice() {
            throw new UnsupportedOperationException("This class is merely an advice template and should not be instantiated");
        }
    }
}
