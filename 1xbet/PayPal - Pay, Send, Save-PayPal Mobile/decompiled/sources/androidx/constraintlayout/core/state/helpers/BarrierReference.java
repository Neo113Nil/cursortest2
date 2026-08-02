package androidx.constraintlayout.core.state.helpers;

/* loaded from: classes7.dex */
public class BarrierReference extends androidx.constraintlayout.core.state.HelperReference {
    private int c;
    private androidx.constraintlayout.core.state.State.Direction init;
    private androidx.constraintlayout.core.widgets.Barrier kernelVersion;

    public BarrierReference(androidx.constraintlayout.core.state.State state) {
        super(state, androidx.constraintlayout.core.state.State.Helper.BARRIER);
    }

    public void setBarrierDirection(androidx.constraintlayout.core.state.State.Direction direction) {
        this.init = direction;
    }

    @Override // androidx.constraintlayout.core.state.ConstraintReference
    public androidx.constraintlayout.core.state.ConstraintReference margin(java.lang.Object obj) {
        margin(this.mHelperState.convertDimension(obj));
        return this;
    }

    @Override // androidx.constraintlayout.core.state.ConstraintReference
    public androidx.constraintlayout.core.state.ConstraintReference margin(int i) {
        this.c = i;
        return this;
    }

    @Override // androidx.constraintlayout.core.state.HelperReference
    public androidx.constraintlayout.core.widgets.HelperWidget getHelperWidget() {
        if (this.kernelVersion == null) {
            this.kernelVersion = new androidx.constraintlayout.core.widgets.Barrier();
        }
        return this.kernelVersion;
    }

    @Override // androidx.constraintlayout.core.state.HelperReference, androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.Reference
    public void apply() {
        getHelperWidget();
        int i = androidx.constraintlayout.core.state.helpers.BarrierReference.AnonymousClass1.getHighSpeedVideoFpsRangesFor[this.init.ordinal()];
        int i2 = 3;
        if (i == 3 || i == 4) {
            i2 = 1;
        } else if (i == 5) {
            i2 = 2;
        } else if (i != 6) {
            i2 = 0;
        }
        this.kernelVersion.setBarrierType(i2);
        this.kernelVersion.setMargin(this.c);
    }

    /* renamed from: androidx.constraintlayout.core.state.helpers.BarrierReference$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighSpeedVideoFpsRangesFor;

        static {
            int[] iArr = new int[androidx.constraintlayout.core.state.State.Direction.values().length];
            getHighSpeedVideoFpsRangesFor = iArr;
            try {
                iArr[androidx.constraintlayout.core.state.State.Direction.LEFT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[androidx.constraintlayout.core.state.State.Direction.START.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[androidx.constraintlayout.core.state.State.Direction.RIGHT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[androidx.constraintlayout.core.state.State.Direction.END.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[androidx.constraintlayout.core.state.State.Direction.TOP.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[androidx.constraintlayout.core.state.State.Direction.BOTTOM.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
        }
    }
}
