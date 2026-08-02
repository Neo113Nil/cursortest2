package kotlin.reflect.jvm.internal.impl.load.java;

/* loaded from: classes5.dex */
public final class Jsr305Settings {
    private final kotlin.Lazy Camera2StreamConfigurationMap;
    private final kotlin.reflect.jvm.internal.impl.load.java.ReportLevel getHighResolutionOutputSizeshNQ4ISI;
    private final java.util.Map<kotlin.reflect.jvm.internal.impl.name.FqName, kotlin.reflect.jvm.internal.impl.load.java.ReportLevel> getHighSpeedVideoFpsRanges;
    private final kotlin.reflect.jvm.internal.impl.load.java.ReportLevel getHighSpeedVideoFpsRangesFor;
    private final boolean getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    public Jsr305Settings(kotlin.reflect.jvm.internal.impl.load.java.ReportLevel reportLevel, kotlin.reflect.jvm.internal.impl.load.java.ReportLevel reportLevel2, java.util.Map<kotlin.reflect.jvm.internal.impl.name.FqName, ? extends kotlin.reflect.jvm.internal.impl.load.java.ReportLevel> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reportLevel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.getHighResolutionOutputSizeshNQ4ISI = reportLevel;
        this.getHighSpeedVideoFpsRangesFor = reportLevel2;
        this.getHighSpeedVideoFpsRanges = map;
        this.Camera2StreamConfigurationMap = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.Jsr305Settings$$Lambda$0
            private final kotlin.reflect.jvm.internal.impl.load.java.Jsr305Settings getHighResolutionOutputSizeshNQ4ISI;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                return kotlin.reflect.jvm.internal.impl.load.java.Jsr305Settings.getHighSpeedVideoSizes(this.getHighResolutionOutputSizeshNQ4ISI);
            }

            {
                this.getHighResolutionOutputSizeshNQ4ISI = this;
            }
        });
        this.getHighSpeedVideoSizes = reportLevel == kotlin.reflect.jvm.internal.impl.load.java.ReportLevel.IGNORE && reportLevel2 == kotlin.reflect.jvm.internal.impl.load.java.ReportLevel.IGNORE && map.isEmpty();
    }

    public final kotlin.reflect.jvm.internal.impl.load.java.ReportLevel getGlobalLevel() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final kotlin.reflect.jvm.internal.impl.load.java.ReportLevel getMigrationLevel() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public /* synthetic */ Jsr305Settings(kotlin.reflect.jvm.internal.impl.load.java.ReportLevel reportLevel, kotlin.reflect.jvm.internal.impl.load.java.ReportLevel reportLevel2, java.util.Map map, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(reportLevel, (i & 2) != 0 ? null : reportLevel2, (i & 4) != 0 ? kotlin.collections.MapsKt.emptyMap() : map);
    }

    public final java.util.Map<kotlin.reflect.jvm.internal.impl.name.FqName, kotlin.reflect.jvm.internal.impl.load.java.ReportLevel> getUserDefinedLevelForSpecificAnnotation() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final boolean isDisabled() {
        return this.getHighSpeedVideoSizes;
    }

    static /* synthetic */ java.lang.String[] getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.load.java.Jsr305Settings jsr305Settings) {
        java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
        createListBuilder.add(jsr305Settings.getHighResolutionOutputSizeshNQ4ISI.getDescription());
        kotlin.reflect.jvm.internal.impl.load.java.ReportLevel reportLevel = jsr305Settings.getHighSpeedVideoFpsRangesFor;
        if (reportLevel != null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("under-migration:");
            sb.append(reportLevel.getDescription());
            createListBuilder.add(sb.toString());
        }
        for (java.util.Map.Entry<kotlin.reflect.jvm.internal.impl.name.FqName, kotlin.reflect.jvm.internal.impl.load.java.ReportLevel> entry : jsr305Settings.getHighSpeedVideoFpsRanges.entrySet()) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("@");
            sb2.append(entry.getKey());
            sb2.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
            sb2.append(entry.getValue().getDescription());
            createListBuilder.add(sb2.toString());
        }
        return (java.lang.String[]) kotlin.collections.CollectionsKt.build(createListBuilder).toArray(new java.lang.String[0]);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Jsr305Settings(globalLevel=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(", migrationLevel=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", userDefinedLevelForSpecificAnnotation=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
        kotlin.reflect.jvm.internal.impl.load.java.ReportLevel reportLevel = this.getHighSpeedVideoFpsRangesFor;
        return (((hashCode * 31) + (reportLevel == null ? 0 : reportLevel.hashCode())) * 31) + this.getHighSpeedVideoFpsRanges.hashCode();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kotlin.reflect.jvm.internal.impl.load.java.Jsr305Settings)) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.load.java.Jsr305Settings jsr305Settings = (kotlin.reflect.jvm.internal.impl.load.java.Jsr305Settings) obj;
        return this.getHighResolutionOutputSizeshNQ4ISI == jsr305Settings.getHighResolutionOutputSizeshNQ4ISI && this.getHighSpeedVideoFpsRangesFor == jsr305Settings.getHighSpeedVideoFpsRangesFor && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, jsr305Settings.getHighSpeedVideoFpsRanges);
    }
}
