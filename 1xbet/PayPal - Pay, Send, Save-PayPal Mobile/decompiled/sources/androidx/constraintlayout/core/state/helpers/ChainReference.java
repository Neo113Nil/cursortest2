package androidx.constraintlayout.core.state.helpers;

/* loaded from: classes7.dex */
public class ChainReference extends androidx.constraintlayout.core.state.HelperReference {
    private java.util.HashMap<java.lang.String, java.lang.Float> c;
    private java.util.HashMap<java.lang.String, java.lang.Float> init;
    protected float mBias;

    @java.lang.Deprecated
    protected java.util.HashMap<java.lang.String, java.lang.Float> mMapPostMargin;

    @java.lang.Deprecated
    protected java.util.HashMap<java.lang.String, java.lang.Float> mMapPreMargin;

    @java.lang.Deprecated
    protected java.util.HashMap<java.lang.String, java.lang.Float> mMapWeights;
    protected androidx.constraintlayout.core.state.State.Chain mStyle;

    public ChainReference(androidx.constraintlayout.core.state.State state, androidx.constraintlayout.core.state.State.Helper helper) {
        super(state, helper);
        this.mBias = 0.5f;
        this.mMapWeights = new java.util.HashMap<>();
        this.mMapPreMargin = new java.util.HashMap<>();
        this.mMapPostMargin = new java.util.HashMap<>();
        this.mStyle = androidx.constraintlayout.core.state.State.Chain.SPREAD;
    }

    public androidx.constraintlayout.core.state.State.Chain getStyle() {
        return androidx.constraintlayout.core.state.State.Chain.SPREAD;
    }

    public androidx.constraintlayout.core.state.helpers.ChainReference style(androidx.constraintlayout.core.state.State.Chain chain) {
        this.mStyle = chain;
        return this;
    }

    public void addChainElement(java.lang.String str, float f, float f2, float f3) {
        addChainElement(str, f, f2, f3, 0.0f, 0.0f);
    }

    public void addChainElement(java.lang.Object obj, float f, float f2, float f3, float f4, float f5) {
        super.add(obj);
        java.lang.String obj2 = obj.toString();
        if (!java.lang.Float.isNaN(f)) {
            this.mMapWeights.put(obj2, java.lang.Float.valueOf(f));
        }
        if (!java.lang.Float.isNaN(f2)) {
            this.mMapPreMargin.put(obj2, java.lang.Float.valueOf(f2));
        }
        if (!java.lang.Float.isNaN(f3)) {
            this.mMapPostMargin.put(obj2, java.lang.Float.valueOf(f3));
        }
        if (!java.lang.Float.isNaN(f4)) {
            if (this.init == null) {
                this.init = new java.util.HashMap<>();
            }
            this.init.put(obj2, java.lang.Float.valueOf(f4));
        }
        if (java.lang.Float.isNaN(f5)) {
            return;
        }
        if (this.c == null) {
            this.c = new java.util.HashMap<>();
        }
        this.c.put(obj2, java.lang.Float.valueOf(f5));
    }

    protected float getWeight(java.lang.String str) {
        if (this.mMapWeights.containsKey(str)) {
            return this.mMapWeights.get(str).floatValue();
        }
        return -1.0f;
    }

    protected float getPostMargin(java.lang.String str) {
        if (this.mMapPostMargin.containsKey(str)) {
            return this.mMapPostMargin.get(str).floatValue();
        }
        return 0.0f;
    }

    protected float getPreMargin(java.lang.String str) {
        if (this.mMapPreMargin.containsKey(str)) {
            return this.mMapPreMargin.get(str).floatValue();
        }
        return 0.0f;
    }

    final float Camera2StreamConfigurationMap(java.lang.String str) {
        java.util.HashMap<java.lang.String, java.lang.Float> hashMap = this.c;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return 0.0f;
        }
        return this.c.get(str).floatValue();
    }

    final float getHighSpeedVideoFpsRanges(java.lang.String str) {
        java.util.HashMap<java.lang.String, java.lang.Float> hashMap = this.init;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return 0.0f;
        }
        return this.init.get(str).floatValue();
    }

    public float getBias() {
        return this.mBias;
    }

    @Override // androidx.constraintlayout.core.state.ConstraintReference
    public androidx.constraintlayout.core.state.helpers.ChainReference bias(float f) {
        this.mBias = f;
        return this;
    }
}
