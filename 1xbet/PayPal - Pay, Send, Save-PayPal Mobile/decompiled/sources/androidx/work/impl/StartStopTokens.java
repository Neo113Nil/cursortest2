package androidx.work.impl;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u0007\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0005\u0010\u0011J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0007\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/work/impl/StartStopTokens;", "", "Landroidx/work/impl/model/WorkGenerationalId;", "id", "Landroidx/work/impl/StartStopToken;", "tokenFor", "(Landroidx/work/impl/model/WorkGenerationalId;)Landroidx/work/impl/StartStopToken;", "remove", "", "workSpecId", "", "(Ljava/lang/String;)Ljava/util/List;", "", "contains", "(Landroidx/work/impl/model/WorkGenerationalId;)Z", "Landroidx/work/impl/model/WorkSpec;", "spec", "(Landroidx/work/impl/model/WorkSpec;)Landroidx/work/impl/StartStopToken;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface StartStopTokens {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.work.impl.StartStopTokens.Companion INSTANCE = androidx.work.impl.StartStopTokens.Companion.getHighSpeedVideoSizes;

    boolean contains(androidx.work.impl.model.WorkGenerationalId id);

    androidx.work.impl.StartStopToken remove(androidx.work.impl.model.WorkGenerationalId id);

    java.util.List<androidx.work.impl.StartStopToken> remove(java.lang.String workSpecId);

    androidx.work.impl.StartStopToken tokenFor(androidx.work.impl.model.WorkGenerationalId id);

    default androidx.work.impl.StartStopToken tokenFor(androidx.work.impl.model.WorkSpec spec) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(spec, "");
        return tokenFor(androidx.work.impl.model.WorkSpecKt.generationalId(spec));
    }

    default androidx.work.impl.StartStopToken remove(androidx.work.impl.model.WorkSpec spec) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(spec, "");
        return remove(androidx.work.impl.model.WorkSpecKt.generationalId(spec));
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/work/impl/StartStopTokens$Companion;", "", "<init>", "()V", "", "synchronized", "Landroidx/work/impl/StartStopTokens;", "create", "(Z)Landroidx/work/impl/StartStopTokens;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ androidx.work.impl.StartStopTokens.Companion getHighSpeedVideoSizes = new androidx.work.impl.StartStopTokens.Companion();

        private Companion() {
        }

        public static /* synthetic */ androidx.work.impl.StartStopTokens create$default(androidx.work.impl.StartStopTokens.Companion companion, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = true;
            }
            return companion.create(z);
        }

        @kotlin.jvm.JvmStatic
        public final androidx.work.impl.StartStopTokens create(boolean r2) {
            androidx.work.impl.StartStopTokensImpl startStopTokensImpl = new androidx.work.impl.StartStopTokensImpl();
            if (r2) {
                return new androidx.work.impl.SynchronizedStartStopTokensImpl(startStopTokensImpl);
            }
            return startStopTokensImpl;
        }

        @kotlin.jvm.JvmStatic
        public final androidx.work.impl.StartStopTokens create() {
            return create$default(this, false, 1, null);
        }
    }

    @kotlin.jvm.JvmStatic
    static androidx.work.impl.StartStopTokens create(boolean z) {
        return INSTANCE.create(z);
    }

    @kotlin.jvm.JvmStatic
    static androidx.work.impl.StartStopTokens create() {
        return INSTANCE.create();
    }
}
