package androidx.glance.appwidget.protobuf;

/* loaded from: classes.dex */
interface MutabilityOracle {
    public static final MutabilityOracle IMMUTABLE = new MutabilityOracle() { // from class: androidx.glance.appwidget.protobuf.MutabilityOracle.1
        @Override // androidx.glance.appwidget.protobuf.MutabilityOracle
        public void ensureMutable() {
            throw new UnsupportedOperationException();
        }
    };

    void ensureMutable();
}
