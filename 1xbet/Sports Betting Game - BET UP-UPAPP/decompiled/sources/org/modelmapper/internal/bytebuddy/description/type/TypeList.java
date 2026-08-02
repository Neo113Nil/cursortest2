package org.modelmapper.internal.bytebuddy.description.type;

import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.modelmapper.internal.asm.Type;
import org.modelmapper.internal.bytebuddy.build.CachedReturnPlugin;
import org.modelmapper.internal.bytebuddy.description.ByteCodeElement;
import org.modelmapper.internal.bytebuddy.description.TypeVariableSource;
import org.modelmapper.internal.bytebuddy.description.annotation.AnnotationList;
import org.modelmapper.internal.bytebuddy.description.field.FieldDescription;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.description.method.ParameterDescription;
import org.modelmapper.internal.bytebuddy.description.type.TypeDefinition;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.StackSize;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatcher;
import org.modelmapper.internal.bytebuddy.matcher.FilterableList;

/* loaded from: classes4.dex */
public interface TypeList extends FilterableList<TypeDescription, TypeList> {
    public static final String[] NO_INTERFACES = null;

    int getStackSize();

    String[] toInternalNames();

    public static abstract class AbstractBase extends FilterableList.AbstractBase<TypeDescription, TypeList> implements TypeList {
        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.modelmapper.internal.bytebuddy.matcher.FilterableList.AbstractBase
        public TypeList wrap(List<TypeDescription> list) {
            return new Explicit(list);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeList
        public int getStackSize() {
            return StackSize.of(this);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeList
        public String[] toInternalNames() {
            int size = size();
            String[] strArr = new String[size];
            Iterator it = iterator();
            int i = 0;
            while (it.hasNext()) {
                strArr[i] = ((TypeDescription) it.next()).getInternalName();
                i++;
            }
            return size == 0 ? NO_INTERFACES : strArr;
        }
    }

    public static class ForLoadedTypes extends AbstractBase {
        private final List<? extends Class<?>> types;

        public ForLoadedTypes(Class<?>... clsArr) {
            this((List<? extends Class<?>>) Arrays.asList(clsArr));
        }

        public ForLoadedTypes(List<? extends Class<?>> list) {
            this.types = list;
        }

        @Override // java.util.AbstractList, java.util.List
        public TypeDescription get(int i) {
            return TypeDescription.ForLoadedType.of(this.types.get(i));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.types.size();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeList.AbstractBase, org.modelmapper.internal.bytebuddy.description.type.TypeList
        public String[] toInternalNames() {
            int size = this.types.size();
            String[] strArr = new String[size];
            Iterator<? extends Class<?>> it = this.types.iterator();
            int i = 0;
            while (it.hasNext()) {
                strArr[i] = Type.getInternalName(it.next());
                i++;
            }
            return size == 0 ? NO_INTERFACES : strArr;
        }
    }

    public static class Explicit extends AbstractBase {
        private final List<? extends TypeDescription> typeDescriptions;

        public Explicit(TypeDescription... typeDescriptionArr) {
            this((List<? extends TypeDescription>) Arrays.asList(typeDescriptionArr));
        }

        public Explicit(List<? extends TypeDescription> list) {
            this.typeDescriptions = list;
        }

        @Override // java.util.AbstractList, java.util.List
        public TypeDescription get(int i) {
            return this.typeDescriptions.get(i);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.typeDescriptions.size();
        }
    }

    public static class Empty extends FilterableList.Empty<TypeDescription, TypeList> implements TypeList {
        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeList
        public int getStackSize() {
            return 0;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeList
        public String[] toInternalNames() {
            return NO_INTERFACES;
        }
    }

    public interface Generic extends FilterableList<TypeDescription.Generic, Generic> {
        Generic accept(TypeDescription.Generic.Visitor<? extends TypeDescription.Generic> visitor);

        TypeList asErasures();

        Generic asRawTypes();

        ByteCodeElement.Token.TokenList<TypeVariableToken> asTokenList(ElementMatcher<? super TypeDescription> elementMatcher);

        int getStackSize();

        public static abstract class AbstractBase extends FilterableList.AbstractBase<TypeDescription.Generic, Generic> implements Generic {
            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.modelmapper.internal.bytebuddy.matcher.FilterableList.AbstractBase
            public Generic wrap(List<TypeDescription.Generic> list) {
                return new Explicit(list);
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeList.Generic
            public Generic accept(TypeDescription.Generic.Visitor<? extends TypeDescription.Generic> visitor) {
                ArrayList arrayList = new ArrayList(size());
                Iterator it = iterator();
                while (it.hasNext()) {
                    arrayList.add(((TypeDescription.Generic) it.next()).accept(visitor));
                }
                return new Explicit(arrayList);
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeList.Generic
            public ByteCodeElement.Token.TokenList<TypeVariableToken> asTokenList(ElementMatcher<? super TypeDescription> elementMatcher) {
                ArrayList arrayList = new ArrayList(size());
                Iterator it = iterator();
                while (it.hasNext()) {
                    arrayList.add(TypeVariableToken.of((TypeDescription.Generic) it.next(), elementMatcher));
                }
                return new ByteCodeElement.Token.TokenList<>(arrayList);
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeList.Generic
            public int getStackSize() {
                Iterator it = iterator();
                int i = 0;
                while (it.hasNext()) {
                    i += ((TypeDescription.Generic) it.next()).getStackSize().getSize();
                }
                return i;
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeList.Generic
            public TypeList asErasures() {
                ArrayList arrayList = new ArrayList(size());
                Iterator it = iterator();
                while (it.hasNext()) {
                    arrayList.add(((TypeDescription.Generic) it.next()).asErasure());
                }
                return new Explicit(arrayList);
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeList.Generic
            public Generic asRawTypes() {
                ArrayList arrayList = new ArrayList(size());
                Iterator it = iterator();
                while (it.hasNext()) {
                    arrayList.add(((TypeDescription.Generic) it.next()).asRawType());
                }
                return new Explicit(arrayList);
            }
        }

        public static class Explicit extends AbstractBase {
            private final List<? extends TypeDefinition> typeDefinitions;

            public Explicit(TypeDefinition... typeDefinitionArr) {
                this((List<? extends TypeDefinition>) Arrays.asList(typeDefinitionArr));
            }

            public Explicit(List<? extends TypeDefinition> list) {
                this.typeDefinitions = list;
            }

            @Override // java.util.AbstractList, java.util.List
            public TypeDescription.Generic get(int i) {
                return this.typeDefinitions.get(i).asGenericType();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return this.typeDefinitions.size();
            }
        }

        public static class ForLoadedTypes extends AbstractBase {
            private final List<? extends java.lang.reflect.Type> types;

            public ForLoadedTypes(java.lang.reflect.Type... typeArr) {
                this((List<? extends java.lang.reflect.Type>) Arrays.asList(typeArr));
            }

            public ForLoadedTypes(List<? extends java.lang.reflect.Type> list) {
                this.types = list;
            }

            @Override // java.util.AbstractList, java.util.List
            public TypeDescription.Generic get(int i) {
                return TypeDefinition.Sort.describe(this.types.get(i));
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return this.types.size();
            }

            public static class OfTypeVariables extends AbstractBase {
                private final List<TypeVariable<?>> typeVariables;

                protected OfTypeVariables(TypeVariable<?>... typeVariableArr) {
                    this((List<TypeVariable<?>>) Arrays.asList(typeVariableArr));
                }

                protected OfTypeVariables(List<TypeVariable<?>> list) {
                    this.typeVariables = list;
                }

                public static Generic of(GenericDeclaration genericDeclaration) {
                    return new OfTypeVariables(genericDeclaration.getTypeParameters());
                }

                @Override // java.util.AbstractList, java.util.List
                public TypeDescription.Generic get(int i) {
                    TypeVariable<?> typeVariable = this.typeVariables.get(i);
                    return TypeDefinition.Sort.describe(typeVariable, TypeDescription.Generic.AnnotationReader.DISPATCHER.resolveTypeVariable(typeVariable));
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public int size() {
                    return this.typeVariables.size();
                }
            }
        }

        public static class ForDetachedTypes extends AbstractBase {
            private final List<? extends TypeDescription.Generic> detachedTypes;
            private final TypeDescription.Generic.Visitor<? extends TypeDescription.Generic> visitor;

            public ForDetachedTypes(List<? extends TypeDescription.Generic> list, TypeDescription.Generic.Visitor<? extends TypeDescription.Generic> visitor) {
                this.detachedTypes = list;
                this.visitor = visitor;
            }

            public static Generic attachVariables(TypeDescription typeDescription, List<? extends TypeVariableToken> list) {
                return new OfTypeVariables(typeDescription, list, TypeDescription.Generic.Visitor.Substitutor.ForAttachment.of(typeDescription));
            }

            public static Generic attach(FieldDescription fieldDescription, List<? extends TypeDescription.Generic> list) {
                return new ForDetachedTypes(list, TypeDescription.Generic.Visitor.Substitutor.ForAttachment.of(fieldDescription));
            }

            public static Generic attach(MethodDescription methodDescription, List<? extends TypeDescription.Generic> list) {
                return new ForDetachedTypes(list, TypeDescription.Generic.Visitor.Substitutor.ForAttachment.of(methodDescription));
            }

            public static Generic attachVariables(MethodDescription methodDescription, List<? extends TypeVariableToken> list) {
                return new OfTypeVariables(methodDescription, list, TypeDescription.Generic.Visitor.Substitutor.ForAttachment.of(methodDescription));
            }

            public static Generic attach(ParameterDescription parameterDescription, List<? extends TypeDescription.Generic> list) {
                return new ForDetachedTypes(list, TypeDescription.Generic.Visitor.Substitutor.ForAttachment.of(parameterDescription));
            }

            @Override // java.util.AbstractList, java.util.List
            public TypeDescription.Generic get(int i) {
                return (TypeDescription.Generic) this.detachedTypes.get(i).accept(this.visitor);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return this.detachedTypes.size();
            }

            public static class WithResolvedErasure extends AbstractBase {
                private final List<? extends TypeDescription.Generic> detachedTypes;
                private final TypeDescription.Generic.Visitor<? extends TypeDescription.Generic> visitor;

                public WithResolvedErasure(List<? extends TypeDescription.Generic> list, TypeDescription.Generic.Visitor<? extends TypeDescription.Generic> visitor) {
                    this.detachedTypes = list;
                    this.visitor = visitor;
                }

                @Override // java.util.AbstractList, java.util.List
                public TypeDescription.Generic get(int i) {
                    return new TypeDescription.Generic.LazyProjection.WithResolvedErasure(this.detachedTypes.get(i), this.visitor);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public int size() {
                    return this.detachedTypes.size();
                }
            }

            public static class OfTypeVariables extends AbstractBase {
                private final List<? extends TypeVariableToken> detachedTypeVariables;
                private final TypeVariableSource typeVariableSource;
                private final TypeDescription.Generic.Visitor<? extends TypeDescription.Generic> visitor;

                public OfTypeVariables(TypeVariableSource typeVariableSource, List<? extends TypeVariableToken> list, TypeDescription.Generic.Visitor<? extends TypeDescription.Generic> visitor) {
                    this.typeVariableSource = typeVariableSource;
                    this.detachedTypeVariables = list;
                    this.visitor = visitor;
                }

                @Override // java.util.AbstractList, java.util.List
                public TypeDescription.Generic get(int i) {
                    return new AttachedTypeVariable(this.typeVariableSource, this.detachedTypeVariables.get(i), this.visitor);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public int size() {
                    return this.detachedTypeVariables.size();
                }

                protected static class AttachedTypeVariable extends TypeDescription.Generic.OfTypeVariable {
                    private final TypeVariableSource typeVariableSource;
                    private final TypeVariableToken typeVariableToken;
                    private final TypeDescription.Generic.Visitor<? extends TypeDescription.Generic> visitor;

                    protected AttachedTypeVariable(TypeVariableSource typeVariableSource, TypeVariableToken typeVariableToken, TypeDescription.Generic.Visitor<? extends TypeDescription.Generic> visitor) {
                        this.typeVariableSource = typeVariableSource;
                        this.typeVariableToken = typeVariableToken;
                        this.visitor = visitor;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
                    public Generic getUpperBounds() {
                        return this.typeVariableToken.getBounds().accept(this.visitor);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
                    public TypeVariableSource getTypeVariableSource() {
                        return this.typeVariableSource;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
                    public String getSymbol() {
                        return this.typeVariableToken.getSymbol();
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
                    public AnnotationList getDeclaredAnnotations() {
                        return this.typeVariableToken.getAnnotations();
                    }
                }
            }
        }

        public static class OfLoadedInterfaceTypes extends AbstractBase {
            private final Class<?> type;

            public OfLoadedInterfaceTypes(Class<?> cls) {
                this.type = cls;
            }

            @Override // java.util.AbstractList, java.util.List
            public TypeDescription.Generic get(int i) {
                Class<?> cls = this.type;
                return new TypeProjection(cls, i, cls.getInterfaces());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return this.type.getInterfaces().length;
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeList.Generic.AbstractBase, org.modelmapper.internal.bytebuddy.description.type.TypeList.Generic
            public TypeList asErasures() {
                return new ForLoadedTypes(this.type.getInterfaces());
            }

            private static class TypeProjection extends TypeDescription.Generic.LazyProjection.WithLazyNavigation.OfAnnotatedElement {
                private final Class<?>[] erasure;
                private final int index;
                private transient /* synthetic */ TypeDescription.Generic resolved;
                private final Class<?> type;

                private TypeProjection(Class<?> cls, int i, Class<?>[] clsArr) {
                    this.type = cls;
                    this.index = i;
                    this.erasure = clsArr;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.LazyProjection
                @CachedReturnPlugin.Enhance("resolved")
                protected TypeDescription.Generic resolve() {
                    TypeDescription.Generic asRawType;
                    if (this.resolved != null) {
                        asRawType = null;
                    } else {
                        java.lang.reflect.Type[] genericInterfaces = this.type.getGenericInterfaces();
                        if (this.erasure.length == genericInterfaces.length) {
                            asRawType = TypeDefinition.Sort.describe(genericInterfaces[this.index], getAnnotationReader());
                        } else {
                            asRawType = asRawType();
                        }
                    }
                    if (asRawType == null) {
                        return this.resolved;
                    }
                    this.resolved = asRawType;
                    return asRawType;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                public TypeDescription asErasure() {
                    return TypeDescription.ForLoadedType.of(this.erasure[this.index]);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.LazyProjection.WithLazyNavigation.OfAnnotatedElement
                protected TypeDescription.Generic.AnnotationReader getAnnotationReader() {
                    return TypeDescription.Generic.AnnotationReader.DISPATCHER.resolveInterfaceType(this.type, this.index);
                }
            }
        }

        public static class OfConstructorExceptionTypes extends AbstractBase {
            private final Constructor<?> constructor;

            public OfConstructorExceptionTypes(Constructor<?> constructor) {
                this.constructor = constructor;
            }

            @Override // java.util.AbstractList, java.util.List
            public TypeDescription.Generic get(int i) {
                Constructor<?> constructor = this.constructor;
                return new TypeProjection(constructor, i, constructor.getExceptionTypes());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return this.constructor.getExceptionTypes().length;
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeList.Generic.AbstractBase, org.modelmapper.internal.bytebuddy.description.type.TypeList.Generic
            public TypeList asErasures() {
                return new ForLoadedTypes(this.constructor.getExceptionTypes());
            }

            private static class TypeProjection extends TypeDescription.Generic.LazyProjection.WithEagerNavigation.OfAnnotatedElement {
                private final Constructor<?> constructor;
                private final Class<?>[] erasure;
                private final int index;
                private transient /* synthetic */ TypeDescription.Generic resolved;

                private TypeProjection(Constructor<?> constructor, int i, Class<?>[] clsArr) {
                    this.constructor = constructor;
                    this.index = i;
                    this.erasure = clsArr;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.LazyProjection
                @CachedReturnPlugin.Enhance("resolved")
                protected TypeDescription.Generic resolve() {
                    TypeDescription.Generic asRawType;
                    if (this.resolved != null) {
                        asRawType = null;
                    } else {
                        java.lang.reflect.Type[] genericExceptionTypes = this.constructor.getGenericExceptionTypes();
                        if (this.erasure.length == genericExceptionTypes.length) {
                            asRawType = TypeDefinition.Sort.describe(genericExceptionTypes[this.index], getAnnotationReader());
                        } else {
                            asRawType = asRawType();
                        }
                    }
                    if (asRawType == null) {
                        return this.resolved;
                    }
                    this.resolved = asRawType;
                    return asRawType;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                public TypeDescription asErasure() {
                    return TypeDescription.ForLoadedType.of(this.erasure[this.index]);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.LazyProjection.WithEagerNavigation.OfAnnotatedElement
                protected TypeDescription.Generic.AnnotationReader getAnnotationReader() {
                    return TypeDescription.Generic.AnnotationReader.DISPATCHER.resolveExceptionType(this.constructor, this.index);
                }
            }
        }

        public static class OfMethodExceptionTypes extends AbstractBase {
            private final Method method;

            public OfMethodExceptionTypes(Method method) {
                this.method = method;
            }

            @Override // java.util.AbstractList, java.util.List
            public TypeDescription.Generic get(int i) {
                Method method = this.method;
                return new TypeProjection(method, i, method.getExceptionTypes());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return this.method.getExceptionTypes().length;
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeList.Generic.AbstractBase, org.modelmapper.internal.bytebuddy.description.type.TypeList.Generic
            public TypeList asErasures() {
                return new ForLoadedTypes(this.method.getExceptionTypes());
            }

            private static class TypeProjection extends TypeDescription.Generic.LazyProjection.WithEagerNavigation.OfAnnotatedElement {
                private final Class<?>[] erasure;
                private final int index;
                private final Method method;
                private transient /* synthetic */ TypeDescription.Generic resolved;

                public TypeProjection(Method method, int i, Class<?>[] clsArr) {
                    this.method = method;
                    this.index = i;
                    this.erasure = clsArr;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.LazyProjection
                @CachedReturnPlugin.Enhance("resolved")
                protected TypeDescription.Generic resolve() {
                    TypeDescription.Generic asRawType;
                    if (this.resolved != null) {
                        asRawType = null;
                    } else {
                        java.lang.reflect.Type[] genericExceptionTypes = this.method.getGenericExceptionTypes();
                        if (this.erasure.length == genericExceptionTypes.length) {
                            asRawType = TypeDefinition.Sort.describe(genericExceptionTypes[this.index], getAnnotationReader());
                        } else {
                            asRawType = asRawType();
                        }
                    }
                    if (asRawType == null) {
                        return this.resolved;
                    }
                    this.resolved = asRawType;
                    return asRawType;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                public TypeDescription asErasure() {
                    return TypeDescription.ForLoadedType.of(this.erasure[this.index]);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.LazyProjection.WithEagerNavigation.OfAnnotatedElement
                protected TypeDescription.Generic.AnnotationReader getAnnotationReader() {
                    return TypeDescription.Generic.AnnotationReader.DISPATCHER.resolveExceptionType(this.method, this.index);
                }
            }
        }

        public static class Empty extends FilterableList.Empty<TypeDescription.Generic, Generic> implements Generic {
            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeList.Generic
            public Generic asRawTypes() {
                return this;
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeList.Generic
            public int getStackSize() {
                return 0;
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeList.Generic
            public TypeList asErasures() {
                return new Empty();
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeList.Generic
            public Generic accept(TypeDescription.Generic.Visitor<? extends TypeDescription.Generic> visitor) {
                return new Empty();
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeList.Generic
            public ByteCodeElement.Token.TokenList<TypeVariableToken> asTokenList(ElementMatcher<? super TypeDescription> elementMatcher) {
                return new ByteCodeElement.Token.TokenList<>(new TypeVariableToken[0]);
            }
        }
    }
}
