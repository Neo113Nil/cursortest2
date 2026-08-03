package androidx.work.impl.model;

/* compiled from: WorkTypeConverters.kt */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004\u001c\u001d\u001e\u001fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0004H\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0004H\u0007J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u0004H\u0007J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u0004H\u0007J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u000fH\u0007J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0011H\u0007J\u0016\u0010\u0018\u001a\u00020\u000b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0013H\u0007¨\u0006 "}, d2 = {"Landroidx/work/impl/model/WorkTypeConverters;", "", "()V", "backoffPolicyToInt", "", "backoffPolicy", "Landroidx/work/BackoffPolicy;", "byteArrayToSetOfTriggers", "", "Landroidx/work/Constraints$ContentUriTrigger;", "bytes", "", "intToBackoffPolicy", "value", "intToNetworkType", "Landroidx/work/NetworkType;", "intToOutOfQuotaPolicy", "Landroidx/work/OutOfQuotaPolicy;", "intToState", "Landroidx/work/WorkInfo$State;", "networkTypeToInt", "networkType", "outOfQuotaPolicyToInt", "policy", "setOfTriggersToByteArray", "triggers", "stateToInt", "state", "BackoffPolicyIds", "NetworkTypeIds", "OutOfPolicyIds", "StateIds", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class WorkTypeConverters {
    public static final androidx.work.impl.model.WorkTypeConverters INSTANCE = new androidx.work.impl.model.WorkTypeConverters();

    /* compiled from: WorkTypeConverters.kt */
    @kotlin.Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[androidx.work.WorkInfo.State.values().length];
            try {
                iArr[androidx.work.WorkInfo.State.ENQUEUED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.work.WorkInfo.State.RUNNING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.work.WorkInfo.State.SUCCEEDED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[androidx.work.WorkInfo.State.FAILED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[androidx.work.WorkInfo.State.BLOCKED.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[androidx.work.WorkInfo.State.CANCELLED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[androidx.work.BackoffPolicy.values().length];
            try {
                iArr2[androidx.work.BackoffPolicy.EXPONENTIAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[androidx.work.BackoffPolicy.LINEAR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[androidx.work.NetworkType.values().length];
            try {
                iArr3[androidx.work.NetworkType.NOT_REQUIRED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr3[androidx.work.NetworkType.CONNECTED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr3[androidx.work.NetworkType.UNMETERED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr3[androidx.work.NetworkType.NOT_ROAMING.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr3[androidx.work.NetworkType.METERED.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[androidx.work.OutOfQuotaPolicy.values().length];
            try {
                iArr4[androidx.work.OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                iArr4[androidx.work.OutOfQuotaPolicy.DROP_WORK_REQUEST.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    private WorkTypeConverters() {
    }

    /* compiled from: WorkTypeConverters.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Landroidx/work/impl/model/WorkTypeConverters$StateIds;", "", "()V", "BLOCKED", "", "CANCELLED", "COMPLETED_STATES", "", "ENQUEUED", "FAILED", kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt.RUNNING, "SUCCEEDED", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class StateIds {
        public static final int BLOCKED = 4;
        public static final int CANCELLED = 5;
        public static final java.lang.String COMPLETED_STATES = "(2, 3, 5)";
        public static final int ENQUEUED = 0;
        public static final int FAILED = 3;
        public static final androidx.work.impl.model.WorkTypeConverters.StateIds INSTANCE = new androidx.work.impl.model.WorkTypeConverters.StateIds();
        public static final int RUNNING = 1;
        public static final int SUCCEEDED = 2;

        private StateIds() {
        }
    }

    /* compiled from: WorkTypeConverters.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Landroidx/work/impl/model/WorkTypeConverters$BackoffPolicyIds;", "", "()V", "EXPONENTIAL", "", "LINEAR", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    private static final class BackoffPolicyIds {
        public static final int EXPONENTIAL = 0;
        public static final androidx.work.impl.model.WorkTypeConverters.BackoffPolicyIds INSTANCE = new androidx.work.impl.model.WorkTypeConverters.BackoffPolicyIds();
        public static final int LINEAR = 1;

        private BackoffPolicyIds() {
        }
    }

    /* compiled from: WorkTypeConverters.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Landroidx/work/impl/model/WorkTypeConverters$NetworkTypeIds;", "", "()V", "CONNECTED", "", "METERED", "NOT_REQUIRED", "NOT_ROAMING", "TEMPORARILY_UNMETERED", "UNMETERED", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    private static final class NetworkTypeIds {
        public static final int CONNECTED = 1;
        public static final androidx.work.impl.model.WorkTypeConverters.NetworkTypeIds INSTANCE = new androidx.work.impl.model.WorkTypeConverters.NetworkTypeIds();
        public static final int METERED = 4;
        public static final int NOT_REQUIRED = 0;
        public static final int NOT_ROAMING = 3;
        public static final int TEMPORARILY_UNMETERED = 5;
        public static final int UNMETERED = 2;

        private NetworkTypeIds() {
        }
    }

    /* compiled from: WorkTypeConverters.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Landroidx/work/impl/model/WorkTypeConverters$OutOfPolicyIds;", "", "()V", "DROP_WORK_REQUEST", "", "RUN_AS_NON_EXPEDITED_WORK_REQUEST", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    private static final class OutOfPolicyIds {
        public static final int DROP_WORK_REQUEST = 1;
        public static final androidx.work.impl.model.WorkTypeConverters.OutOfPolicyIds INSTANCE = new androidx.work.impl.model.WorkTypeConverters.OutOfPolicyIds();
        public static final int RUN_AS_NON_EXPEDITED_WORK_REQUEST = 0;

        private OutOfPolicyIds() {
        }
    }

    @kotlin.jvm.JvmStatic
    public static final int stateToInt(androidx.work.WorkInfo.State state) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "state");
        switch (androidx.work.impl.model.WorkTypeConverters.WhenMappings.$EnumSwitchMapping$0[state.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.work.WorkInfo.State intToState(int value) {
        if (value == 0) {
            return androidx.work.WorkInfo.State.ENQUEUED;
        }
        if (value == 1) {
            return androidx.work.WorkInfo.State.RUNNING;
        }
        if (value == 2) {
            return androidx.work.WorkInfo.State.SUCCEEDED;
        }
        if (value == 3) {
            return androidx.work.WorkInfo.State.FAILED;
        }
        if (value == 4) {
            return androidx.work.WorkInfo.State.BLOCKED;
        }
        if (value == 5) {
            return androidx.work.WorkInfo.State.CANCELLED;
        }
        throw new java.lang.IllegalArgumentException("Could not convert " + value + " to State");
    }

    @kotlin.jvm.JvmStatic
    public static final int backoffPolicyToInt(androidx.work.BackoffPolicy backoffPolicy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
        int i = androidx.work.impl.model.WorkTypeConverters.WhenMappings.$EnumSwitchMapping$1[backoffPolicy.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.work.BackoffPolicy intToBackoffPolicy(int value) {
        if (value == 0) {
            return androidx.work.BackoffPolicy.EXPONENTIAL;
        }
        if (value == 1) {
            return androidx.work.BackoffPolicy.LINEAR;
        }
        throw new java.lang.IllegalArgumentException("Could not convert " + value + " to BackoffPolicy");
    }

    @kotlin.jvm.JvmStatic
    public static final int networkTypeToInt(androidx.work.NetworkType networkType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkType, "networkType");
        int i = androidx.work.impl.model.WorkTypeConverters.WhenMappings.$EnumSwitchMapping$2[networkType.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return 3;
        }
        if (i == 5) {
            return 4;
        }
        if (android.os.Build.VERSION.SDK_INT >= 30 && networkType == androidx.work.NetworkType.TEMPORARILY_UNMETERED) {
            return 5;
        }
        throw new java.lang.IllegalArgumentException("Could not convert " + networkType + " to int");
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.work.NetworkType intToNetworkType(int value) {
        if (value == 0) {
            return androidx.work.NetworkType.NOT_REQUIRED;
        }
        if (value == 1) {
            return androidx.work.NetworkType.CONNECTED;
        }
        if (value == 2) {
            return androidx.work.NetworkType.UNMETERED;
        }
        if (value == 3) {
            return androidx.work.NetworkType.NOT_ROAMING;
        }
        if (value == 4) {
            return androidx.work.NetworkType.METERED;
        }
        if (android.os.Build.VERSION.SDK_INT >= 30 && value == 5) {
            return androidx.work.NetworkType.TEMPORARILY_UNMETERED;
        }
        throw new java.lang.IllegalArgumentException("Could not convert " + value + " to NetworkType");
    }

    @kotlin.jvm.JvmStatic
    public static final int outOfQuotaPolicyToInt(androidx.work.OutOfQuotaPolicy policy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(policy, "policy");
        int i = androidx.work.impl.model.WorkTypeConverters.WhenMappings.$EnumSwitchMapping$3[policy.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.work.OutOfQuotaPolicy intToOutOfQuotaPolicy(int value) {
        if (value == 0) {
            return androidx.work.OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        }
        if (value == 1) {
            return androidx.work.OutOfQuotaPolicy.DROP_WORK_REQUEST;
        }
        throw new java.lang.IllegalArgumentException("Could not convert " + value + " to OutOfQuotaPolicy");
    }

    @kotlin.jvm.JvmStatic
    public static final byte[] setOfTriggersToByteArray(java.util.Set<androidx.work.Constraints.ContentUriTrigger> triggers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(triggers, "triggers");
        if (triggers.isEmpty()) {
            return new byte[0];
        }
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        java.io.ObjectOutputStream objectOutputStream = byteArrayOutputStream;
        try {
            java.io.ByteArrayOutputStream byteArrayOutputStream2 = objectOutputStream;
            objectOutputStream = new java.io.ObjectOutputStream(byteArrayOutputStream);
            try {
                java.io.ObjectOutputStream objectOutputStream2 = objectOutputStream;
                objectOutputStream2.writeInt(triggers.size());
                for (androidx.work.Constraints.ContentUriTrigger contentUriTrigger : triggers) {
                    objectOutputStream2.writeUTF(contentUriTrigger.getUri().toString());
                    objectOutputStream2.writeBoolean(contentUriTrigger.getIsTriggeredForDescendants());
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                kotlin.io.CloseableKt.closeFinally(objectOutputStream, null);
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                kotlin.io.CloseableKt.closeFinally(objectOutputStream, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteArray, "outputStream.toByteArray()");
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.Set<androidx.work.Constraints.ContentUriTrigger> byteArrayToSetOfTriggers(byte[] bytes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bytes, "bytes");
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        if (bytes.length == 0) {
            return linkedHashSet;
        }
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bytes);
        java.io.ObjectInputStream objectInputStream = byteArrayInputStream;
        try {
            java.io.ByteArrayInputStream byteArrayInputStream2 = objectInputStream;
            try {
                objectInputStream = new java.io.ObjectInputStream(byteArrayInputStream);
            } catch (java.io.IOException e) {
                e.printStackTrace();
            }
            try {
                java.io.ObjectInputStream objectInputStream2 = objectInputStream;
                int readInt = objectInputStream2.readInt();
                for (int i = 0; i < readInt; i++) {
                    android.net.Uri uri = android.net.Uri.parse(objectInputStream2.readUTF());
                    boolean readBoolean = objectInputStream2.readBoolean();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uri, "uri");
                    linkedHashSet.add(new androidx.work.Constraints.ContentUriTrigger(uri, readBoolean));
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                kotlin.io.CloseableKt.closeFinally(objectInputStream, null);
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                kotlin.io.CloseableKt.closeFinally(objectInputStream, null);
                return linkedHashSet;
            } finally {
            }
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }
}
