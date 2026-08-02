package kotlinx.serialization.json.internal;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.DeepRecursiveFunction;
import kotlin.DeepRecursiveKt;
import kotlin.DeepRecursiveScope;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nJsonTreeReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonTreeReader.kt\nkotlinx/serialization/json/internal/JsonTreeReader\n+ 2 AbstractJsonLexer.kt\nkotlinx/serialization/json/internal/AbstractJsonLexer\n*L\n1#1,121:1\n27#1,25:122\n27#1,25:147\n513#2,3:172\n*S KotlinDebug\n*F\n+ 1 JsonTreeReader.kt\nkotlinx/serialization/json/internal/JsonTreeReader\n*L\n19#1:122,25\n24#1:147,25\n64#1:172,3\n*E\n"})
/* loaded from: classes5.dex */
public final class A {
    public final F a;
    public int b;

    public A(kotlinx.serialization.json.f configuration, F lexer) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(lexer, "lexer");
        this.a = lexer;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0079 -> B:10:0x007f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(A a, DeepRecursiveScope deepRecursiveScope, BaseContinuationImpl baseContinuationImpl) {
        z zVar;
        int i;
        byte f;
        LinkedHashMap linkedHashMap;
        F f2;
        F f3 = a.a;
        if (baseContinuationImpl instanceof z) {
            zVar = (z) baseContinuationImpl;
            int i2 = zVar.i;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zVar.i = i2 - Integer.MIN_VALUE;
                Object obj = zVar.e;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = zVar.i;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    f = f3.f((byte) 6);
                    if (f3.r() == 4) {
                        F.m(f3, "Unexpected leading comma", 0, null, 6);
                        throw null;
                    }
                    linkedHashMap = new LinkedHashMap();
                    f2 = a.a;
                    if (f2.b()) {
                    }
                    F f4 = a.a;
                    if (f == 6) {
                    }
                    return new kotlinx.serialization.json.x(linkedHashMap);
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String str = zVar.d;
                LinkedHashMap linkedHashMap2 = zVar.c;
                A a2 = zVar.b;
                DeepRecursiveScope deepRecursiveScope2 = zVar.a;
                ResultKt.throwOnFailure(obj);
                z zVar2 = zVar;
                LinkedHashMap linkedHashMap3 = linkedHashMap2;
                deepRecursiveScope = deepRecursiveScope2;
                z zVar3 = zVar2;
                linkedHashMap3.put(str, (kotlinx.serialization.json.h) obj);
                f = a2.a.e();
                if (f == 4) {
                    if (f != 7) {
                        F.m(a2.a, "Expected end of the object or comma", 0, null, 6);
                        throw null;
                    }
                    a = a2;
                    linkedHashMap = linkedHashMap3;
                    F f42 = a.a;
                    if (f == 6) {
                        f42.f((byte) 7);
                    } else if (f == 4) {
                        o.f(f42, "object");
                        throw null;
                    }
                    return new kotlinx.serialization.json.x(linkedHashMap);
                }
                a = a2;
                linkedHashMap = linkedHashMap3;
                zVar = zVar3;
                f2 = a.a;
                if (f2.b()) {
                    String i3 = f2.i();
                    f2.f((byte) 5);
                    Unit unit = Unit.INSTANCE;
                    zVar.a = deepRecursiveScope;
                    zVar.b = a;
                    zVar.c = linkedHashMap;
                    zVar.d = i3;
                    zVar.i = 1;
                    Object callRecursive = deepRecursiveScope.callRecursive(unit, zVar);
                    if (callRecursive == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    LinkedHashMap linkedHashMap4 = linkedHashMap;
                    a2 = a;
                    str = i3;
                    obj = callRecursive;
                    zVar3 = zVar;
                    linkedHashMap3 = linkedHashMap4;
                    linkedHashMap3.put(str, (kotlinx.serialization.json.h) obj);
                    f = a2.a.e();
                    if (f == 4) {
                    }
                }
                F f422 = a.a;
                if (f == 6) {
                }
                return new kotlinx.serialization.json.x(linkedHashMap);
            }
        }
        zVar = new z(a, baseContinuationImpl);
        Object obj2 = zVar.e;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zVar.i;
        if (i != 0) {
        }
    }

    public final kotlinx.serialization.json.h b() {
        kotlinx.serialization.json.h xVar;
        F f = this.a;
        byte r = f.r();
        if (r == 1) {
            return d(true);
        }
        if (r == 0) {
            return d(false);
        }
        if (r != 6) {
            if (r == 8) {
                return c();
            }
            F.m(f, "Cannot read Json element because of unexpected ".concat(com.bumptech.glide.load.data.mediastore.b.d(r)), 0, null, 6);
            throw null;
        }
        int i = this.b + 1;
        this.b = i;
        if (i == 200) {
            xVar = (kotlinx.serialization.json.h) DeepRecursiveKt.invoke(new DeepRecursiveFunction(new y(this, null)), Unit.INSTANCE);
        } else {
            byte f2 = f.f((byte) 6);
            if (f.r() == 4) {
                F.m(f, "Unexpected leading comma", 0, null, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (true) {
                if (!f.b()) {
                    break;
                }
                String i2 = f.i();
                f.f((byte) 5);
                linkedHashMap.put(i2, b());
                f2 = f.e();
                if (f2 != 4) {
                    if (f2 != 7) {
                        F.m(f, "Expected end of the object or comma", 0, null, 6);
                        throw null;
                    }
                }
            }
            if (f2 == 6) {
                f.f((byte) 7);
            } else if (f2 == 4) {
                o.f(f, "object");
                throw null;
            }
            xVar = new kotlinx.serialization.json.x(linkedHashMap);
        }
        this.b--;
        return xVar;
    }

    public final kotlinx.serialization.json.c c() {
        F f = this.a;
        byte e = f.e();
        if (f.r() == 4) {
            F.m(f, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (f.b()) {
            arrayList.add(b());
            e = f.e();
            if (e != 4) {
                boolean z = e == 9;
                int i = f.a;
                if (!z) {
                    F.m(f, "Expected end of the array or comma", i, null, 4);
                    throw null;
                }
            }
        }
        if (e == 8) {
            f.f((byte) 9);
        } else if (e == 4) {
            o.f(f, "array");
            throw null;
        }
        return new kotlinx.serialization.json.c(arrayList);
    }

    public final kotlinx.serialization.json.z d(boolean z) {
        F f = this.a;
        String j = !z ? f.j() : f.i();
        return (z || !Intrinsics.areEqual(j, "null")) ? new kotlinx.serialization.json.r(j, z) : kotlinx.serialization.json.u.INSTANCE;
    }
}
