package androidx.constraintlayout.core.state.helpers;

/* loaded from: classes7.dex */
public class GridReference extends androidx.constraintlayout.core.state.HelperReference {
    private int AMEXKernelCallback;
    private int AMEXKernela;
    private int c;
    private float exchange;
    private java.lang.String init;
    private int kernelVersion;
    private java.lang.String l;
    private int release;
    private int requestGoOnline;
    private java.lang.String requestPINEntry;
    private int resetTransaction;
    private java.lang.String rsaCipher;
    private float sha1;
    private androidx.constraintlayout.core.utils.GridCore startTransaction;
    private int updateUI;

    public GridReference(androidx.constraintlayout.core.state.State state, androidx.constraintlayout.core.state.State.Helper helper) {
        super(state, helper);
        this.updateUI = 0;
        this.AMEXKernela = 0;
        this.AMEXKernelCallback = 0;
        this.release = 0;
        if (helper == androidx.constraintlayout.core.state.State.Helper.ROW) {
            this.requestGoOnline = 1;
        } else if (helper == androidx.constraintlayout.core.state.State.Helper.COLUMN) {
            this.kernelVersion = 1;
        }
    }

    public int getPaddingStart() {
        return this.updateUI;
    }

    public void setPaddingStart(int i) {
        this.updateUI = i;
    }

    public int getPaddingEnd() {
        return this.AMEXKernela;
    }

    public void setPaddingEnd(int i) {
        this.AMEXKernela = i;
    }

    public int getPaddingTop() {
        return this.AMEXKernelCallback;
    }

    public void setPaddingTop(int i) {
        this.AMEXKernelCallback = i;
    }

    public int getPaddingBottom() {
        return this.release;
    }

    public void setPaddingBottom(int i) {
        this.release = i;
    }

    public int getFlags() {
        return this.c;
    }

    public void setFlags(int i) {
        this.c = i;
    }

    public void setFlags(java.lang.String str) {
        if (str.isEmpty()) {
            return;
        }
        java.lang.String[] split = str.split("\\|");
        this.c = 0;
        for (java.lang.String str2 : split) {
            java.lang.String lowerCase = str2.toLowerCase();
            lowerCase.hashCode();
            if (lowerCase.equals("subgridbycolrow")) {
                this.c |= 1;
            } else if (lowerCase.equals("spansrespectwidgetorder")) {
                this.c |= 2;
            }
        }
    }

    public int getRowsSet() {
        return this.requestGoOnline;
    }

    public void setRowsSet(int i) {
        if (super.getType() == androidx.constraintlayout.core.state.State.Helper.COLUMN) {
            return;
        }
        this.requestGoOnline = i;
    }

    public int getColumnsSet() {
        return this.kernelVersion;
    }

    public void setColumnsSet(int i) {
        if (super.getType() == androidx.constraintlayout.core.state.State.Helper.ROW) {
            return;
        }
        this.kernelVersion = i;
    }

    public float getHorizontalGaps() {
        return this.exchange;
    }

    public void setHorizontalGaps(float f) {
        this.exchange = f;
    }

    public float getVerticalGaps() {
        return this.sha1;
    }

    public void setVerticalGaps(float f) {
        this.sha1 = f;
    }

    public java.lang.String getRowWeights() {
        return this.requestPINEntry;
    }

    public void setRowWeights(java.lang.String str) {
        this.requestPINEntry = str;
    }

    public java.lang.String getColumnWeights() {
        return this.init;
    }

    public void setColumnWeights(java.lang.String str) {
        this.init = str;
    }

    public java.lang.String getSpans() {
        return this.rsaCipher;
    }

    public void setSpans(java.lang.String str) {
        this.rsaCipher = str;
    }

    public java.lang.String getSkips() {
        return this.l;
    }

    public void setSkips(java.lang.String str) {
        this.l = str;
    }

    @Override // androidx.constraintlayout.core.state.HelperReference
    public androidx.constraintlayout.core.widgets.HelperWidget getHelperWidget() {
        if (this.startTransaction == null) {
            this.startTransaction = new androidx.constraintlayout.core.utils.GridCore();
        }
        return this.startTransaction;
    }

    @Override // androidx.constraintlayout.core.state.HelperReference
    public void setHelperWidget(androidx.constraintlayout.core.widgets.HelperWidget helperWidget) {
        if (helperWidget instanceof androidx.constraintlayout.core.utils.GridCore) {
            this.startTransaction = (androidx.constraintlayout.core.utils.GridCore) helperWidget;
        } else {
            this.startTransaction = null;
        }
    }

    public int getOrientation() {
        return this.resetTransaction;
    }

    public void setOrientation(int i) {
        this.resetTransaction = i;
    }

    @Override // androidx.constraintlayout.core.state.HelperReference, androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.Reference
    public void apply() {
        getHelperWidget();
        this.startTransaction.setOrientation(this.resetTransaction);
        int i = this.requestGoOnline;
        if (i != 0) {
            this.startTransaction.setRows(i);
        }
        int i2 = this.kernelVersion;
        if (i2 != 0) {
            this.startTransaction.setColumns(i2);
        }
        float f = this.exchange;
        if (f != 0.0f) {
            this.startTransaction.setHorizontalGaps(f);
        }
        float f2 = this.sha1;
        if (f2 != 0.0f) {
            this.startTransaction.setVerticalGaps(f2);
        }
        java.lang.String str = this.requestPINEntry;
        if (str != null && !str.isEmpty()) {
            this.startTransaction.setRowWeights(this.requestPINEntry);
        }
        java.lang.String str2 = this.init;
        if (str2 != null && !str2.isEmpty()) {
            this.startTransaction.setColumnWeights(this.init);
        }
        java.lang.String str3 = this.rsaCipher;
        if (str3 != null && !str3.isEmpty()) {
            this.startTransaction.setSpans(this.rsaCipher);
        }
        java.lang.String str4 = this.l;
        if (str4 != null && !str4.isEmpty()) {
            this.startTransaction.setSkips(this.l);
        }
        this.startTransaction.setFlags(this.c);
        this.startTransaction.setPaddingStart(this.updateUI);
        this.startTransaction.setPaddingEnd(this.AMEXKernela);
        this.startTransaction.setPaddingTop(this.AMEXKernelCallback);
        this.startTransaction.setPaddingBottom(this.release);
        applyBase();
    }
}
