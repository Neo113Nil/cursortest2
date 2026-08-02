package androidx.compose.ui.text.font;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0005 \t!\"#B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\fJ\u0015\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\fJ\u0015\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0016J1\u0010 \u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00192\u0012\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u001b\"\u00020\b¢\u0006\u0004\b\u001e\u0010\u001f"}, d2 = {"Landroidx/compose/ui/text/font/FontVariation;", "", "<init>", "()V", "", "name", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Landroidx/compose/ui/text/font/FontVariation$Setting;", "Setting", "(Ljava/lang/String;F)Landroidx/compose/ui/text/font/FontVariation$Setting;", "italic", "(F)Landroidx/compose/ui/text/font/FontVariation$Setting;", "Landroidx/compose/ui/unit/TextUnit;", "textSize", "opticalSizing--R2X_6o", "(J)Landroidx/compose/ui/text/font/FontVariation$Setting;", "opticalSizing", "slant", "width", "", "weight", "(I)Landroidx/compose/ui/text/font/FontVariation$Setting;", "grade", "Landroidx/compose/ui/text/font/FontWeight;", "Landroidx/compose/ui/text/font/FontStyle;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, "", "settings", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "Settings-6EWAqTQ", "(Landroidx/compose/ui/text/font/FontWeight;I[Landroidx/compose/ui/text/font/FontVariation$Setting;)Landroidx/compose/ui/text/font/FontVariation$Settings;", "Settings", "SettingFloat", "SettingTextUnit", "SettingInt"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FontVariation {
    public static final int $stable = 0;
    public static final androidx.compose.ui.text.font.FontVariation INSTANCE = new androidx.compose.ui.text.font.FontVariation();

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078'X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0001\u0003\u000f\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/font/FontVariation$Setting;", "", "Landroidx/compose/ui/unit/Density;", "density", "", "toVariationValue", "(Landroidx/compose/ui/unit/Density;)F", "", "getNeedsDensity", "()Z", "needsDensity", "", "getAxisName", "()Ljava/lang/String;", "axisName", "Landroidx/compose/ui/text/font/FontVariation$SettingFloat;", "Landroidx/compose/ui/text/font/FontVariation$SettingInt;", "Landroidx/compose/ui/text/font/FontVariation$SettingTextUnit;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Setting {
        /* renamed from: getAxisName */
        java.lang.String getCamera2StreamConfigurationMap();

        /* renamed from: getNeedsDensity */
        boolean getGetHighSpeedVideoSizes();

        float toVariationValue(androidx.compose.ui.unit.Density density);
    }

    private FontVariation() {
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u00078\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Landroidx/compose/ui/text/font/FontVariation$Settings;", "", "Landroidx/compose/ui/text/font/FontVariation$Setting;", "settings", "<init>", "([Landroidx/compose/ui/text/font/FontVariation$Setting;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "Ljava/util/List;", "getSettings", "()Ljava/util/List;", "needsDensity", "Z", "getNeedsDensity$ui_text", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Settings {
        public static final int $stable = 0;
        private final boolean needsDensity;
        private final java.util.List<androidx.compose.ui.text.font.FontVariation.Setting> settings;

        public Settings(androidx.compose.ui.text.font.FontVariation.Setting... settingArr) {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            boolean z = false;
            for (androidx.compose.ui.text.font.FontVariation.Setting setting : settingArr) {
                java.lang.String camera2StreamConfigurationMap = setting.getCamera2StreamConfigurationMap();
                java.lang.Object obj = linkedHashMap.get(camera2StreamConfigurationMap);
                if (obj == null) {
                    obj = (java.util.List) new java.util.ArrayList();
                    linkedHashMap.put(camera2StreamConfigurationMap, obj);
                }
                ((java.util.List) obj).add(setting);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
                java.lang.String str = (java.lang.String) entry.getKey();
                java.util.List list = (java.util.List) entry.getValue();
                if (list.size() != 1) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("'");
                    sb.append(str);
                    sb.append("' must be unique. Actual [ [");
                    sb.append(kotlin.collections.CollectionsKt.joinToString$default(list, null, null, null, 0, null, null, 63, null));
                    sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
                    throw new java.lang.IllegalArgumentException(sb.toString().toString());
                }
                kotlin.collections.CollectionsKt.addAll(arrayList, list);
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList);
            this.settings = arrayList2;
            int size = arrayList2.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                if (((androidx.compose.ui.text.font.FontVariation.Setting) arrayList2.get(i)).getGetHighSpeedVideoSizes()) {
                    z = true;
                    break;
                }
                i++;
            }
            this.needsDensity = z;
        }

        public final java.util.List<androidx.compose.ui.text.font.FontVariation.Setting> getSettings() {
            return this.settings;
        }

        /* renamed from: getNeedsDensity$ui_text, reason: from getter */
        public final boolean getNeedsDensity() {
            return this.needsDensity;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof androidx.compose.ui.text.font.FontVariation.Settings) && kotlin.jvm.internal.Intrinsics.areEqual(this.settings, ((androidx.compose.ui.text.font.FontVariation.Settings) other).settings);
        }

        public final int hashCode() {
            return this.settings.hashCode();
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0014\u001a\u00020\f8\u0017X\u0097D¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c"}, d2 = {"Landroidx/compose/ui/text/font/FontVariation$SettingFloat;", "Landroidx/compose/ui/text/font/FontVariation$Setting;", "", "p0", "", "p1", "<init>", "(Ljava/lang/String;F)V", "Landroidx/compose/ui/unit/Density;", "toVariationValue", "(Landroidx/compose/ui/unit/Density;)F", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "getHighSpeedVideoSizes", "Ljava/lang/String;", "getAxisName", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "Z", "getNeedsDensity", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class SettingFloat implements androidx.compose.ui.text.font.FontVariation.Setting {
        private final float getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final boolean getHighSpeedVideoSizes;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final java.lang.String getHighSpeedVideoFpsRanges;

        public SettingFloat(java.lang.String str, float f) {
            this.getHighSpeedVideoFpsRanges = str;
            this.getHighResolutionOutputSizeshNQ4ISI = f;
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        /* renamed from: getAxisName, reason: from getter */
        public final java.lang.String getCamera2StreamConfigurationMap() {
            return this.getHighSpeedVideoFpsRanges;
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public final float toVariationValue(androidx.compose.ui.unit.Density p0) {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        /* renamed from: getNeedsDensity, reason: from getter */
        public final boolean getGetHighSpeedVideoSizes() {
            return this.getHighSpeedVideoSizes;
        }

        public final boolean equals(java.lang.Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof androidx.compose.ui.text.font.FontVariation.SettingFloat)) {
                return false;
            }
            androidx.compose.ui.text.font.FontVariation.SettingFloat settingFloat = (androidx.compose.ui.text.font.FontVariation.SettingFloat) p0;
            return kotlin.jvm.internal.Intrinsics.areEqual(getCamera2StreamConfigurationMap(), settingFloat.getCamera2StreamConfigurationMap()) && this.getHighResolutionOutputSizeshNQ4ISI == settingFloat.getHighResolutionOutputSizeshNQ4ISI;
        }

        public final int hashCode() {
            return (getCamera2StreamConfigurationMap().hashCode() * 31) + java.lang.Float.hashCode(this.getHighResolutionOutputSizeshNQ4ISI);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FontVariation.Setting(axisName='");
            sb.append(getCamera2StreamConfigurationMap());
            sb.append("', value=");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
            sb.append(')');
            return sb.toString();
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0014R\u0014\u0010\u001a\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\u00020\r8\u0017X\u0097D¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e"}, d2 = {"Landroidx/compose/ui/text/font/FontVariation$SettingTextUnit;", "Landroidx/compose/ui/text/font/FontVariation$Setting;", "", "p0", "Landroidx/compose/ui/unit/TextUnit;", "p1", "<init>", "(Ljava/lang/String;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/unit/Density;", "", "toVariationValue", "(Landroidx/compose/ui/unit/Density;)F", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Camera2StreamConfigurationMap", "Ljava/lang/String;", "getAxisName", "getHighSpeedVideoFpsRanges", "J", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "Z", "getNeedsDensity", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class SettingTextUnit implements androidx.compose.ui.text.font.FontVariation.Setting {
        private final java.lang.String Camera2StreamConfigurationMap;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final long getHighResolutionOutputSizeshNQ4ISI;
        private final boolean getHighSpeedVideoSizes;

        private SettingTextUnit(java.lang.String str, long j) {
            this.Camera2StreamConfigurationMap = str;
            this.getHighResolutionOutputSizeshNQ4ISI = j;
            this.getHighSpeedVideoSizes = true;
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        /* renamed from: getAxisName, reason: from getter */
        public final java.lang.String getCamera2StreamConfigurationMap() {
            return this.Camera2StreamConfigurationMap;
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public final float toVariationValue(androidx.compose.ui.unit.Density p0) {
            if (p0 != null) {
                return androidx.compose.ui.unit.TextUnit.m8795getValueimpl(this.getHighResolutionOutputSizeshNQ4ISI) * p0.getGetHighSpeedVideoFpsRangesFor();
            }
            androidx.compose.ui.text.internal.InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("density must not be null");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        /* renamed from: getNeedsDensity, reason: from getter */
        public final boolean getGetHighSpeedVideoSizes() {
            return this.getHighSpeedVideoSizes;
        }

        public final boolean equals(java.lang.Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof androidx.compose.ui.text.font.FontVariation.SettingTextUnit)) {
                return false;
            }
            androidx.compose.ui.text.font.FontVariation.SettingTextUnit settingTextUnit = (androidx.compose.ui.text.font.FontVariation.SettingTextUnit) p0;
            return kotlin.jvm.internal.Intrinsics.areEqual(getCamera2StreamConfigurationMap(), settingTextUnit.getCamera2StreamConfigurationMap()) && androidx.compose.ui.unit.TextUnit.m8792equalsimpl0(this.getHighResolutionOutputSizeshNQ4ISI, settingTextUnit.getHighResolutionOutputSizeshNQ4ISI);
        }

        public final int hashCode() {
            return (getCamera2StreamConfigurationMap().hashCode() * 31) + androidx.compose.ui.unit.TextUnit.m8796hashCodeimpl(this.getHighResolutionOutputSizeshNQ4ISI);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FontVariation.Setting(axisName='");
            sb.append(getCamera2StreamConfigurationMap());
            sb.append("', value=");
            sb.append((java.lang.Object) androidx.compose.ui.unit.TextUnit.m8802toStringimpl(this.getHighResolutionOutputSizeshNQ4ISI));
            sb.append(')');
            return sb.toString();
        }

        public /* synthetic */ SettingTextUnit(java.lang.String str, long j, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, j);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0014\u001a\u00020\r8\u0017X\u0097D¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d"}, d2 = {"Landroidx/compose/ui/text/font/FontVariation$SettingInt;", "Landroidx/compose/ui/text/font/FontVariation$Setting;", "", "p0", "", "p1", "<init>", "(Ljava/lang/String;I)V", "Landroidx/compose/ui/unit/Density;", "", "toVariationValue", "(Landroidx/compose/ui/unit/Density;)F", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Camera2StreamConfigurationMap", "Ljava/lang/String;", "getAxisName", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoSizes", "Z", "getNeedsDensity", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class SettingInt implements androidx.compose.ui.text.font.FontVariation.Setting {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final java.lang.String getHighSpeedVideoFpsRanges;
        private final int getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final boolean Camera2StreamConfigurationMap;

        public SettingInt(java.lang.String str, int i) {
            this.getHighSpeedVideoFpsRanges = str;
            this.getHighSpeedVideoFpsRangesFor = i;
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        /* renamed from: getAxisName, reason: from getter */
        public final java.lang.String getCamera2StreamConfigurationMap() {
            return this.getHighSpeedVideoFpsRanges;
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public final float toVariationValue(androidx.compose.ui.unit.Density p0) {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        /* renamed from: getNeedsDensity, reason: from getter */
        public final boolean getGetHighSpeedVideoSizes() {
            return this.Camera2StreamConfigurationMap;
        }

        public final boolean equals(java.lang.Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof androidx.compose.ui.text.font.FontVariation.SettingInt)) {
                return false;
            }
            androidx.compose.ui.text.font.FontVariation.SettingInt settingInt = (androidx.compose.ui.text.font.FontVariation.SettingInt) p0;
            return kotlin.jvm.internal.Intrinsics.areEqual(getCamera2StreamConfigurationMap(), settingInt.getCamera2StreamConfigurationMap()) && this.getHighSpeedVideoFpsRangesFor == settingInt.getHighSpeedVideoFpsRangesFor;
        }

        public final int hashCode() {
            return (getCamera2StreamConfigurationMap().hashCode() * 31) + this.getHighSpeedVideoFpsRangesFor;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FontVariation.Setting(axisName='");
            sb.append(getCamera2StreamConfigurationMap());
            sb.append("', value=");
            sb.append(this.getHighSpeedVideoFpsRangesFor);
            sb.append(')');
            return sb.toString();
        }
    }

    public final androidx.compose.ui.text.font.FontVariation.Setting Setting(java.lang.String name2, float value) {
        if (name2.length() != 4) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Name must be exactly four characters. Actual: '");
            sb.append(name2);
            sb.append('\'');
            androidx.compose.ui.text.internal.InlineClassHelperKt.throwIllegalArgumentException(sb.toString());
        }
        return new androidx.compose.ui.text.font.FontVariation.SettingFloat(name2, value);
    }

    public final androidx.compose.ui.text.font.FontVariation.Setting italic(float value) {
        if (0.0f > value || value > 1.0f) {
            androidx.compose.ui.text.internal.InlineClassHelperKt.throwIllegalArgumentException("'ital' must be in 0.0f..1.0f. Actual: ".concat(java.lang.String.valueOf(value)));
        }
        return new androidx.compose.ui.text.font.FontVariation.SettingFloat("ital", value);
    }

    /* renamed from: opticalSizing--R2X_6o, reason: not valid java name */
    public final androidx.compose.ui.text.font.FontVariation.Setting m8176opticalSizingR2X_6o(long textSize) {
        if (!androidx.compose.ui.unit.TextUnit.m8798isSpimpl(textSize)) {
            androidx.compose.ui.text.internal.InlineClassHelperKt.throwIllegalArgumentException("'opsz' must be provided in sp units");
        }
        return new androidx.compose.ui.text.font.FontVariation.SettingTextUnit("opsz", textSize, null);
    }

    public final androidx.compose.ui.text.font.FontVariation.Setting slant(float value) {
        if (-90.0f > value || value > 90.0f) {
            androidx.compose.ui.text.internal.InlineClassHelperKt.throwIllegalArgumentException("'slnt' must be in -90f..90f. Actual: ".concat(java.lang.String.valueOf(value)));
        }
        return new androidx.compose.ui.text.font.FontVariation.SettingFloat("slnt", value);
    }

    public final androidx.compose.ui.text.font.FontVariation.Setting width(float value) {
        if (value <= 0.0f) {
            androidx.compose.ui.text.internal.InlineClassHelperKt.throwIllegalArgumentException("'wdth' must be strictly > 0.0f. Actual: ".concat(java.lang.String.valueOf(value)));
        }
        return new androidx.compose.ui.text.font.FontVariation.SettingFloat("wdth", value);
    }

    public final androidx.compose.ui.text.font.FontVariation.Setting weight(int value) {
        if (value <= 0 || value >= 1001) {
            androidx.compose.ui.text.internal.InlineClassHelperKt.throwIllegalArgumentException("'wght' value must be in [1, 1000]. Actual: ".concat(java.lang.String.valueOf(value)));
        }
        return new androidx.compose.ui.text.font.FontVariation.SettingInt("wght", value);
    }

    /* renamed from: Settings-6EWAqTQ, reason: not valid java name */
    public final androidx.compose.ui.text.font.FontVariation.Settings m8175Settings6EWAqTQ(androidx.compose.ui.text.font.FontWeight weight, int style, androidx.compose.ui.text.font.FontVariation.Setting... settings) {
        kotlin.jvm.internal.SpreadBuilder spreadBuilder = new kotlin.jvm.internal.SpreadBuilder(3);
        spreadBuilder.add(weight(weight.getWeight()));
        spreadBuilder.add(italic(style));
        spreadBuilder.addSpread(settings);
        return new androidx.compose.ui.text.font.FontVariation.Settings((androidx.compose.ui.text.font.FontVariation.Setting[]) spreadBuilder.toArray(new androidx.compose.ui.text.font.FontVariation.Setting[spreadBuilder.size()]));
    }

    public final androidx.compose.ui.text.font.FontVariation.Setting grade(int value) {
        if (-1000 > value || value >= 1001) {
            androidx.compose.ui.text.internal.InlineClassHelperKt.throwIllegalArgumentException("'GRAD' must be in -1000..1000");
        }
        return new androidx.compose.ui.text.font.FontVariation.SettingInt("GRAD", value);
    }
}
