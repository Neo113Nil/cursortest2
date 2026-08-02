package com.datadog.android.core.configuration;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001c\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JJ\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u000eJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\n\u001a\u00020\t8\u0007¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u000eR&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010\u0012R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\u0010"}, d2 = {"Lcom/datadog/android/core/configuration/BackPressureStrategy;", "", "", "capacity", "Lkotlin/Function0;", "", "onThresholdReached", "Lkotlin/Function1;", "onItemDropped", "Lcom/datadog/android/core/configuration/BackPressureMitigation;", "backpressureMitigation", "<init>", "(ILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lcom/datadog/android/core/configuration/BackPressureMitigation;)V", "component1", "()I", "component2", "()Lkotlin/jvm/functions/Function0;", "component3", "()Lkotlin/jvm/functions/Function1;", "component4", "()Lcom/datadog/android/core/configuration/BackPressureMitigation;", "copy", "(ILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lcom/datadog/android/core/configuration/BackPressureMitigation;)Lcom/datadog/android/core/configuration/BackPressureStrategy;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Lcom/datadog/android/core/configuration/BackPressureMitigation;", "getBackpressureMitigation", com.visa.cbp.getEncExpo.warmup, "getCapacity", "Lkotlin/jvm/functions/Function1;", "getOnItemDropped", "Lkotlin/jvm/functions/Function0;", "getOnThresholdReached"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class BackPressureStrategy {
    private final com.datadog.android.core.configuration.BackPressureMitigation backpressureMitigation;
    private final int capacity;
    private final kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> onItemDropped;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onThresholdReached;

    public BackPressureStrategy(int i, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> function1, com.datadog.android.core.configuration.BackPressureMitigation backPressureMitigation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backPressureMitigation, "");
        this.capacity = i;
        this.onThresholdReached = function0;
        this.onItemDropped = function1;
        this.backpressureMitigation = backPressureMitigation;
    }

    public final int getCapacity() {
        return this.capacity;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnThresholdReached() {
        return this.onThresholdReached;
    }

    public final kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> getOnItemDropped() {
        return this.onItemDropped;
    }

    public final com.datadog.android.core.configuration.BackPressureMitigation getBackpressureMitigation() {
        return this.backpressureMitigation;
    }

    public final java.lang.String toString() {
        int i = this.capacity;
        kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.onThresholdReached;
        kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> function1 = this.onItemDropped;
        com.datadog.android.core.configuration.BackPressureMitigation backPressureMitigation = this.backpressureMitigation;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BackPressureStrategy(capacity=");
        sb.append(i);
        sb.append(", onThresholdReached=");
        sb.append(function0);
        sb.append(", onItemDropped=");
        sb.append(function1);
        sb.append(", backpressureMitigation=");
        sb.append(backPressureMitigation);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((java.lang.Integer.hashCode(this.capacity) * 31) + this.onThresholdReached.hashCode()) * 31) + this.onItemDropped.hashCode()) * 31) + this.backpressureMitigation.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.datadog.android.core.configuration.BackPressureStrategy)) {
            return false;
        }
        com.datadog.android.core.configuration.BackPressureStrategy backPressureStrategy = (com.datadog.android.core.configuration.BackPressureStrategy) other;
        return this.capacity == backPressureStrategy.capacity && kotlin.jvm.internal.Intrinsics.areEqual(this.onThresholdReached, backPressureStrategy.onThresholdReached) && kotlin.jvm.internal.Intrinsics.areEqual(this.onItemDropped, backPressureStrategy.onItemDropped) && this.backpressureMitigation == backPressureStrategy.backpressureMitigation;
    }

    public final com.datadog.android.core.configuration.BackPressureStrategy copy(int capacity, kotlin.jvm.functions.Function0<kotlin.Unit> onThresholdReached, kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> onItemDropped, com.datadog.android.core.configuration.BackPressureMitigation backpressureMitigation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onThresholdReached, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onItemDropped, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backpressureMitigation, "");
        return new com.datadog.android.core.configuration.BackPressureStrategy(capacity, onThresholdReached, onItemDropped, backpressureMitigation);
    }

    /* renamed from: component4, reason: from getter */
    public final com.datadog.android.core.configuration.BackPressureMitigation getBackpressureMitigation() {
        return this.backpressureMitigation;
    }

    public final kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> component3() {
        return this.onItemDropped;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> component2() {
        return this.onThresholdReached;
    }

    /* renamed from: component1, reason: from getter */
    public final int getCapacity() {
        return this.capacity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.datadog.android.core.configuration.BackPressureStrategy copy$default(com.datadog.android.core.configuration.BackPressureStrategy backPressureStrategy, int i, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function1 function1, com.datadog.android.core.configuration.BackPressureMitigation backPressureMitigation, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = backPressureStrategy.capacity;
        }
        if ((i2 & 2) != 0) {
            function0 = backPressureStrategy.onThresholdReached;
        }
        if ((i2 & 4) != 0) {
            function1 = backPressureStrategy.onItemDropped;
        }
        if ((i2 & 8) != 0) {
            backPressureMitigation = backPressureStrategy.backpressureMitigation;
        }
        return backPressureStrategy.copy(i, function0, function1, backPressureMitigation);
    }
}
