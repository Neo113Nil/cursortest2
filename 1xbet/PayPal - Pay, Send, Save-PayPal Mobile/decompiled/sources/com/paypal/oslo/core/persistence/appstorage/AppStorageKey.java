package com.paypal.oslo.core.persistence.appstorage;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\f\r"}, d2 = {"Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Unencrypted", "Encrypted", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey$Encrypted;", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey$Unencrypted;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class AppStorageKey {
    private final java.lang.String name;

    private AppStorageKey(java.lang.String str) {
        this.name = str;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey$Unencrypted;", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey;", "", "name", "<init>", "(Ljava/lang/String;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Unencrypted extends com.paypal.oslo.core.persistence.appstorage.AppStorageKey {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Unencrypted(java.lang.String str) {
            super(str, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey$Encrypted;", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey;", "", "name", "<init>", "(Ljava/lang/String;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Encrypted extends com.paypal.oslo.core.persistence.appstorage.AppStorageKey {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Encrypted(java.lang.String str) {
            super(str, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        }
    }

    public /* synthetic */ AppStorageKey(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
