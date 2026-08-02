package com.paypal.oslo.feature.identity.moreoptions.ui;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0003\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\r\u000e\u000f"}, d2 = {"Lcom/paypal/oslo/feature/identity/moreoptions/ui/MoreOptionsUiState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Loading", "Loaded", "Error", "Lcom/paypal/oslo/feature/identity/moreoptions/ui/MoreOptionsUiState$Error;", "Lcom/paypal/oslo/feature/identity/moreoptions/ui/MoreOptionsUiState$Loaded;", "Lcom/paypal/oslo/feature/identity/moreoptions/ui/MoreOptionsUiState$Loading;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class MoreOptionsUiState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;

    private MoreOptionsUiState(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/moreoptions/ui/MoreOptionsUiState$Loading;", "Lcom/paypal/oslo/feature/identity/moreoptions/ui/MoreOptionsUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsUiState.Loading INSTANCE = new com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsUiState.Loading();

        public final int hashCode() {
            return 1968945848;
        }

        private Loading() {
            super("MoreOptionsUiState.Loading", null);
        }

        public final java.lang.String toString() {
            return "Loading";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsUiState.Loading)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/identity/moreoptions/ui/MoreOptionsUiState$Loaded;", "Lcom/paypal/oslo/feature/identity/moreoptions/ui/MoreOptionsUiState;", "", "Lcom/paypal/oslo/feature/identity/moreoptions/domain/model/Option;", "options", "", "showAllOptions", "<init>", "(Ljava/util/List;Z)V", "component1", "()Ljava/util/List;", "component2", "()Z", "copy", "(Ljava/util/List;Z)Lcom/paypal/oslo/feature/identity/moreoptions/ui/MoreOptionsUiState$Loaded;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getOptions", "Z", "getShowAllOptions"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loaded extends com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsUiState {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.identity.moreoptions.domain.model.Option> options;
        private final boolean showAllOptions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loaded(java.util.List<com.paypal.oslo.feature.identity.moreoptions.domain.model.Option> list, boolean z) {
            super("MoreOptionsUiState.Loaded", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.options = list;
            this.showAllOptions = z;
        }

        public /* synthetic */ Loaded(java.util.List list, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i & 2) != 0 ? false : z);
        }

        public final java.util.List<com.paypal.oslo.feature.identity.moreoptions.domain.model.Option> getOptions() {
            return this.options;
        }

        public final boolean getShowAllOptions() {
            return this.showAllOptions;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.identity.moreoptions.domain.model.Option> list = this.options;
            boolean z = this.showAllOptions;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Loaded(options=");
            sb.append(list);
            sb.append(", showAllOptions=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.options.hashCode() * 31) + java.lang.Boolean.hashCode(this.showAllOptions);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsUiState.Loaded)) {
                return false;
            }
            com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsUiState.Loaded loaded = (com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsUiState.Loaded) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.options, loaded.options) && this.showAllOptions == loaded.showAllOptions;
        }

        public final com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsUiState.Loaded copy(java.util.List<com.paypal.oslo.feature.identity.moreoptions.domain.model.Option> options, boolean showAllOptions) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "");
            return new com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsUiState.Loaded(options, showAllOptions);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShowAllOptions() {
            return this.showAllOptions;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.moreoptions.domain.model.Option> component1() {
            return this.options;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsUiState.Loaded copy$default(com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsUiState.Loaded loaded, java.util.List list, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = loaded.options;
            }
            if ((i & 2) != 0) {
                z = loaded.showAllOptions;
            }
            return loaded.copy(list, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/moreoptions/ui/MoreOptionsUiState$Error;", "Lcom/paypal/oslo/feature/identity/moreoptions/ui/MoreOptionsUiState;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/moreoptions/ui/MoreOptionsUiState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsUiState {
        public static final int $stable = 0;
        private final java.lang.String message;

        public Error(java.lang.String str) {
            super("MoreOptionsUiState.Error", null);
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
            java.lang.String str = this.message;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsUiState.Error) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsUiState.Error) other).message);
        }

        public final com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsUiState.Error copy(java.lang.String message) {
            return new com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsUiState.Error(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsUiState.Error copy$default(com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsUiState.Error error, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = error.message;
            }
            return error.copy(str);
        }
    }

    public /* synthetic */ MoreOptionsUiState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
