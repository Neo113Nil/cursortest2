package com.facebook.share.model;

/* compiled from: GameRequestContent.kt */
@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0004*+,-B\u000f\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010$\u001a\u00020%H\u0016J\u0018\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020%H\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u000fR\u0019\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0013\u0010 \u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u000fR\u0013\u0010\"\u001a\u0004\u0018\u00010\r8G¢\u0006\u0006\u001a\u0004\b#\u0010\u000f¨\u0006."}, d2 = {"Lcom/facebook/share/model/GameRequestContent;", "Lcom/facebook/share/model/ShareModel;", "builder", "Lcom/facebook/share/model/GameRequestContent$Builder;", "(Lcom/facebook/share/model/GameRequestContent$Builder;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", com.helpshift.HelpshiftEvent.DATA_ACTION_TYPE, "Lcom/facebook/share/model/GameRequestContent$ActionType;", "getActionType", "()Lcom/facebook/share/model/GameRequestContent$ActionType;", "cta", "", "getCta", "()Ljava/lang/String;", "data", "getData", com.facebook.share.internal.ShareConstants.WEB_DIALOG_PARAM_FILTERS, "Lcom/facebook/share/model/GameRequestContent$Filters;", "getFilters", "()Lcom/facebook/share/model/GameRequestContent$Filters;", "message", "getMessage", "objectId", "getObjectId", "recipients", "", "getRecipients", "()Ljava/util/List;", com.facebook.share.internal.ShareConstants.WEB_DIALOG_PARAM_SUGGESTIONS, "getSuggestions", "title", "getTitle", "to", "getTo", "describeContents", "", "writeToParcel", "", "out", "flags", "ActionType", "Builder", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "Filters", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class GameRequestContent implements com.facebook.share.model.ShareModel {
    private final com.facebook.share.model.GameRequestContent.ActionType actionType;
    private final java.lang.String cta;
    private final java.lang.String data;
    private final com.facebook.share.model.GameRequestContent.Filters filters;
    private final java.lang.String message;
    private final java.lang.String objectId;
    private final java.util.List<java.lang.String> recipients;
    private final java.util.List<java.lang.String> suggestions;
    private final java.lang.String title;
    public static final android.os.Parcelable.Creator<com.facebook.share.model.GameRequestContent> CREATOR = new android.os.Parcelable.Creator<com.facebook.share.model.GameRequestContent>() { // from class: com.facebook.share.model.GameRequestContent$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.facebook.share.model.GameRequestContent createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new com.facebook.share.model.GameRequestContent(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.facebook.share.model.GameRequestContent[] newArray(int size) {
            return new com.facebook.share.model.GameRequestContent[size];
        }
    };

    public /* synthetic */ GameRequestContent(com.facebook.share.model.GameRequestContent.Builder builder, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* compiled from: GameRequestContent.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/facebook/share/model/GameRequestContent$ActionType;", "", "(Ljava/lang/String;I)V", "SEND", "ASKFOR", "TURN", "INVITE", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum ActionType {
        SEND,
        ASKFOR,
        TURN,
        INVITE;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static com.facebook.share.model.GameRequestContent.ActionType[] valuesCustom() {
            com.facebook.share.model.GameRequestContent.ActionType[] valuesCustom = values();
            return (com.facebook.share.model.GameRequestContent.ActionType[]) java.util.Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    /* compiled from: GameRequestContent.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/facebook/share/model/GameRequestContent$Filters;", "", "(Ljava/lang/String;I)V", "APP_USERS", "APP_NON_USERS", "EVERYBODY", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum Filters {
        APP_USERS,
        APP_NON_USERS,
        EVERYBODY;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static com.facebook.share.model.GameRequestContent.Filters[] valuesCustom() {
            com.facebook.share.model.GameRequestContent.Filters[] valuesCustom = values();
            return (com.facebook.share.model.GameRequestContent.Filters[]) java.util.Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    public final java.lang.String getMessage() {
        return this.message;
    }

    public final java.lang.String getCta() {
        return this.cta;
    }

    public final java.util.List<java.lang.String> getRecipients() {
        return this.recipients;
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    public final java.lang.String getData() {
        return this.data;
    }

    public final com.facebook.share.model.GameRequestContent.ActionType getActionType() {
        return this.actionType;
    }

    public final java.lang.String getObjectId() {
        return this.objectId;
    }

    public final com.facebook.share.model.GameRequestContent.Filters getFilters() {
        return this.filters;
    }

    public final java.util.List<java.lang.String> getSuggestions() {
        return this.suggestions;
    }

    private GameRequestContent(com.facebook.share.model.GameRequestContent.Builder builder) {
        this.message = builder.getMessage();
        this.cta = builder.getCta();
        this.recipients = builder.getRecipients$facebook_common_release();
        this.title = builder.getTitle();
        this.data = builder.getData();
        this.actionType = builder.getActionType();
        this.objectId = builder.getObjectId();
        this.filters = builder.getFilters();
        this.suggestions = builder.getSuggestions$facebook_common_release();
    }

    public GameRequestContent(android.os.Parcel parcel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.message = parcel.readString();
        this.cta = parcel.readString();
        this.recipients = parcel.createStringArrayList();
        this.title = parcel.readString();
        this.data = parcel.readString();
        this.actionType = (com.facebook.share.model.GameRequestContent.ActionType) parcel.readSerializable();
        this.objectId = parcel.readString();
        this.filters = (com.facebook.share.model.GameRequestContent.Filters) parcel.readSerializable();
        this.suggestions = parcel.createStringArrayList();
    }

    @kotlin.Deprecated(message = "Replaced by [getRecipients()]", replaceWith = @kotlin.ReplaceWith(expression = "getRecipients", imports = {}))
    public final java.lang.String getTo() {
        java.util.List<java.lang.String> list = this.recipients;
        if (list != null) {
            return android.text.TextUtils.join(",", list);
        }
        return null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.message);
        out.writeString(this.cta);
        out.writeStringList(this.recipients);
        out.writeString(this.title);
        out.writeString(this.data);
        out.writeSerializable(this.actionType);
        out.writeString(this.objectId);
        out.writeSerializable(this.filters);
        out.writeStringList(this.suggestions);
    }

    /* compiled from: GameRequestContent.kt */
    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010+\u001a\u00020\u0002H\u0016J\u0015\u0010,\u001a\u00020\u00002\u0006\u0010-\u001a\u00020.H\u0000¢\u0006\u0002\b/J\u0012\u0010,\u001a\u00020\u00002\b\u00100\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u00101\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005J\u0010\u00102\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0010\u00103\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u000bJ\u0010\u00104\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u0010\u00105\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u000bJ\u0010\u00106\u001a\u00020\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u000bJ\u0016\u00107\u001a\u00020\u00002\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010 J\u0016\u00108\u001a\u00020\u00002\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010 J\u0010\u00109\u001a\u00020\u00002\b\u0010(\u001a\u0004\u0018\u00010\u000bJ\u0012\u0010:\u001a\u00020\u00002\b\u0010;\u001a\u0004\u0018\u00010\u000bH\u0007R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u000bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u000bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\r\"\u0004\b\u001e\u0010\u000fR\"\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010 X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010%\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010 X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\"\"\u0004\b'\u0010$R\u001c\u0010(\u001a\u0004\u0018\u00010\u000bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\r\"\u0004\b*\u0010\u000f¨\u0006<"}, d2 = {"Lcom/facebook/share/model/GameRequestContent$Builder;", "Lcom/facebook/share/model/ShareModelBuilder;", "Lcom/facebook/share/model/GameRequestContent;", "()V", com.helpshift.HelpshiftEvent.DATA_ACTION_TYPE, "Lcom/facebook/share/model/GameRequestContent$ActionType;", "getActionType$facebook_common_release", "()Lcom/facebook/share/model/GameRequestContent$ActionType;", "setActionType$facebook_common_release", "(Lcom/facebook/share/model/GameRequestContent$ActionType;)V", "cta", "", "getCta$facebook_common_release", "()Ljava/lang/String;", "setCta$facebook_common_release", "(Ljava/lang/String;)V", "data", "getData$facebook_common_release", "setData$facebook_common_release", com.facebook.share.internal.ShareConstants.WEB_DIALOG_PARAM_FILTERS, "Lcom/facebook/share/model/GameRequestContent$Filters;", "getFilters$facebook_common_release", "()Lcom/facebook/share/model/GameRequestContent$Filters;", "setFilters$facebook_common_release", "(Lcom/facebook/share/model/GameRequestContent$Filters;)V", "message", "getMessage$facebook_common_release", "setMessage$facebook_common_release", "objectId", "getObjectId$facebook_common_release", "setObjectId$facebook_common_release", "recipients", "", "getRecipients$facebook_common_release", "()Ljava/util/List;", "setRecipients$facebook_common_release", "(Ljava/util/List;)V", com.facebook.share.internal.ShareConstants.WEB_DIALOG_PARAM_SUGGESTIONS, "getSuggestions$facebook_common_release", "setSuggestions$facebook_common_release", "title", "getTitle$facebook_common_release", "setTitle$facebook_common_release", "build", "readFrom", "parcel", "Landroid/os/Parcel;", "readFrom$facebook_common_release", "content", "setActionType", "setCta", "setData", "setFilters", "setMessage", "setObjectId", "setRecipients", "setSuggestions", "setTitle", "setTo", "to", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Builder implements com.facebook.share.model.ShareModelBuilder<com.facebook.share.model.GameRequestContent, com.facebook.share.model.GameRequestContent.Builder> {
        private com.facebook.share.model.GameRequestContent.ActionType actionType;
        private java.lang.String cta;
        private java.lang.String data;
        private com.facebook.share.model.GameRequestContent.Filters filters;
        private java.lang.String message;
        private java.lang.String objectId;
        private java.util.List<java.lang.String> recipients;
        private java.util.List<java.lang.String> suggestions;
        private java.lang.String title;

        /* renamed from: getMessage$facebook_common_release, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public final void setMessage$facebook_common_release(java.lang.String str) {
            this.message = str;
        }

        /* renamed from: getCta$facebook_common_release, reason: from getter */
        public final java.lang.String getCta() {
            return this.cta;
        }

        public final void setCta$facebook_common_release(java.lang.String str) {
            this.cta = str;
        }

        public final java.util.List<java.lang.String> getRecipients$facebook_common_release() {
            return this.recipients;
        }

        public final void setRecipients$facebook_common_release(java.util.List<java.lang.String> list) {
            this.recipients = list;
        }

        /* renamed from: getData$facebook_common_release, reason: from getter */
        public final java.lang.String getData() {
            return this.data;
        }

        public final void setData$facebook_common_release(java.lang.String str) {
            this.data = str;
        }

        /* renamed from: getTitle$facebook_common_release, reason: from getter */
        public final java.lang.String getTitle() {
            return this.title;
        }

        public final void setTitle$facebook_common_release(java.lang.String str) {
            this.title = str;
        }

        /* renamed from: getActionType$facebook_common_release, reason: from getter */
        public final com.facebook.share.model.GameRequestContent.ActionType getActionType() {
            return this.actionType;
        }

        public final void setActionType$facebook_common_release(com.facebook.share.model.GameRequestContent.ActionType actionType) {
            this.actionType = actionType;
        }

        /* renamed from: getObjectId$facebook_common_release, reason: from getter */
        public final java.lang.String getObjectId() {
            return this.objectId;
        }

        public final void setObjectId$facebook_common_release(java.lang.String str) {
            this.objectId = str;
        }

        /* renamed from: getFilters$facebook_common_release, reason: from getter */
        public final com.facebook.share.model.GameRequestContent.Filters getFilters() {
            return this.filters;
        }

        public final void setFilters$facebook_common_release(com.facebook.share.model.GameRequestContent.Filters filters) {
            this.filters = filters;
        }

        public final java.util.List<java.lang.String> getSuggestions$facebook_common_release() {
            return this.suggestions;
        }

        public final void setSuggestions$facebook_common_release(java.util.List<java.lang.String> list) {
            this.suggestions = list;
        }

        public final com.facebook.share.model.GameRequestContent.Builder setMessage(java.lang.String message) {
            this.message = message;
            return this;
        }

        public final com.facebook.share.model.GameRequestContent.Builder setCta(java.lang.String cta) {
            this.cta = cta;
            return this;
        }

        @kotlin.Deprecated(message = "Replaced by {@link #setRecipients(List)}")
        public final com.facebook.share.model.GameRequestContent.Builder setTo(java.lang.String to) {
            if (to != null) {
                this.recipients = kotlin.collections.CollectionsKt.toList(kotlin.text.StringsKt.split$default((java.lang.CharSequence) to, new char[]{kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA}, false, 0, 6, (java.lang.Object) null));
            }
            return this;
        }

        public final com.facebook.share.model.GameRequestContent.Builder setRecipients(java.util.List<java.lang.String> recipients) {
            this.recipients = recipients;
            return this;
        }

        public final com.facebook.share.model.GameRequestContent.Builder setData(java.lang.String data) {
            this.data = data;
            return this;
        }

        public final com.facebook.share.model.GameRequestContent.Builder setTitle(java.lang.String title) {
            this.title = title;
            return this;
        }

        public final com.facebook.share.model.GameRequestContent.Builder setActionType(com.facebook.share.model.GameRequestContent.ActionType actionType) {
            this.actionType = actionType;
            return this;
        }

        public final com.facebook.share.model.GameRequestContent.Builder setObjectId(java.lang.String objectId) {
            this.objectId = objectId;
            return this;
        }

        public final com.facebook.share.model.GameRequestContent.Builder setFilters(com.facebook.share.model.GameRequestContent.Filters filters) {
            this.filters = filters;
            return this;
        }

        public final com.facebook.share.model.GameRequestContent.Builder setSuggestions(java.util.List<java.lang.String> suggestions) {
            this.suggestions = suggestions;
            return this;
        }

        @Override // com.facebook.share.ShareBuilder
        public com.facebook.share.model.GameRequestContent build() {
            return new com.facebook.share.model.GameRequestContent(this, null);
        }

        @Override // com.facebook.share.model.ShareModelBuilder
        public com.facebook.share.model.GameRequestContent.Builder readFrom(com.facebook.share.model.GameRequestContent content) {
            return content == null ? this : setMessage(content.getMessage()).setCta(content.getCta()).setRecipients(content.getRecipients()).setTitle(content.getTitle()).setData(content.getData()).setActionType(content.getActionType()).setObjectId(content.getObjectId()).setFilters(content.getFilters()).setSuggestions(content.getSuggestions());
        }

        public final com.facebook.share.model.GameRequestContent.Builder readFrom$facebook_common_release(android.os.Parcel parcel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
            return readFrom((com.facebook.share.model.GameRequestContent) parcel.readParcelable(com.facebook.share.model.GameRequestContent.class.getClassLoader()));
        }
    }
}
