package com.izettle.android.serialization;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u0000 \t2\u00020\u0001:\u0001\tJ\u0019\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/izettle/android/serialization/JsonSerializer;", "", "obj", "Lcom/izettle/android/serialization/JsonElement;", "serializeToJson", "(Ljava/lang/Object;)Lcom/izettle/android/serialization/JsonElement;", "", "serializeToString", "(Ljava/lang/Object;)Ljava/lang/String;", "Companion"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface JsonSerializer {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.izettle.android.serialization.JsonSerializer.Companion INSTANCE = com.izettle.android.serialization.JsonSerializer.Companion.$$INSTANCE;

    com.izettle.android.serialization.JsonElement serializeToJson(java.lang.Object obj);

    java.lang.String serializeToString(java.lang.Object obj);

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/izettle/android/serialization/JsonSerializer$Companion;", "", "<init>", "()V", "Lcom/izettle/android/serialization/JsonSerializer;", "create", "()Lcom/izettle/android/serialization/JsonSerializer;", "obj", "", "serializeToString", "(Ljava/lang/Object;)Ljava/lang/String;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.izettle.android.serialization.JsonSerializer.Companion $$INSTANCE = new com.izettle.android.serialization.JsonSerializer.Companion();

        private Companion() {
        }

        public final java.lang.String serializeToString(java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            return create().serializeToString(obj);
        }

        public final com.izettle.android.serialization.JsonSerializer create() {
            return new com.izettle.android.serialization.JsonSerializerImpl();
        }
    }
}
