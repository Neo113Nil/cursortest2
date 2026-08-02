package androidx.glance.session;

import androidx.compose.runtime.snapshots.ObserverHandle;
import androidx.compose.runtime.snapshots.Snapshot;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.b;
import kotlinx.coroutines.channels.i;
import kotlinx.coroutines.channels.j;
import kotlinx.coroutines.channels.v;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0000\u001a\u00020\u0001H\u0080@ø\u0001\u0000¢\u0006\u0002\u0010\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0003"}, d2 = {"globalSnapshotMonitor", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "glance_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGlobalSnapshotManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GlobalSnapshotManager.kt\nandroidx/glance/session/GlobalSnapshotManagerKt\n+ 2 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt\n*L\n1#1,72:1\n103#2:73\n80#2,6:74\n104#2,2:80\n90#2:82\n86#2,4:83\n*S KotlinDebug\n*F\n+ 1 GlobalSnapshotManager.kt\nandroidx/glance/session/GlobalSnapshotManagerKt\n*L\n65#1:73\n65#1:74,6\n65#1:80,2\n65#1:82\n65#1:83,4\n*E\n"})
/* loaded from: classes.dex */
public final class GlobalSnapshotManagerKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0071 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #1 {all -> 0x0036, blocks: (B:11:0x0032, B:12:0x0069, B:14:0x0071, B:15:0x005a, B:26:0x0054), top: B:7:0x0022, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007d A[Catch: all -> 0x0086, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0086, blocks: (B:19:0x007d, B:35:0x008a, B:36:0x008d, B:11:0x0032, B:12:0x0069, B:14:0x0071, B:15:0x005a, B:26:0x0054, B:32:0x0088), top: B:7:0x0022, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r5v5, types: [kotlinx.coroutines.channels.v] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0066 -> B:12:0x0069). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object globalSnapshotMonitor(Continuation<? super Unit> continuation) {
        GlobalSnapshotManagerKt$globalSnapshotMonitor$1 globalSnapshotManagerKt$globalSnapshotMonitor$1;
        int i;
        ObserverHandle registerGlobalWriteObserver;
        i aVar;
        b bVar;
        b bVar2;
        try {
            try {
                if (continuation instanceof GlobalSnapshotManagerKt$globalSnapshotMonitor$1) {
                    globalSnapshotManagerKt$globalSnapshotMonitor$1 = (GlobalSnapshotManagerKt$globalSnapshotMonitor$1) continuation;
                    int i2 = globalSnapshotManagerKt$globalSnapshotMonitor$1.label;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        globalSnapshotManagerKt$globalSnapshotMonitor$1.label = i2 - Integer.MIN_VALUE;
                        Object obj = globalSnapshotManagerKt$globalSnapshotMonitor$1.result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = globalSnapshotManagerKt$globalSnapshotMonitor$1.label;
                        if (i != 0) {
                            ResultKt.throwOnFailure(obj);
                            final b a = j.a(-1, null, 6);
                            registerGlobalWriteObserver = Snapshot.INSTANCE.registerGlobalWriteObserver(new Function1<Object, Unit>() { // from class: androidx.glance.session.GlobalSnapshotManagerKt$globalSnapshotMonitor$observerHandle$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Object obj2) {
                                    invoke2(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(Object obj2) {
                                    a.c(Unit.INSTANCE);
                                }
                            });
                            aVar = new b.a();
                            bVar = a;
                            globalSnapshotManagerKt$globalSnapshotMonitor$1.L$0 = registerGlobalWriteObserver;
                            globalSnapshotManagerKt$globalSnapshotMonitor$1.L$1 = bVar;
                            globalSnapshotManagerKt$globalSnapshotMonitor$1.L$2 = aVar;
                            globalSnapshotManagerKt$globalSnapshotMonitor$1.label = 1;
                            obj = aVar.b(globalSnapshotManagerKt$globalSnapshotMonitor$1);
                            bVar2 = bVar;
                            if (obj == coroutine_suspended) {
                            }
                            if (((Boolean) obj).booleanValue()) {
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aVar = (i) globalSnapshotManagerKt$globalSnapshotMonitor$1.L$2;
                            ?? r5 = (v) globalSnapshotManagerKt$globalSnapshotMonitor$1.L$1;
                            registerGlobalWriteObserver = (ObserverHandle) globalSnapshotManagerKt$globalSnapshotMonitor$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            bVar2 = r5;
                            if (((Boolean) obj).booleanValue()) {
                                Snapshot.INSTANCE.sendApplyNotifications();
                                bVar = bVar2;
                                globalSnapshotManagerKt$globalSnapshotMonitor$1.L$0 = registerGlobalWriteObserver;
                                globalSnapshotManagerKt$globalSnapshotMonitor$1.L$1 = bVar;
                                globalSnapshotManagerKt$globalSnapshotMonitor$1.L$2 = aVar;
                                globalSnapshotManagerKt$globalSnapshotMonitor$1.label = 1;
                                obj = aVar.b(globalSnapshotManagerKt$globalSnapshotMonitor$1);
                                bVar2 = bVar;
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                if (((Boolean) obj).booleanValue()) {
                                    bVar2.cancel(null);
                                    registerGlobalWriteObserver.dispose();
                                    return Unit.INSTANCE;
                                }
                            }
                        }
                    }
                }
                if (i != 0) {
                }
            } finally {
            }
        } catch (Throwable th) {
            registerGlobalWriteObserver.dispose();
            throw th;
        }
        globalSnapshotManagerKt$globalSnapshotMonitor$1 = new GlobalSnapshotManagerKt$globalSnapshotMonitor$1(continuation);
        Object obj2 = globalSnapshotManagerKt$globalSnapshotMonitor$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = globalSnapshotManagerKt$globalSnapshotMonitor$1.label;
    }
}
