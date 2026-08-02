package kotlinx.coroutines;

import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nAwait.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitKt\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,121:1\n37#2,2:122\n13346#3,2:124\n1863#4,2:126\n*S KotlinDebug\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitKt\n*L\n36#1:122,2\n47#1:124,2\n58#1:126,2\n*E\n"})
/* renamed from: kotlinx.coroutines.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1054f {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(List list, ContinuationImpl continuationImpl) {
        C1052e c1052e;
        int i;
        Iterator it;
        if (continuationImpl instanceof C1052e) {
            c1052e = (C1052e) continuationImpl;
            int i2 = c1052e.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c1052e.c = i2 - Integer.MIN_VALUE;
                Object obj = c1052e.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c1052e.c;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    it = list.iterator();
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = c1052e.a;
                    ResultKt.throwOnFailure(obj);
                }
                while (it.hasNext()) {
                    InterfaceC1120x0 interfaceC1120x0 = (InterfaceC1120x0) it.next();
                    c1052e.a = it;
                    c1052e.c = 1;
                    if (interfaceC1120x0.join(c1052e) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        c1052e = new C1052e(continuationImpl);
        Object obj2 = c1052e.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c1052e.c;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0052 -> B:10:0x0055). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(InterfaceC1120x0[] interfaceC1120x0Arr, ContinuationImpl continuationImpl) {
        C1050d c1050d;
        int i;
        int i2;
        InterfaceC1120x0[] interfaceC1120x0Arr2;
        int length;
        if (continuationImpl instanceof C1050d) {
            c1050d = (C1050d) continuationImpl;
            int i3 = c1050d.e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c1050d.e = i3 - Integer.MIN_VALUE;
                Object obj = c1050d.d;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c1050d.e;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    i2 = 0;
                    interfaceC1120x0Arr2 = interfaceC1120x0Arr;
                    length = interfaceC1120x0Arr.length;
                    if (i2 < length) {
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    length = c1050d.c;
                    i2 = c1050d.b;
                    InterfaceC1120x0[] interfaceC1120x0Arr3 = (InterfaceC1120x0[]) c1050d.a;
                    ResultKt.throwOnFailure(obj);
                    interfaceC1120x0Arr2 = interfaceC1120x0Arr3;
                    i2++;
                    if (i2 < length) {
                        InterfaceC1120x0 interfaceC1120x0 = interfaceC1120x0Arr2[i2];
                        c1050d.a = interfaceC1120x0Arr2;
                        c1050d.b = i2;
                        c1050d.c = length;
                        c1050d.e = 1;
                        if (interfaceC1120x0.join(c1050d) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        i2++;
                        if (i2 < length) {
                            return Unit.INSTANCE;
                        }
                    }
                }
            }
        }
        c1050d = new C1050d(continuationImpl);
        Object obj2 = c1050d.d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c1050d.e;
        if (i != 0) {
        }
    }
}
