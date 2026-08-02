package com.paypal.oslo.feature.userprofile.ui.components.common;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u0000*\u000e\b\u0000\u0010\u0002 \u0001*\u0006\u0012\u0002\b\u00030\u00012\u00020\u0003:\u0004\u0004\u0005\u0006\u0007\u0082\u0001\u0004\b\t\n\u000bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/components/common/ProfileDataListUiState;", "Lcom/paypal/oslo/feature/userprofile/domain/ProfileDataItem;", "T", "", "Loading", "Error", "Empty", "Content", "Lcom/paypal/oslo/feature/userprofile/ui/components/common/ProfileDataListUiState$Content;", "Lcom/paypal/oslo/feature/userprofile/ui/components/common/ProfileDataListUiState$Empty;", "Lcom/paypal/oslo/feature/userprofile/ui/components/common/ProfileDataListUiState$Error;", "Lcom/paypal/oslo/feature/userprofile/ui/components/common/ProfileDataListUiState$Loading;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface ProfileDataListUiState<T extends com.paypal.oslo.feature.userprofile.domain.ProfileDataItem<?>> {

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/components/common/ProfileDataListUiState$Loading;", "Lcom/paypal/oslo/feature/userprofile/ui/components/common/ProfileDataListUiState;", "", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Loading implements com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataListUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataListUiState.Loading INSTANCE = new com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataListUiState.Loading();

        private Loading() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/components/common/ProfileDataListUiState$Error;", "Lcom/paypal/oslo/feature/userprofile/ui/components/common/ProfileDataListUiState;", "", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/userprofile/ui/components/common/ProfileDataListUiState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error implements com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataListUiState {
        public static final int $stable = 0;
        private final java.lang.String message;

        public Error(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(message=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.message.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataListUiState.Error) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataListUiState.Error) other).message);
        }

        public final com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataListUiState.Error copy(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataListUiState.Error(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataListUiState.Error copy$default(com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataListUiState.Error error, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = error.message;
            }
            return error.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/components/common/ProfileDataListUiState$Empty;", "Lcom/paypal/oslo/feature/userprofile/ui/components/common/ProfileDataListUiState;", "", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Empty implements com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataListUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataListUiState.Empty INSTANCE = new com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataListUiState.Empty();

        public final int hashCode() {
            return -1718167633;
        }

        private Empty() {
        }

        public final java.lang.String toString() {
            return "Empty";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataListUiState.Empty)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u0000*\f\b\u0001\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ&\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/components/common/ProfileDataListUiState$Content;", "Lcom/paypal/oslo/feature/userprofile/domain/ProfileDataItem;", "T", "Lcom/paypal/oslo/feature/userprofile/ui/components/common/ProfileDataListUiState;", "", "items", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/userprofile/ui/components/common/ProfileDataListUiState$Content;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getItems"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Content<T extends com.paypal.oslo.feature.userprofile.domain.ProfileDataItem<?>> implements com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataListUiState<T> {
        public static final int $stable = 8;
        private final java.util.List<T> items;

        /* JADX WARN: Multi-variable type inference failed */
        public Content(java.util.List<? extends T> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.items = list;
        }

        public final java.util.List<T> getItems() {
            return this.items;
        }

        public final java.lang.String toString() {
            java.util.List<T> list = this.items;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Content(items=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.items.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataListUiState.Content) && kotlin.jvm.internal.Intrinsics.areEqual(this.items, ((com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataListUiState.Content) other).items);
        }

        public final com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataListUiState.Content<T> copy(java.util.List<? extends T> items) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
            return new com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataListUiState.Content<>(items);
        }

        public final java.util.List<T> component1() {
            return this.items;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataListUiState.Content copy$default(com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataListUiState.Content content, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = content.items;
            }
            return content.copy(list);
        }
    }
}
