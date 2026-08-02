package S0;

import Ae.InterfaceC2397i;
import c1.AbstractC5705I;
import c1.AbstractC5715f;
import java.util.Collection;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;
import ze.C11115c;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1", f = "SnapshotFlow.kt", l = {148, 152, 174}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class u1 extends kotlin.coroutines.jvm.internal.j implements Function2<InterfaceC2397i<Object>, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    androidx.collection.M f25534d;

    /* renamed from: e, reason: collision with root package name */
    Function1 f25535e;

    /* renamed from: f, reason: collision with root package name */
    ze.h f25536f;

    /* renamed from: g, reason: collision with root package name */
    VL.b f25537g;

    /* renamed from: h, reason: collision with root package name */
    Object f25538h;

    /* renamed from: i, reason: collision with root package name */
    int f25539i;

    /* renamed from: j, reason: collision with root package name */
    private /* synthetic */ Object f25540j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ Function0<Object> f25541k;

    static final class a extends AbstractC7737t implements Function1<Object, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.collection.M<Object> f25542b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.collection.M<Object> m11) {
            super(1);
            this.f25542b = m11;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Object obj) {
            if (obj instanceof AbstractC5705I) {
                ((AbstractC5705I) obj).x(4);
            }
            this.f25542b.d(obj);
            return Unit.f71690a;
        }
    }

    static final class b extends AbstractC7737t implements Function2<Set<? extends Object>, AbstractC5715f, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C11115c f25543b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C11115c c11115c) {
            super(2);
            this.f25543b = c11115c;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Set<? extends Object> set, AbstractC5715f abstractC5715f) {
            Set<? extends Object> set2 = set;
            if (set2 instanceof U0.c) {
                androidx.collection.X b11 = ((U0.c) set2).b();
                Object[] objArr = b11.f38663b;
                long[] jArr = b11.f38662a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i11 = 0;
                    loop0: while (true) {
                        long j11 = jArr[i11];
                        if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i12 = 8 - ((~(i11 - length)) >>> 31);
                            for (int i13 = 0; i13 < i12; i13++) {
                                if ((255 & j11) < 128) {
                                    Object obj = objArr[(i11 << 3) + i13];
                                    if (!(obj instanceof AbstractC5705I) || ((AbstractC5705I) obj).w(4)) {
                                        break loop0;
                                    }
                                }
                                j11 >>= 8;
                            }
                            if (i12 != 8) {
                                break;
                            }
                        }
                        if (i11 == length) {
                            break;
                        }
                        i11++;
                    }
                }
            } else {
                Set<? extends Object> set3 = set2;
                if (!(set3 instanceof Collection) || !set3.isEmpty()) {
                    for (Object obj2 : set3) {
                        if ((obj2 instanceof AbstractC5705I) && !((AbstractC5705I) obj2).w(4)) {
                        }
                        this.f25543b.b(set2);
                    }
                }
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    u1(Function0<Object> function0, kotlin.coroutines.d<? super u1> dVar) {
        super(2, dVar);
        this.f25541k = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        u1 u1Var = new u1(this.f25541k, dVar);
        u1Var.f25540j = obj;
        return u1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC2397i<Object> interfaceC2397i, kotlin.coroutines.d<? super Unit> dVar) {
        return ((u1) create(interfaceC2397i, dVar)).invokeSuspend(Unit.f71690a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01cc A[LOOP:0: B:18:0x00e7->B:23:0x01cc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x016f A[EDGE_INSN: B:24:0x016f->B:25:0x016f BREAK  A[LOOP:0: B:18:0x00e7->B:23:0x01cc], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0171 A[Catch: all -> 0x01b5, TRY_LEAVE, TryCatch #5 {all -> 0x01b5, blocks: (B:67:0x0129, B:21:0x0162, B:26:0x0171, B:33:0x0189, B:35:0x0192, B:72:0x0134, B:85:0x0143), top: B:66:0x0129 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v2, types: [ze.h, ze.w] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [ze.h] */
    /* JADX WARN: Type inference failed for: r7v7, types: [ze.h] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x01ae -> B:10:0x01af). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: S0.u1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
