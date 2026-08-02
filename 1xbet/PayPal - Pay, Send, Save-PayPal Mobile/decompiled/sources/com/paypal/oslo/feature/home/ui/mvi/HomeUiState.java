package com.paypal.oslo.feature.home.ui.mvi;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0003\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\r\u000e\u000f"}, d2 = {"Lcom/paypal/oslo/feature/home/ui/mvi/HomeUiState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Loading", "Success", "Error", "Lcom/paypal/oslo/feature/home/ui/mvi/HomeUiState$Error;", "Lcom/paypal/oslo/feature/home/ui/mvi/HomeUiState$Loading;", "Lcom/paypal/oslo/feature/home/ui/mvi/HomeUiState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class HomeUiState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;

    private HomeUiState(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\t\u001a\u00020\u00002\u0012\b\u0002\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R!\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/home/ui/mvi/HomeUiState$Loading;", "Lcom/paypal/oslo/feature/home/ui/mvi/HomeUiState;", "", "Lcom/paypal/oslo/feature/home/domain/model/Section;", "sections", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/home/ui/mvi/HomeUiState$Loading;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getSections"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.home.ui.mvi.HomeUiState {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.home.domain.model.Section<?>> sections;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Loading(java.util.List<? extends com.paypal.oslo.feature.home.domain.model.Section<?>> list) {
            super("Loading", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.sections = list;
        }

        public final java.util.List<com.paypal.oslo.feature.home.domain.model.Section<?>> getSections() {
            return this.sections;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.home.domain.model.Section<?>> list = this.sections;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Loading(sections=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.sections.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.home.ui.mvi.HomeUiState.Loading) && kotlin.jvm.internal.Intrinsics.areEqual(this.sections, ((com.paypal.oslo.feature.home.ui.mvi.HomeUiState.Loading) other).sections);
        }

        public final com.paypal.oslo.feature.home.ui.mvi.HomeUiState.Loading copy(java.util.List<? extends com.paypal.oslo.feature.home.domain.model.Section<?>> sections) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sections, "");
            return new com.paypal.oslo.feature.home.ui.mvi.HomeUiState.Loading(sections);
        }

        public final java.util.List<com.paypal.oslo.feature.home.domain.model.Section<?>> component1() {
            return this.sections;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.home.ui.mvi.HomeUiState.Loading copy$default(com.paypal.oslo.feature.home.ui.mvi.HomeUiState.Loading loading, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = loading.sections;
            }
            return loading.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012JB\u0010\u0013\u001a\u00020\u00002\u0012\b\u0002\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000fJ\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR!\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b!\u0010\u000fR\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010\u0012R\u0011\u0010%\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b$\u0010\u0012R\u0011\u0010&\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b&\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/home/ui/mvi/HomeUiState$Success;", "Lcom/paypal/oslo/feature/home/ui/mvi/HomeUiState;", "", "Lcom/paypal/oslo/feature/home/domain/model/Section;", "sections", "", "scrollIndex", "scrollOffset", "", "hapticFeedbackEnabled", "<init>", "(Ljava/util/List;IIZ)V", "component1", "()Ljava/util/List;", "component2", "()I", "component3", "component4", "()Z", "copy", "(Ljava/util/List;IIZ)Lcom/paypal/oslo/feature/home/ui/mvi/HomeUiState$Success;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getSections", com.visa.cbp.getEncExpo.warmup, "getScrollIndex", "getScrollOffset", "Z", "getHapticFeedbackEnabled", "getHasContent", "hasContent", "isEmpty"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.home.ui.mvi.HomeUiState {
        public static final int $stable = 8;
        private final boolean hapticFeedbackEnabled;
        private final int scrollIndex;
        private final int scrollOffset;
        private final java.util.List<com.paypal.oslo.feature.home.domain.model.Section<?>> sections;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Success(java.util.List<? extends com.paypal.oslo.feature.home.domain.model.Section<?>> list, int i, int i2, boolean z) {
            super("Success", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.sections = list;
            this.scrollIndex = i;
            this.scrollOffset = i2;
            this.hapticFeedbackEnabled = z;
        }

        public /* synthetic */ Success(java.util.List list, int i, int i2, boolean z, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? false : z);
        }

        public final java.util.List<com.paypal.oslo.feature.home.domain.model.Section<?>> getSections() {
            return this.sections;
        }

        public final int getScrollIndex() {
            return this.scrollIndex;
        }

        public final int getScrollOffset() {
            return this.scrollOffset;
        }

        public final boolean getHapticFeedbackEnabled() {
            return this.hapticFeedbackEnabled;
        }

        public final boolean getHasContent() {
            return !this.sections.isEmpty();
        }

        public final boolean isEmpty() {
            return this.sections.isEmpty();
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.home.domain.model.Section<?>> list = this.sections;
            int i = this.scrollIndex;
            int i2 = this.scrollOffset;
            boolean z = this.hapticFeedbackEnabled;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(sections=");
            sb.append(list);
            sb.append(", scrollIndex=");
            sb.append(i);
            sb.append(", scrollOffset=");
            sb.append(i2);
            sb.append(", hapticFeedbackEnabled=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((this.sections.hashCode() * 31) + java.lang.Integer.hashCode(this.scrollIndex)) * 31) + java.lang.Integer.hashCode(this.scrollOffset)) * 31) + java.lang.Boolean.hashCode(this.hapticFeedbackEnabled);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.ui.mvi.HomeUiState.Success)) {
                return false;
            }
            com.paypal.oslo.feature.home.ui.mvi.HomeUiState.Success success = (com.paypal.oslo.feature.home.ui.mvi.HomeUiState.Success) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.sections, success.sections) && this.scrollIndex == success.scrollIndex && this.scrollOffset == success.scrollOffset && this.hapticFeedbackEnabled == success.hapticFeedbackEnabled;
        }

        public final com.paypal.oslo.feature.home.ui.mvi.HomeUiState.Success copy(java.util.List<? extends com.paypal.oslo.feature.home.domain.model.Section<?>> sections, int scrollIndex, int scrollOffset, boolean hapticFeedbackEnabled) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sections, "");
            return new com.paypal.oslo.feature.home.ui.mvi.HomeUiState.Success(sections, scrollIndex, scrollOffset, hapticFeedbackEnabled);
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getHapticFeedbackEnabled() {
            return this.hapticFeedbackEnabled;
        }

        /* renamed from: component3, reason: from getter */
        public final int getScrollOffset() {
            return this.scrollOffset;
        }

        /* renamed from: component2, reason: from getter */
        public final int getScrollIndex() {
            return this.scrollIndex;
        }

        public final java.util.List<com.paypal.oslo.feature.home.domain.model.Section<?>> component1() {
            return this.sections;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.home.ui.mvi.HomeUiState.Success copy$default(com.paypal.oslo.feature.home.ui.mvi.HomeUiState.Success success, java.util.List list, int i, int i2, boolean z, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                list = success.sections;
            }
            if ((i3 & 2) != 0) {
                i = success.scrollIndex;
            }
            if ((i3 & 4) != 0) {
                i2 = success.scrollOffset;
            }
            if ((i3 & 8) != 0) {
                z = success.hapticFeedbackEnabled;
            }
            return success.copy(list, i, i2, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\b\u0002\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ.\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0012\b\u0002\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR$\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/home/ui/mvi/HomeUiState$Error;", "Lcom/paypal/oslo/feature/home/ui/mvi/HomeUiState;", "", "message", "", "Lcom/paypal/oslo/feature/home/domain/model/Section;", "sections", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/home/ui/mvi/HomeUiState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage", "Ljava/util/List;", "getSections"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.home.ui.mvi.HomeUiState {
        public static final int $stable = 8;
        private final java.lang.String message;
        private final java.util.List<com.paypal.oslo.feature.home.domain.model.Section<?>> sections;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Error(java.lang.String str, java.util.List<? extends com.paypal.oslo.feature.home.domain.model.Section<?>> list) {
            super("Error", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.message = str;
            this.sections = list;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public /* synthetic */ Error(java.lang.String str, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
        }

        public final java.util.List<com.paypal.oslo.feature.home.domain.model.Section<?>> getSections() {
            return this.sections;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.util.List<com.paypal.oslo.feature.home.domain.model.Section<?>> list = this.sections;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(message=");
            sb.append(str);
            sb.append(", sections=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.message.hashCode() * 31) + this.sections.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.ui.mvi.HomeUiState.Error)) {
                return false;
            }
            com.paypal.oslo.feature.home.ui.mvi.HomeUiState.Error error = (com.paypal.oslo.feature.home.ui.mvi.HomeUiState.Error) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.message, error.message) && kotlin.jvm.internal.Intrinsics.areEqual(this.sections, error.sections);
        }

        public final com.paypal.oslo.feature.home.ui.mvi.HomeUiState.Error copy(java.lang.String message, java.util.List<? extends com.paypal.oslo.feature.home.domain.model.Section<?>> sections) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sections, "");
            return new com.paypal.oslo.feature.home.ui.mvi.HomeUiState.Error(message, sections);
        }

        public final java.util.List<com.paypal.oslo.feature.home.domain.model.Section<?>> component2() {
            return this.sections;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.home.ui.mvi.HomeUiState.Error copy$default(com.paypal.oslo.feature.home.ui.mvi.HomeUiState.Error error, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = error.message;
            }
            if ((i & 2) != 0) {
                list = error.sections;
            }
            return error.copy(str, list);
        }
    }

    public /* synthetic */ HomeUiState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
