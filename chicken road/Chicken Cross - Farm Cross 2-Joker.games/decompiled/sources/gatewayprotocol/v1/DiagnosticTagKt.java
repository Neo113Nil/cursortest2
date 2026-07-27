package gatewayprotocol.v1;

import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DiagnosticTagKt.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lgatewayprotocol/v1/DiagnosticTagKt;", "", "<init>", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DiagnosticTagKt {
    public static final DiagnosticTagKt INSTANCE = new DiagnosticTagKt();

    private DiagnosticTagKt() {
    }

    /* compiled from: DiagnosticTagKt.kt */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u001c\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 D2\u00020\u0001:\u0002DEB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J%\u0010\u0010\u001a\u00020\u0011*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u0012\u001a\u00020\nH\u0007¢\u0006\u0002\b\u0013J&\u0010\u0014\u001a\u00020\u0011*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u0012\u001a\u00020\nH\u0087\n¢\u0006\u0002\b\u0015J+\u0010\u0016\u001a\u00020\u0011*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u0018H\u0007¢\u0006\u0002\b\u0019J,\u0010\u0014\u001a\u00020\u0011*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u0018H\u0087\n¢\u0006\u0002\b\u001aJ.\u0010\u001b\u001a\u00020\u0011*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0012\u001a\u00020\nH\u0087\u0002¢\u0006\u0002\b\u001eJ\u001d\u0010\u001f\u001a\u00020\u0011*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0007¢\u0006\u0002\b J\u0006\u0010'\u001a\u00020\u0011J\u0006\u0010(\u001a\u00020)J\u0006\u0010-\u001a\u00020\u0011J\u0006\u0010.\u001a\u00020)J\u0006\u00104\u001a\u00020\u0011J\u0006\u00105\u001a\u00020)J\u0006\u0010>\u001a\u00020\u0011J\u0006\u0010C\u001a\u00020\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR$\u0010\"\u001a\u00020!2\u0006\u0010\u0012\u001a\u00020!8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010*\u001a\u00020!2\u0006\u0010\u0012\u001a\u00020!8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b+\u0010$\"\u0004\b,\u0010&R$\u0010/\u001a\u00020\u001d2\u0006\u0010\u0012\u001a\u00020\u001d8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b0\u00101\"\u0004\b2\u00103R$\u00106\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\n8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R$\u0010;\u001a\u00020\u001d2\u0006\u0010\u0012\u001a\u00020\u001d8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b<\u00101\"\u0004\b=\u00103R\u0011\u0010?\u001a\u00020@8G¢\u0006\u0006\u001a\u0004\bA\u0010B¨\u0006F"}, d2 = {"Lgatewayprotocol/v1/DiagnosticTagKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticTag$Builder;", "<init>", "(Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticTag$Builder;)V", "_build", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticTag;", "tagType", "Lcom/google/protobuf/kotlin/DslList;", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticTagType;", "Lgatewayprotocol/v1/DiagnosticTagKt$Dsl$TagTypeProxy;", "getTagType$annotations", "()V", "getTagType", "()Lcom/google/protobuf/kotlin/DslList;", "add", "", "value", "addTagType", "plusAssign", "plusAssignTagType", "addAll", "values", "", "addAllTagType", "plusAssignAllTagType", "set", "index", "", "setTagType", "clear", "clearTagType", "", "customTagType", "getCustomTagType", "()Ljava/lang/String;", "setCustomTagType", "(Ljava/lang/String;)V", "clearCustomTagType", "hasCustomTagType", "", "stringValue", "getStringValue", "setStringValue", "clearStringValue", "hasStringValue", "intValue", "getIntValue", "()I", "setIntValue", "(I)V", "clearIntValue", "hasIntValue", "type", "getType", "()Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticTagType;", "setType", "(Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticTagType;)V", "typeValue", "getTypeValue", "setTypeValue", "clearType", "valueCase", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticTag$ValueCase;", "getValueCase", "()Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticTag$ValueCase;", "clearValue", k.M, "TagTypeProxy", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final DiagnosticEventRequestOuterClass.DiagnosticTag.Builder _builder;

        public /* synthetic */ Dsl(DiagnosticEventRequestOuterClass.DiagnosticTag.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        @Deprecated(message = "Field tagType is deprecated")
        public static /* synthetic */ void getTagType$annotations() {
        }

        private Dsl(DiagnosticEventRequestOuterClass.DiagnosticTag.Builder builder) {
            this._builder = builder;
        }

        /* compiled from: DiagnosticTagKt.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, d2 = {"Lgatewayprotocol/v1/DiagnosticTagKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lgatewayprotocol/v1/DiagnosticTagKt$Dsl;", "builder", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticTag$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(DiagnosticEventRequestOuterClass.DiagnosticTag.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ DiagnosticEventRequestOuterClass.DiagnosticTag _build() {
            DiagnosticEventRequestOuterClass.DiagnosticTag build = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            return build;
        }

        /* compiled from: DiagnosticTagKt.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/DiagnosticTagKt$Dsl$TagTypeProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "<init>", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class TagTypeProxy extends DslProxy {
            private TagTypeProxy() {
            }
        }

        public final /* synthetic */ DslList getTagType() {
            List<DiagnosticEventRequestOuterClass.DiagnosticTagType> tagTypeList = this._builder.getTagTypeList();
            Intrinsics.checkNotNullExpressionValue(tagTypeList, "getTagTypeList(...)");
            return new DslList(tagTypeList);
        }

        public final /* synthetic */ void addTagType(DslList dslList, DiagnosticEventRequestOuterClass.DiagnosticTagType value) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.addTagType(value);
        }

        public final /* synthetic */ void plusAssignTagType(DslList<DiagnosticEventRequestOuterClass.DiagnosticTagType, TagTypeProxy> dslList, DiagnosticEventRequestOuterClass.DiagnosticTagType value) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            addTagType(dslList, value);
        }

        public final /* synthetic */ void addAllTagType(DslList dslList, Iterable values) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(values, "values");
            this._builder.addAllTagType(values);
        }

        public final /* synthetic */ void plusAssignAllTagType(DslList<DiagnosticEventRequestOuterClass.DiagnosticTagType, TagTypeProxy> dslList, Iterable<? extends DiagnosticEventRequestOuterClass.DiagnosticTagType> values) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(values, "values");
            addAllTagType(dslList, values);
        }

        public final /* synthetic */ void setTagType(DslList dslList, int i, DiagnosticEventRequestOuterClass.DiagnosticTagType value) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setTagType(i, value);
        }

        public final /* synthetic */ void clearTagType(DslList dslList) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            this._builder.clearTagType();
        }

        public final String getCustomTagType() {
            String customTagType = this._builder.getCustomTagType();
            Intrinsics.checkNotNullExpressionValue(customTagType, "getCustomTagType(...)");
            return customTagType;
        }

        public final void setCustomTagType(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setCustomTagType(value);
        }

        public final void clearCustomTagType() {
            this._builder.clearCustomTagType();
        }

        public final boolean hasCustomTagType() {
            return this._builder.hasCustomTagType();
        }

        public final String getStringValue() {
            String stringValue = this._builder.getStringValue();
            Intrinsics.checkNotNullExpressionValue(stringValue, "getStringValue(...)");
            return stringValue;
        }

        public final void setStringValue(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setStringValue(value);
        }

        public final void clearStringValue() {
            this._builder.clearStringValue();
        }

        public final boolean hasStringValue() {
            return this._builder.hasStringValue();
        }

        public final int getIntValue() {
            return this._builder.getIntValue();
        }

        public final void setIntValue(int i) {
            this._builder.setIntValue(i);
        }

        public final void clearIntValue() {
            this._builder.clearIntValue();
        }

        public final boolean hasIntValue() {
            return this._builder.hasIntValue();
        }

        public final DiagnosticEventRequestOuterClass.DiagnosticTagType getType() {
            DiagnosticEventRequestOuterClass.DiagnosticTagType type = this._builder.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            return type;
        }

        public final void setType(DiagnosticEventRequestOuterClass.DiagnosticTagType value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setType(value);
        }

        public final int getTypeValue() {
            return this._builder.getTypeValue();
        }

        public final void setTypeValue(int i) {
            this._builder.setTypeValue(i);
        }

        public final void clearType() {
            this._builder.clearType();
        }

        public final DiagnosticEventRequestOuterClass.DiagnosticTag.ValueCase getValueCase() {
            DiagnosticEventRequestOuterClass.DiagnosticTag.ValueCase valueCase = this._builder.getValueCase();
            Intrinsics.checkNotNullExpressionValue(valueCase, "getValueCase(...)");
            return valueCase;
        }

        public final void clearValue() {
            this._builder.clearValue();
        }
    }
}
