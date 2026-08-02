package kotlinx.atomicfu;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u0001:\u0001\u000fB\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0006\u0010\nJ'\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0006\u0010\fJ/\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0006\u0010\u000e"}, d2 = {"Lkotlinx/atomicfu/TraceBase;", "", "<init>", "()V", "event", "", "append", "(Ljava/lang/Object;)V", "event1", "event2", "(Ljava/lang/Object;Ljava/lang/Object;)V", "event3", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "event4", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public class TraceBase {

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/atomicfu/TraceBase$None;", "Lkotlinx/atomicfu/TraceBase;", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class None extends kotlinx.atomicfu.TraceBase {
        public static final kotlinx.atomicfu.TraceBase.None INSTANCE = new kotlinx.atomicfu.TraceBase.None();

        private None() {
        }
    }

    public void append(java.lang.Object event1, java.lang.Object event2, java.lang.Object event3, java.lang.Object event4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event4, "");
    }

    public void append(java.lang.Object event1, java.lang.Object event2, java.lang.Object event3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event3, "");
    }

    public void append(java.lang.Object event1, java.lang.Object event2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event2, "");
    }

    public void append(java.lang.Object event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
    }
}
