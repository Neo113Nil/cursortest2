package com.facebook.appevents.codeless.internal;

/* compiled from: PathComponent.kt */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\r\u0018\u0000 \u00192\u00020\u0001:\u0002\u0019\u001aB\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\u0015\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\bR\u0011\u0010\u0017\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\b¨\u0006\u001b"}, d2 = {"Lcom/facebook/appevents/codeless/internal/PathComponent;", "", "component", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "className", "", "getClassName", "()Ljava/lang/String;", "description", "getDescription", "hint", "getHint", "id", "", "getId", "()I", "index", "getIndex", "matchBitmask", "getMatchBitmask", "tag", "getTag", "text", "getText", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "MatchBitmaskType", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class PathComponent {
    private static final java.lang.String PATH_CLASS_NAME_KEY = "class_name";
    private static final java.lang.String PATH_DESCRIPTION_KEY = "description";
    private static final java.lang.String PATH_HINT_KEY = "hint";
    private static final java.lang.String PATH_ID_KEY = "id";
    private static final java.lang.String PATH_INDEX_KEY = "index";
    private static final java.lang.String PATH_MATCH_BITMASK_KEY = "match_bitmask";
    private static final java.lang.String PATH_TAG_KEY = "tag";
    private static final java.lang.String PATH_TEXT_KEY = "text";
    private final java.lang.String className;
    private final java.lang.String description;
    private final java.lang.String hint;
    private final int id;
    private final int index;
    private final int matchBitmask;
    private final java.lang.String tag;
    private final java.lang.String text;

    /* compiled from: PathComponent.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/facebook/appevents/codeless/internal/PathComponent$MatchBitmaskType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "ID", "TEXT", "TAG", "DESCRIPTION", "HINT", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum MatchBitmaskType {
        ID(1),
        TEXT(2),
        TAG(4),
        DESCRIPTION(8),
        HINT(16);

        private final int value;

        MatchBitmaskType(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static com.facebook.appevents.codeless.internal.PathComponent.MatchBitmaskType[] valuesCustom() {
            com.facebook.appevents.codeless.internal.PathComponent.MatchBitmaskType[] valuesCustom = values();
            return (com.facebook.appevents.codeless.internal.PathComponent.MatchBitmaskType[]) java.util.Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    public PathComponent(org.json.JSONObject component) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(component, "component");
        java.lang.String string = component.getString(PATH_CLASS_NAME_KEY);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "component.getString(PATH_CLASS_NAME_KEY)");
        this.className = string;
        this.index = component.optInt("index", -1);
        this.id = component.optInt("id");
        java.lang.String optString = component.optString("text");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(optString, "component.optString(PATH_TEXT_KEY)");
        this.text = optString;
        java.lang.String optString2 = component.optString("tag");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(optString2, "component.optString(PATH_TAG_KEY)");
        this.tag = optString2;
        java.lang.String optString3 = component.optString("description");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(optString3, "component.optString(PATH_DESCRIPTION_KEY)");
        this.description = optString3;
        java.lang.String optString4 = component.optString("hint");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(optString4, "component.optString(PATH_HINT_KEY)");
        this.hint = optString4;
        this.matchBitmask = component.optInt(PATH_MATCH_BITMASK_KEY);
    }

    public final java.lang.String getClassName() {
        return this.className;
    }

    public final int getIndex() {
        return this.index;
    }

    public final int getId() {
        return this.id;
    }

    public final java.lang.String getText() {
        return this.text;
    }

    public final java.lang.String getTag() {
        return this.tag;
    }

    public final java.lang.String getDescription() {
        return this.description;
    }

    public final java.lang.String getHint() {
        return this.hint;
    }

    public final int getMatchBitmask() {
        return this.matchBitmask;
    }
}
