package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC5355a;
import androidx.datastore.preferences.protobuf.AbstractC5363i;
import androidx.datastore.preferences.protobuf.AbstractC5376w;
import androidx.datastore.preferences.protobuf.AbstractC5376w.a;
import androidx.datastore.preferences.protobuf.C5372s;
import androidx.datastore.preferences.protobuf.C5378y;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: androidx.datastore.preferences.protobuf.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5376w<MessageType extends AbstractC5376w<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends AbstractC5355a<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC5376w<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected n0 unknownFields = n0.b();

    /* renamed from: androidx.datastore.preferences.protobuf.w$a */
    public static abstract class a<MessageType extends AbstractC5376w<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends AbstractC5355a.AbstractC0779a<MessageType, BuilderType> {

        /* renamed from: a, reason: collision with root package name */
        private final MessageType f42624a;

        /* renamed from: b, reason: collision with root package name */
        protected MessageType f42625b;

        protected a(MessageType messagetype) {
            this.f42624a = messagetype;
            if (messagetype.n()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.f42625b = (MessageType) messagetype.q();
        }

        @Override // androidx.datastore.preferences.protobuf.S
        public final AbstractC5376w a() {
            return this.f42624a;
        }

        public final MessageType c() {
            MessageType d11 = d();
            d11.getClass();
            if (AbstractC5376w.m(d11, true)) {
                return d11;
            }
            throw new l0();
        }

        public final Object clone() throws CloneNotSupportedException {
            a aVar = (a) this.f42624a.i(f.NEW_BUILDER);
            aVar.f42625b = d();
            return aVar;
        }

        public final MessageType d() {
            if (!this.f42625b.n()) {
                return this.f42625b;
            }
            MessageType messagetype = this.f42625b;
            messagetype.getClass();
            c0 a11 = c0.a();
            a11.getClass();
            a11.b(messagetype.getClass()).makeImmutable(messagetype);
            messagetype.o();
            return this.f42625b;
        }

        protected final void e() {
            if (this.f42625b.n()) {
                return;
            }
            MessageType messagetype = (MessageType) this.f42624a.q();
            MessageType messagetype2 = this.f42625b;
            c0 a11 = c0.a();
            a11.getClass();
            a11.b(messagetype.getClass()).mergeFrom(messagetype, messagetype2);
            this.f42625b = messagetype;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.w$b */
    /* loaded from: classes8.dex */
    protected static class b<T extends AbstractC5376w<T, ?>> extends AbstractC5356b<T> {
        public b(T t2) {
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.w$c */
    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends AbstractC5376w<MessageType, BuilderType> implements S {
        protected C5372s<d> extensions = C5372s.e();

        @Override // androidx.datastore.preferences.protobuf.AbstractC5376w, androidx.datastore.preferences.protobuf.S
        public final AbstractC5376w a() {
            return (AbstractC5376w) i(f.GET_DEFAULT_INSTANCE);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC5376w, androidx.datastore.preferences.protobuf.Q
        public final a newBuilderForType() {
            return (a) i(f.NEW_BUILDER);
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.w$d */
    /* loaded from: classes8.dex */
    static final class d implements C5372s.b<d> {
        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            ((d) obj).getClass();
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.C5372s.b
        public final s0 getLiteJavaType() {
            throw null;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.w$e */
    /* loaded from: classes8.dex */
    public static class e<ContainingType extends Q, Type> extends Ve.E {
        public static void i() {
            throw null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: androidx.datastore.preferences.protobuf.w$f */
    public static final class f {
        private static final /* synthetic */ f[] $VALUES;
        public static final f BUILD_MESSAGE_INFO;
        public static final f GET_DEFAULT_INSTANCE;
        public static final f GET_MEMOIZED_IS_INITIALIZED;
        public static final f GET_PARSER;
        public static final f NEW_BUILDER;
        public static final f NEW_MUTABLE_INSTANCE;
        public static final f SET_MEMOIZED_IS_INITIALIZED;

        static {
            f fVar = new f("GET_MEMOIZED_IS_INITIALIZED", 0);
            GET_MEMOIZED_IS_INITIALIZED = fVar;
            f fVar2 = new f("SET_MEMOIZED_IS_INITIALIZED", 1);
            SET_MEMOIZED_IS_INITIALIZED = fVar2;
            f fVar3 = new f("BUILD_MESSAGE_INFO", 2);
            BUILD_MESSAGE_INFO = fVar3;
            f fVar4 = new f("NEW_MUTABLE_INSTANCE", 3);
            NEW_MUTABLE_INSTANCE = fVar4;
            f fVar5 = new f("NEW_BUILDER", 4);
            NEW_BUILDER = fVar5;
            f fVar6 = new f("GET_DEFAULT_INSTANCE", 5);
            GET_DEFAULT_INSTANCE = fVar6;
            f fVar7 = new f("GET_PARSER", 6);
            GET_PARSER = fVar7;
            $VALUES = new f[]{fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7};
        }

        private f() {
            throw null;
        }

        public static f valueOf(String str) {
            return (f) Enum.valueOf(f.class, str);
        }

        public static f[] values() {
            return (f[]) $VALUES.clone();
        }
    }

    protected static <E> C5378y.c<E> j() {
        return d0.b();
    }

    static <T extends AbstractC5376w<?, ?>> T k(Class<T> cls) {
        T t2 = (T) defaultInstanceMap.get(cls);
        if (t2 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t2 = (T) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e11) {
                throw new IllegalStateException("Class initialization cannot fail.", e11);
            }
        }
        if (t2 != null) {
            return t2;
        }
        T t11 = (T) ((AbstractC5376w) p0.i(cls)).i(f.GET_DEFAULT_INSTANCE);
        if (t11 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, t11);
        return t11;
    }

    static Object l(Method method, Q q11, Object... objArr) {
        try {
            return method.invoke(q11, objArr);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e11);
        } catch (InvocationTargetException e12) {
            Throwable cause = e12.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static final <T extends AbstractC5376w<T, ?>> boolean m(T t2, boolean z11) {
        byte byteValue = ((Byte) t2.i(f.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        c0 a11 = c0.a();
        a11.getClass();
        boolean isInitialized = a11.b(t2.getClass()).isInitialized(t2);
        if (z11) {
            t2.i(f.SET_MEMOIZED_IS_INITIALIZED);
        }
        return isInitialized;
    }

    protected static Object p(AbstractC5376w abstractC5376w, String str, Object[] objArr) {
        return new e0(abstractC5376w, str, objArr);
    }

    protected static AbstractC5376w r(V2.g gVar, InputStream inputStream) throws C5379z {
        AbstractC5363i bVar;
        if (inputStream == null) {
            byte[] bArr = C5378y.f42629b;
            bVar = AbstractC5363i.d(bArr, 0, bArr.length, false);
        } else {
            bVar = new AbstractC5363i.b(inputStream);
        }
        C5369o b11 = C5369o.b();
        V2.g q11 = gVar.q();
        try {
            c0 a11 = c0.a();
            a11.getClass();
            f0 b12 = a11.b(q11.getClass());
            b12.b(q11, C5364j.a(bVar), b11);
            b12.makeImmutable(q11);
            if (m(q11, true)) {
                return q11;
            }
            C5379z c5379z = new C5379z(new l0().getMessage());
            c5379z.h(q11);
            throw c5379z;
        } catch (l0 e11) {
            C5379z c5379z2 = new C5379z(e11.getMessage());
            c5379z2.h(q11);
            throw c5379z2;
        } catch (C5379z e12) {
            e = e12;
            if (e.a()) {
                e = new C5379z(e.getMessage(), e);
            }
            e.h(q11);
            throw e;
        } catch (IOException e13) {
            if (e13.getCause() instanceof C5379z) {
                throw ((C5379z) e13.getCause());
            }
            C5379z c5379z3 = new C5379z(e13.getMessage(), e13);
            c5379z3.h(q11);
            throw c5379z3;
        } catch (RuntimeException e14) {
            if (e14.getCause() instanceof C5379z) {
                throw ((C5379z) e14.getCause());
            }
            throw e14;
        }
    }

    protected static <T extends AbstractC5376w<?, ?>> void s(Class<T> cls, T t2) {
        t2.o();
        defaultInstanceMap.put(cls, t2);
    }

    @Override // androidx.datastore.preferences.protobuf.S
    public AbstractC5376w a() {
        return (AbstractC5376w) i(f.GET_DEFAULT_INSTANCE);
    }

    @Override // androidx.datastore.preferences.protobuf.Q
    public final void b(AbstractC5365k abstractC5365k) throws IOException {
        c0 a11 = c0.a();
        a11.getClass();
        a11.b(getClass()).c(this, C5366l.a(abstractC5365k));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC5355a
    final int d() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC5355a
    final int e(f0 f0Var) {
        int a11;
        int a12;
        if (n()) {
            if (f0Var == null) {
                c0 a13 = c0.a();
                a13.getClass();
                a12 = a13.b(getClass()).a(this);
            } else {
                a12 = f0Var.a(this);
            }
            if (a12 >= 0) {
                return a12;
            }
            throw new IllegalStateException(Ej.b.a(a12, "serialized size must be non-negative, was "));
        }
        if (d() != Integer.MAX_VALUE) {
            return d();
        }
        if (f0Var == null) {
            c0 a14 = c0.a();
            a14.getClass();
            a11 = a14.b(getClass()).a(this);
        } else {
            a11 = f0Var.a(this);
        }
        f(a11);
        return a11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c0 a11 = c0.a();
        a11.getClass();
        return a11.b(getClass()).d(this, (AbstractC5376w) obj);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC5355a
    final void f(int i11) {
        if (i11 < 0) {
            throw new IllegalStateException(Ej.b.a(i11, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i11 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
    }

    @Override // androidx.datastore.preferences.protobuf.Q
    public final int getSerializedSize() {
        return e(null);
    }

    protected final <MessageType extends AbstractC5376w<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType h() {
        return (BuilderType) i(f.NEW_BUILDER);
    }

    public final int hashCode() {
        if (n()) {
            c0 a11 = c0.a();
            a11.getClass();
            return a11.b(getClass()).e(this);
        }
        if (this.memoizedHashCode == 0) {
            c0 a12 = c0.a();
            a12.getClass();
            this.memoizedHashCode = a12.b(getClass()).e(this);
        }
        return this.memoizedHashCode;
    }

    protected abstract Object i(f fVar);

    final boolean n() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.Q
    public a newBuilderForType() {
        return (a) i(f.NEW_BUILDER);
    }

    final void o() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    final MessageType q() {
        return (MessageType) i(f.NEW_MUTABLE_INSTANCE);
    }

    public final String toString() {
        return T.d(this, super.toString());
    }
}
