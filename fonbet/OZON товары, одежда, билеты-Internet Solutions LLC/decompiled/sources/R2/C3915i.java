package R2;

import com.google.protobuf.DescriptorProtos$FileOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2", f = "DataMigrationInitializer.kt", l = {DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER, 46}, m = "invokeSuspend")
/* renamed from: R2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3915i extends kotlin.coroutines.jvm.internal.j implements Function2<Object, kotlin.coroutines.d<Object>, Object> {

    /* renamed from: d, reason: collision with root package name */
    Iterator f24370d;

    /* renamed from: e, reason: collision with root package name */
    InterfaceC3912f f24371e;

    /* renamed from: f, reason: collision with root package name */
    Object f24372f;

    /* renamed from: g, reason: collision with root package name */
    int f24373g;

    /* renamed from: h, reason: collision with root package name */
    /* synthetic */ Object f24374h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ List<InterfaceC3912f<Object>> f24375i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ ArrayList f24376j;

    @kotlin.coroutines.jvm.internal.e(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1", f = "DataMigrationInitializer.kt", l = {DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER}, m = "invokeSuspend")
    /* renamed from: R2.i$a */
    /* loaded from: classes8.dex */
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f24377d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC3912f<Object> f24378e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC3912f<Object> interfaceC3912f, kotlin.coroutines.d<? super a> dVar) {
            super(1, dVar);
            this.f24378e = interfaceC3912f;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@NotNull kotlin.coroutines.d<?> dVar) {
            return new a(this.f24378e, dVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f24377d;
            if (i11 == 0) {
                Sc.s.b(obj);
                this.f24377d = 1;
                if (this.f24378e.i() == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3915i(List list, ArrayList arrayList, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f24375i = list;
        this.f24376j = arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        C3915i c3915i = new C3915i(this.f24375i, this.f24376j, dVar);
        c3915i.f24374h = obj;
        return c3915i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, kotlin.coroutines.d<Object> dVar) {
        return ((C3915i) create(obj, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0044  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        Iterator it;
        List list;
        InterfaceC3912f interfaceC3912f;
        Iterator it2;
        Object obj2;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f24373g;
        if (i11 == 0) {
            Sc.s.b(obj);
            obj = this.f24374h;
            it = this.f24375i.iterator();
            list = this.f24376j;
        } else if (i11 == 1) {
            obj2 = this.f24372f;
            InterfaceC3912f interfaceC3912f2 = this.f24371e;
            it2 = this.f24370d;
            List list2 = (List) this.f24374h;
            Sc.s.b(obj);
            interfaceC3912f = interfaceC3912f2;
            list = list2;
            if (!((Boolean) obj).booleanValue()) {
                list.add(new a(interfaceC3912f, null));
                this.f24374h = list;
                this.f24370d = it2;
                this.f24371e = null;
                this.f24372f = null;
                this.f24373g = 2;
                obj = interfaceC3912f.k(obj2, this);
                if (obj != aVar) {
                    it = it2;
                }
                return aVar;
            }
            obj = obj2;
            it = it2;
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f24370d;
            list = (List) this.f24374h;
            Sc.s.b(obj);
        }
        if (!it.hasNext()) {
            InterfaceC3912f interfaceC3912f3 = (InterfaceC3912f) it.next();
            this.f24374h = list;
            this.f24370d = it;
            this.f24371e = interfaceC3912f3;
            this.f24372f = obj;
            this.f24373g = 1;
            Object j11 = interfaceC3912f3.j(obj, this);
            if (j11 != aVar) {
                Iterator it3 = it;
                obj2 = obj;
                obj = j11;
                interfaceC3912f = interfaceC3912f3;
                it2 = it3;
                if (!((Boolean) obj).booleanValue()) {
                }
                if (!it.hasNext()) {
                    return obj;
                }
            }
            return aVar;
        }
    }
}
