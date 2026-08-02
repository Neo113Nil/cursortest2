package com.datadog.android.core.internal.persistence;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016¢\u0006\u0004\b\b\u0010\f"}, d2 = {"Lcom/datadog/android/core/internal/persistence/NoOpDataWriter;", "", "T", "Lcom/datadog/android/core/internal/persistence/DataWriter;", "<init>", "()V", "element", "", "write", "(Ljava/lang/Object;)V", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/util/List;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NoOpDataWriter<T> implements com.datadog.android.core.internal.persistence.DataWriter<T> {
    @Override // com.datadog.android.core.internal.persistence.DataWriter
    public final void write(java.util.List<? extends T> data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
    }

    @Override // com.datadog.android.core.internal.persistence.DataWriter
    public final void write(T element) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(element, "");
    }
}
