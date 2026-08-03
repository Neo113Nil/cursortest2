package com.facebook;

/* compiled from: CallbackManager.kt */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001:\u0002\t\nJ\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&¨\u0006\u000b"}, d2 = {"Lcom/facebook/CallbackManager;", "", "onActivityResult", "", "requestCode", "", com.ironsource.X3.f.f, "data", "Landroid/content/Intent;", "ActivityResultParameters", "Factory", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public interface CallbackManager {
    boolean onActivityResult(int requestCode, int resultCode, android.content.Intent data);

    /* compiled from: CallbackManager.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lcom/facebook/CallbackManager$Factory;", "", "()V", "create", "Lcom/facebook/CallbackManager;", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Factory {
        public static final com.facebook.CallbackManager.Factory INSTANCE = new com.facebook.CallbackManager.Factory();

        private Factory() {
        }

        @kotlin.jvm.JvmStatic
        public static final com.facebook.CallbackManager create() {
            return new com.facebook.internal.CallbackManagerImpl();
        }
    }

    /* compiled from: CallbackManager.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/facebook/CallbackManager$ActivityResultParameters;", "", "requestCode", "", com.ironsource.X3.f.f, "data", "Landroid/content/Intent;", "(IILandroid/content/Intent;)V", "getData", "()Landroid/content/Intent;", "getRequestCode", "()I", "getResultCode", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final /* data */ class ActivityResultParameters {
        private final android.content.Intent data;
        private final int requestCode;
        private final int resultCode;

        public static /* synthetic */ com.facebook.CallbackManager.ActivityResultParameters copy$default(com.facebook.CallbackManager.ActivityResultParameters activityResultParameters, int i, int i2, android.content.Intent intent, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                i = activityResultParameters.requestCode;
            }
            if ((i3 & 2) != 0) {
                i2 = activityResultParameters.resultCode;
            }
            if ((i3 & 4) != 0) {
                intent = activityResultParameters.data;
            }
            return activityResultParameters.copy(i, i2, intent);
        }

        /* renamed from: component1, reason: from getter */
        public final int getRequestCode() {
            return this.requestCode;
        }

        /* renamed from: component2, reason: from getter */
        public final int getResultCode() {
            return this.resultCode;
        }

        /* renamed from: component3, reason: from getter */
        public final android.content.Intent getData() {
            return this.data;
        }

        public final com.facebook.CallbackManager.ActivityResultParameters copy(int requestCode, int resultCode, android.content.Intent data) {
            return new com.facebook.CallbackManager.ActivityResultParameters(requestCode, resultCode, data);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.facebook.CallbackManager.ActivityResultParameters)) {
                return false;
            }
            com.facebook.CallbackManager.ActivityResultParameters activityResultParameters = (com.facebook.CallbackManager.ActivityResultParameters) other;
            return this.requestCode == activityResultParameters.requestCode && this.resultCode == activityResultParameters.resultCode && kotlin.jvm.internal.Intrinsics.areEqual(this.data, activityResultParameters.data);
        }

        public int hashCode() {
            int i = ((this.requestCode * 31) + this.resultCode) * 31;
            android.content.Intent intent = this.data;
            return i + (intent == null ? 0 : intent.hashCode());
        }

        public java.lang.String toString() {
            return "ActivityResultParameters(requestCode=" + this.requestCode + ", resultCode=" + this.resultCode + ", data=" + this.data + ')';
        }

        public ActivityResultParameters(int i, int i2, android.content.Intent intent) {
            this.requestCode = i;
            this.resultCode = i2;
            this.data = intent;
        }

        public final android.content.Intent getData() {
            return this.data;
        }

        public final int getRequestCode() {
            return this.requestCode;
        }

        public final int getResultCode() {
            return this.resultCode;
        }
    }
}
