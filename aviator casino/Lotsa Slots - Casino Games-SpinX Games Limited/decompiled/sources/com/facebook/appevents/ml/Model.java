package com.facebook.appevents.ml;

/* compiled from: Model.kt */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001b\b\u0002\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\u0006J+\u0010\u0014\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0015\u001a\u00020\u00052\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00172\u0006\u0010\u0018\u001a\u00020\u0004¢\u0006\u0002\u0010\u0019R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/facebook/appevents/ml/Model;", "", "weights", "", "", "Lcom/facebook/appevents/ml/MTensor;", "(Ljava/util/Map;)V", "convs0Bias", "convs0Weight", "convs1Bias", "convs1Weight", "convs2Bias", "convs2Weight", "embedding", "fc1Bias", "fc1Weight", "fc2Bias", "fc2Weight", "finalWeights", "", "predictOnMTML", "dense", "texts", "", "task", "(Lcom/facebook/appevents/ml/MTensor;[Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/appevents/ml/MTensor;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class Model {
    private static final int SEQ_LEN = 128;
    private final com.facebook.appevents.ml.MTensor convs0Bias;
    private final com.facebook.appevents.ml.MTensor convs0Weight;
    private final com.facebook.appevents.ml.MTensor convs1Bias;
    private final com.facebook.appevents.ml.MTensor convs1Weight;
    private final com.facebook.appevents.ml.MTensor convs2Bias;
    private final com.facebook.appevents.ml.MTensor convs2Weight;
    private final com.facebook.appevents.ml.MTensor embedding;
    private final com.facebook.appevents.ml.MTensor fc1Bias;
    private final com.facebook.appevents.ml.MTensor fc1Weight;
    private final com.facebook.appevents.ml.MTensor fc2Bias;
    private final com.facebook.appevents.ml.MTensor fc2Weight;
    private final java.util.Map<java.lang.String, com.facebook.appevents.ml.MTensor> finalWeights;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.facebook.appevents.ml.Model.Companion INSTANCE = new com.facebook.appevents.ml.Model.Companion(null);
    private static final java.util.Map<java.lang.String, java.lang.String> mapping = kotlin.collections.MapsKt.hashMapOf(kotlin.TuplesKt.to("embedding.weight", "embed.weight"), kotlin.TuplesKt.to("dense1.weight", "fc1.weight"), kotlin.TuplesKt.to("dense2.weight", "fc2.weight"), kotlin.TuplesKt.to("dense3.weight", "fc3.weight"), kotlin.TuplesKt.to("dense1.bias", "fc1.bias"), kotlin.TuplesKt.to("dense2.bias", "fc2.bias"), kotlin.TuplesKt.to("dense3.bias", "fc3.bias"));

    public /* synthetic */ Model(java.util.Map map, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }

    private Model(java.util.Map<java.lang.String, com.facebook.appevents.ml.MTensor> map) {
        com.facebook.appevents.ml.MTensor mTensor = map.get("embed.weight");
        if (mTensor == null) {
            throw new java.lang.IllegalStateException("Required value was null.".toString());
        }
        this.embedding = mTensor;
        com.facebook.appevents.ml.Operator operator = com.facebook.appevents.ml.Operator.INSTANCE;
        com.facebook.appevents.ml.MTensor mTensor2 = map.get("convs.0.weight");
        if (mTensor2 == null) {
            throw new java.lang.IllegalStateException("Required value was null.".toString());
        }
        this.convs0Weight = com.facebook.appevents.ml.Operator.transpose3D(mTensor2);
        com.facebook.appevents.ml.Operator operator2 = com.facebook.appevents.ml.Operator.INSTANCE;
        com.facebook.appevents.ml.MTensor mTensor3 = map.get("convs.1.weight");
        if (mTensor3 == null) {
            throw new java.lang.IllegalStateException("Required value was null.".toString());
        }
        this.convs1Weight = com.facebook.appevents.ml.Operator.transpose3D(mTensor3);
        com.facebook.appevents.ml.Operator operator3 = com.facebook.appevents.ml.Operator.INSTANCE;
        com.facebook.appevents.ml.MTensor mTensor4 = map.get("convs.2.weight");
        if (mTensor4 == null) {
            throw new java.lang.IllegalStateException("Required value was null.".toString());
        }
        this.convs2Weight = com.facebook.appevents.ml.Operator.transpose3D(mTensor4);
        com.facebook.appevents.ml.MTensor mTensor5 = map.get("convs.0.bias");
        if (mTensor5 == null) {
            throw new java.lang.IllegalStateException("Required value was null.".toString());
        }
        this.convs0Bias = mTensor5;
        com.facebook.appevents.ml.MTensor mTensor6 = map.get("convs.1.bias");
        if (mTensor6 == null) {
            throw new java.lang.IllegalStateException("Required value was null.".toString());
        }
        this.convs1Bias = mTensor6;
        com.facebook.appevents.ml.MTensor mTensor7 = map.get("convs.2.bias");
        if (mTensor7 == null) {
            throw new java.lang.IllegalStateException("Required value was null.".toString());
        }
        this.convs2Bias = mTensor7;
        com.facebook.appevents.ml.Operator operator4 = com.facebook.appevents.ml.Operator.INSTANCE;
        com.facebook.appevents.ml.MTensor mTensor8 = map.get("fc1.weight");
        if (mTensor8 == null) {
            throw new java.lang.IllegalStateException("Required value was null.".toString());
        }
        this.fc1Weight = com.facebook.appevents.ml.Operator.transpose2D(mTensor8);
        com.facebook.appevents.ml.Operator operator5 = com.facebook.appevents.ml.Operator.INSTANCE;
        com.facebook.appevents.ml.MTensor mTensor9 = map.get("fc2.weight");
        if (mTensor9 == null) {
            throw new java.lang.IllegalStateException("Required value was null.".toString());
        }
        this.fc2Weight = com.facebook.appevents.ml.Operator.transpose2D(mTensor9);
        com.facebook.appevents.ml.MTensor mTensor10 = map.get("fc1.bias");
        if (mTensor10 == null) {
            throw new java.lang.IllegalStateException("Required value was null.".toString());
        }
        this.fc1Bias = mTensor10;
        com.facebook.appevents.ml.MTensor mTensor11 = map.get("fc2.bias");
        if (mTensor11 == null) {
            throw new java.lang.IllegalStateException("Required value was null.".toString());
        }
        this.fc2Bias = mTensor11;
        this.finalWeights = new java.util.HashMap();
        for (java.lang.String str : kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.String[]{com.facebook.appevents.ml.ModelManager.Task.MTML_INTEGRITY_DETECT.toKey(), com.facebook.appevents.ml.ModelManager.Task.MTML_APP_EVENT_PREDICTION.toKey()})) {
            java.lang.String stringPlus = kotlin.jvm.internal.Intrinsics.stringPlus(str, ".weight");
            java.lang.String stringPlus2 = kotlin.jvm.internal.Intrinsics.stringPlus(str, ".bias");
            com.facebook.appevents.ml.MTensor mTensor12 = map.get(stringPlus);
            com.facebook.appevents.ml.MTensor mTensor13 = map.get(stringPlus2);
            if (mTensor12 != null) {
                com.facebook.appevents.ml.Operator operator6 = com.facebook.appevents.ml.Operator.INSTANCE;
                this.finalWeights.put(stringPlus, com.facebook.appevents.ml.Operator.transpose2D(mTensor12));
            }
            if (mTensor13 != null) {
                this.finalWeights.put(stringPlus2, mTensor13);
            }
        }
    }

    public static final /* synthetic */ java.util.Map access$getMapping$cp() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.ml.Model.class)) {
            return null;
        }
        try {
            return mapping;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.ml.Model.class);
            return null;
        }
    }

    public final com.facebook.appevents.ml.MTensor predictOnMTML(com.facebook.appevents.ml.MTensor dense, java.lang.String[] texts, java.lang.String task) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dense, "dense");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(texts, "texts");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "task");
            com.facebook.appevents.ml.Operator operator = com.facebook.appevents.ml.Operator.INSTANCE;
            com.facebook.appevents.ml.MTensor embedding = com.facebook.appevents.ml.Operator.embedding(texts, 128, this.embedding);
            com.facebook.appevents.ml.Operator operator2 = com.facebook.appevents.ml.Operator.INSTANCE;
            com.facebook.appevents.ml.MTensor conv1D = com.facebook.appevents.ml.Operator.conv1D(embedding, this.convs0Weight);
            com.facebook.appevents.ml.Operator operator3 = com.facebook.appevents.ml.Operator.INSTANCE;
            com.facebook.appevents.ml.Operator.addmv(conv1D, this.convs0Bias);
            com.facebook.appevents.ml.Operator operator4 = com.facebook.appevents.ml.Operator.INSTANCE;
            com.facebook.appevents.ml.Operator.relu(conv1D);
            com.facebook.appevents.ml.Operator operator5 = com.facebook.appevents.ml.Operator.INSTANCE;
            com.facebook.appevents.ml.MTensor conv1D2 = com.facebook.appevents.ml.Operator.conv1D(conv1D, this.convs1Weight);
            com.facebook.appevents.ml.Operator operator6 = com.facebook.appevents.ml.Operator.INSTANCE;
            com.facebook.appevents.ml.Operator.addmv(conv1D2, this.convs1Bias);
            com.facebook.appevents.ml.Operator operator7 = com.facebook.appevents.ml.Operator.INSTANCE;
            com.facebook.appevents.ml.Operator.relu(conv1D2);
            com.facebook.appevents.ml.Operator operator8 = com.facebook.appevents.ml.Operator.INSTANCE;
            com.facebook.appevents.ml.MTensor maxPool1D = com.facebook.appevents.ml.Operator.maxPool1D(conv1D2, 2);
            com.facebook.appevents.ml.Operator operator9 = com.facebook.appevents.ml.Operator.INSTANCE;
            com.facebook.appevents.ml.MTensor conv1D3 = com.facebook.appevents.ml.Operator.conv1D(maxPool1D, this.convs2Weight);
            com.facebook.appevents.ml.Operator operator10 = com.facebook.appevents.ml.Operator.INSTANCE;
            com.facebook.appevents.ml.Operator.addmv(conv1D3, this.convs2Bias);
            com.facebook.appevents.ml.Operator operator11 = com.facebook.appevents.ml.Operator.INSTANCE;
            com.facebook.appevents.ml.Operator.relu(conv1D3);
            com.facebook.appevents.ml.Operator operator12 = com.facebook.appevents.ml.Operator.INSTANCE;
            com.facebook.appevents.ml.MTensor maxPool1D2 = com.facebook.appevents.ml.Operator.maxPool1D(conv1D, conv1D.getShape(1));
            com.facebook.appevents.ml.Operator operator13 = com.facebook.appevents.ml.Operator.INSTANCE;
            com.facebook.appevents.ml.MTensor maxPool1D3 = com.facebook.appevents.ml.Operator.maxPool1D(maxPool1D, maxPool1D.getShape(1));
            com.facebook.appevents.ml.Operator operator14 = com.facebook.appevents.ml.Operator.INSTANCE;
            com.facebook.appevents.ml.MTensor maxPool1D4 = com.facebook.appevents.ml.Operator.maxPool1D(conv1D3, conv1D3.getShape(1));
            com.facebook.appevents.ml.Operator operator15 = com.facebook.appevents.ml.Operator.INSTANCE;
            com.facebook.appevents.ml.Operator.flatten(maxPool1D2, 1);
            com.facebook.appevents.ml.Operator operator16 = com.facebook.appevents.ml.Operator.INSTANCE;
            com.facebook.appevents.ml.Operator.flatten(maxPool1D3, 1);
            com.facebook.appevents.ml.Operator operator17 = com.facebook.appevents.ml.Operator.INSTANCE;
            com.facebook.appevents.ml.Operator.flatten(maxPool1D4, 1);
            com.facebook.appevents.ml.Operator operator18 = com.facebook.appevents.ml.Operator.INSTANCE;
            com.facebook.appevents.ml.MTensor concatenate = com.facebook.appevents.ml.Operator.concatenate(new com.facebook.appevents.ml.MTensor[]{maxPool1D2, maxPool1D3, maxPool1D4, dense});
            com.facebook.appevents.ml.Operator operator19 = com.facebook.appevents.ml.Operator.INSTANCE;
            com.facebook.appevents.ml.MTensor dense2 = com.facebook.appevents.ml.Operator.dense(concatenate, this.fc1Weight, this.fc1Bias);
            com.facebook.appevents.ml.Operator operator20 = com.facebook.appevents.ml.Operator.INSTANCE;
            com.facebook.appevents.ml.Operator.relu(dense2);
            com.facebook.appevents.ml.Operator operator21 = com.facebook.appevents.ml.Operator.INSTANCE;
            com.facebook.appevents.ml.MTensor dense3 = com.facebook.appevents.ml.Operator.dense(dense2, this.fc2Weight, this.fc2Bias);
            com.facebook.appevents.ml.Operator operator22 = com.facebook.appevents.ml.Operator.INSTANCE;
            com.facebook.appevents.ml.Operator.relu(dense3);
            com.facebook.appevents.ml.MTensor mTensor = this.finalWeights.get(kotlin.jvm.internal.Intrinsics.stringPlus(task, ".weight"));
            com.facebook.appevents.ml.MTensor mTensor2 = this.finalWeights.get(kotlin.jvm.internal.Intrinsics.stringPlus(task, ".bias"));
            if (mTensor != null && mTensor2 != null) {
                com.facebook.appevents.ml.Operator operator23 = com.facebook.appevents.ml.Operator.INSTANCE;
                com.facebook.appevents.ml.MTensor dense4 = com.facebook.appevents.ml.Operator.dense(dense3, mTensor, mTensor2);
                com.facebook.appevents.ml.Operator operator24 = com.facebook.appevents.ml.Operator.INSTANCE;
                com.facebook.appevents.ml.Operator.softmax(dense4);
                return dense4;
            }
            return null;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    /* compiled from: Model.kt */
    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bJ\u001e\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\r\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/facebook/appevents/ml/Model$Companion;", "", "()V", "SEQ_LEN", "", "mapping", "", "", "build", "Lcom/facebook/appevents/ml/Model;", "file", "Ljava/io/File;", "parse", "Lcom/facebook/appevents/ml/MTensor;", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final com.facebook.appevents.ml.Model build(java.io.File file) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
            java.util.Map<java.lang.String, com.facebook.appevents.ml.MTensor> parse = parse(file);
            kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
            if (parse == null) {
                return null;
            }
            try {
                return new com.facebook.appevents.ml.Model(parse, defaultConstructorMarker);
            } catch (java.lang.Exception unused) {
                return null;
            }
        }

        private final java.util.Map<java.lang.String, com.facebook.appevents.ml.MTensor> parse(java.io.File file) {
            com.facebook.appevents.ml.Utils utils = com.facebook.appevents.ml.Utils.INSTANCE;
            java.util.Map<java.lang.String, com.facebook.appevents.ml.MTensor> parseModelWeights = com.facebook.appevents.ml.Utils.parseModelWeights(file);
            if (parseModelWeights == null) {
                return null;
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            java.util.Map access$getMapping$cp = com.facebook.appevents.ml.Model.access$getMapping$cp();
            for (java.util.Map.Entry<java.lang.String, com.facebook.appevents.ml.MTensor> entry : parseModelWeights.entrySet()) {
                java.lang.String key = entry.getKey();
                if (access$getMapping$cp.containsKey(entry.getKey()) && (key = (java.lang.String) access$getMapping$cp.get(entry.getKey())) == null) {
                    return null;
                }
                hashMap.put(key, entry.getValue());
            }
            return hashMap;
        }
    }
}
