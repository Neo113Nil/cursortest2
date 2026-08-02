package com.izettle.android.serialization;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0001¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001a\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\u001b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u001e"}, d2 = {"Lcom/izettle/android/serialization/JsonArray;", "Lcom/izettle/android/serialization/JsonElement;", "<init>", "()V", "", "i", "get", "(I)Lcom/izettle/android/serialization/JsonElement;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.adjust.sdk.Constants.PUSH, "(Lcom/izettle/android/serialization/JsonElement;)Lcom/izettle/android/serialization/JsonArray;", "remove", "index", "removeAt", "(I)Lcom/izettle/android/serialization/JsonArray;", "", "set", "(ILcom/izettle/android/serialization/JsonElement;)V", "", "toString", "()Ljava/lang/String;", "", "_values", "Ljava/util/List;", "getLength", "()I", "length", "", "values", "getValues", "()Ljava/util/List;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class JsonArray extends com.izettle.android.serialization.JsonElement {
    private final java.util.List<com.izettle.android.serialization.JsonElement> _values;
    private final java.util.List<com.izettle.android.serialization.JsonElement> values;

    public JsonArray() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this._values = arrayList;
        this.values = arrayList;
    }

    public final java.util.List<com.izettle.android.serialization.JsonElement> getValues() {
        return this.values;
    }

    public final int getLength() {
        return this._values.size();
    }

    public final void set(int i, com.izettle.android.serialization.JsonElement value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        this._values.set(i, value);
    }

    public final com.izettle.android.serialization.JsonElement get(int i) {
        return this._values.get(i);
    }

    public final com.izettle.android.serialization.JsonArray push(com.izettle.android.serialization.JsonElement value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        this._values.add(value);
        return this;
    }

    public final com.izettle.android.serialization.JsonArray remove(com.izettle.android.serialization.JsonElement value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        this._values.remove(value);
        return this;
    }

    public final com.izettle.android.serialization.JsonArray removeAt(int index) {
        this._values.remove(index);
        return this;
    }

    public final java.lang.String toString() {
        return kotlin.collections.CollectionsKt.joinToString$default(this._values, ",", "[", "]", 0, null, null, 56, null);
    }
}
