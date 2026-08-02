package com.apollographql.apollo.annotations;

@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.CONSTRUCTOR, java.lang.annotation.ElementType.ANNOTATION_TYPE})
@kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.CLASS, kotlin.annotation.AnnotationTarget.FUNCTION, kotlin.annotation.AnnotationTarget.PROPERTY, kotlin.annotation.AnnotationTarget.ANNOTATION_CLASS, kotlin.annotation.AnnotationTarget.CONSTRUCTOR, kotlin.annotation.AnnotationTarget.PROPERTY_SETTER, kotlin.annotation.AnnotationTarget.PROPERTY_GETTER, kotlin.annotation.AnnotationTarget.TYPEALIAS})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
@kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.SOURCE)
@kotlin.annotation.MustBeDocumented
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0001\u0005B\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002R\u0011\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/apollographql/apollo/annotations/ApolloDeprecatedSince;", "", "Lcom/apollographql/apollo/annotations/ApolloDeprecatedSince$Version;", "version", "()Lcom/apollographql/apollo/annotations/ApolloDeprecatedSince$Version;", "Version"}, k = 1, mv = {2, 0, 0}, xi = 48)
@java.lang.annotation.Documented
/* loaded from: classes.dex */
public @interface ApolloDeprecatedSince {
    com.apollographql.apollo.annotations.ApolloDeprecatedSince.Version version();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0015\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016"}, d2 = {"Lcom/apollographql/apollo/annotations/ApolloDeprecatedSince$Version;", "", "<init>", "(Ljava/lang/String;I)V", "v3_0_0", "v3_0_1", "v3_1_1", "v3_2_1", "v3_2_2", "v3_2_3", "v3_3_1", "v3_3_2", "v3_3_3", "v3_4_1", "v3_5_1", "v3_6_3", "v3_7_2", "v3_7_5", "v4_0_0", "v4_0_1", "v4_0_2", "v4_1_2", "v4_2_1"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Version {
        private static final /* synthetic */ com.apollographql.apollo.annotations.ApolloDeprecatedSince.Version[] getHighResolutionOutputSizeshNQ4ISI;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
        public static final com.apollographql.apollo.annotations.ApolloDeprecatedSince.Version v3_0_0;
        public static final com.apollographql.apollo.annotations.ApolloDeprecatedSince.Version v3_0_1;
        public static final com.apollographql.apollo.annotations.ApolloDeprecatedSince.Version v3_1_1;
        public static final com.apollographql.apollo.annotations.ApolloDeprecatedSince.Version v3_2_1;
        public static final com.apollographql.apollo.annotations.ApolloDeprecatedSince.Version v3_2_2;
        public static final com.apollographql.apollo.annotations.ApolloDeprecatedSince.Version v3_2_3;
        public static final com.apollographql.apollo.annotations.ApolloDeprecatedSince.Version v3_3_1;
        public static final com.apollographql.apollo.annotations.ApolloDeprecatedSince.Version v3_3_2;
        public static final com.apollographql.apollo.annotations.ApolloDeprecatedSince.Version v3_3_3;
        public static final com.apollographql.apollo.annotations.ApolloDeprecatedSince.Version v3_4_1;
        public static final com.apollographql.apollo.annotations.ApolloDeprecatedSince.Version v3_5_1;
        public static final com.apollographql.apollo.annotations.ApolloDeprecatedSince.Version v3_6_3;
        public static final com.apollographql.apollo.annotations.ApolloDeprecatedSince.Version v3_7_2;
        public static final com.apollographql.apollo.annotations.ApolloDeprecatedSince.Version v3_7_5;
        public static final com.apollographql.apollo.annotations.ApolloDeprecatedSince.Version v4_0_0;
        public static final com.apollographql.apollo.annotations.ApolloDeprecatedSince.Version v4_0_1;
        public static final com.apollographql.apollo.annotations.ApolloDeprecatedSince.Version v4_0_2;
        public static final com.apollographql.apollo.annotations.ApolloDeprecatedSince.Version v4_1_2;
        public static final com.apollographql.apollo.annotations.ApolloDeprecatedSince.Version v4_2_1;

        private Version(java.lang.String str, int i) {
        }

        static {
            com.apollographql.apollo.annotations.ApolloDeprecatedSince.Version version = new com.apollographql.apollo.annotations.ApolloDeprecatedSince.Version("v3_0_0", 0);
            v3_0_0 = version;
            com.apollographql.apollo.annotations.ApolloDeprecatedSince.Version version2 = new com.apollographql.apollo.annotations.ApolloDeprecatedSince.Version("v3_0_1", 1);
            v3_0_1 = version2;
            com.apollographql.apollo.annotations.ApolloDeprecatedSince.Version version3 = new com.apollographql.apollo.annotations.ApolloDeprecatedSince.Version("v3_1_1", 2);
            v3_1_1 = version3;
            com.apollographql.apollo.annotations.ApolloDeprecatedSince.Version version4 = new com.apollographql.apollo.annotations.ApolloDeprecatedSince.Version("v3_2_1", 3);
            v3_2_1 = version4;
            com.apollographql.apollo.annotations.ApolloDeprecatedSince.Version version5 = new com.apollographql.apollo.annotations.ApolloDeprecatedSince.Version("v3_2_2", 4);
            v3_2_2 = version5;
            com.apollographql.apollo.annotations.ApolloDeprecatedSince.Version version6 = new com.apollographql.apollo.annotations.ApolloDeprecatedSince.Version("v3_2_3", 5);
            v3_2_3 = version6;
            com.apollographql.apollo.annotations.ApolloDeprecatedSince.Version version7 = new com.apollographql.apollo.annotations.ApolloDeprecatedSince.Version("v3_3_1", 6);
            v3_3_1 = version7;
            com.apollographql.apollo.annotations.ApolloDeprecatedSince.Version version8 = new com.apollographql.apollo.annotations.ApolloDeprecatedSince.Version("v3_3_2", 7);
            v3_3_2 = version8;
            com.apollographql.apollo.annotations.ApolloDeprecatedSince.Version version9 = new com.apollographql.apollo.annotations.ApolloDeprecatedSince.Version("v3_3_3", 8);
            v3_3_3 = version9;
            com.apollographql.apollo.annotations.ApolloDeprecatedSince.Version version10 = new com.apollographql.apollo.annotations.ApolloDeprecatedSince.Version("v3_4_1", 9);
            v3_4_1 = version10;
            com.apollographql.apollo.annotations.ApolloDeprecatedSince.Version version11 = new com.apollographql.apollo.annotations.ApolloDeprecatedSince.Version("v3_5_1", 10);
            v3_5_1 = version11;
            com.apollographql.apollo.annotations.ApolloDeprecatedSince.Version version12 = new com.apollographql.apollo.annotations.ApolloDeprecatedSince.Version("v3_6_3", 11);
            v3_6_3 = version12;
            com.apollographql.apollo.annotations.ApolloDeprecatedSince.Version version13 = new com.apollographql.apollo.annotations.ApolloDeprecatedSince.Version("v3_7_2", 12);
            v3_7_2 = version13;
            com.apollographql.apollo.annotations.ApolloDeprecatedSince.Version version14 = new com.apollographql.apollo.annotations.ApolloDeprecatedSince.Version("v3_7_5", 13);
            v3_7_5 = version14;
            com.apollographql.apollo.annotations.ApolloDeprecatedSince.Version version15 = new com.apollographql.apollo.annotations.ApolloDeprecatedSince.Version("v4_0_0", 14);
            v4_0_0 = version15;
            com.apollographql.apollo.annotations.ApolloDeprecatedSince.Version version16 = new com.apollographql.apollo.annotations.ApolloDeprecatedSince.Version("v4_0_1", 15);
            v4_0_1 = version16;
            com.apollographql.apollo.annotations.ApolloDeprecatedSince.Version version17 = new com.apollographql.apollo.annotations.ApolloDeprecatedSince.Version("v4_0_2", 16);
            v4_0_2 = version17;
            com.apollographql.apollo.annotations.ApolloDeprecatedSince.Version version18 = new com.apollographql.apollo.annotations.ApolloDeprecatedSince.Version("v4_1_2", 17);
            v4_1_2 = version18;
            com.apollographql.apollo.annotations.ApolloDeprecatedSince.Version version19 = new com.apollographql.apollo.annotations.ApolloDeprecatedSince.Version("v4_2_1", 18);
            v4_2_1 = version19;
            com.apollographql.apollo.annotations.ApolloDeprecatedSince.Version[] versionArr = {version, version2, version3, version4, version5, version6, version7, version8, version9, version10, version11, version12, version13, version14, version15, version16, version17, version18, version19};
            getHighResolutionOutputSizeshNQ4ISI = versionArr;
            getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(versionArr);
        }

        public static com.apollographql.apollo.annotations.ApolloDeprecatedSince.Version valueOf(java.lang.String str) {
            return (com.apollographql.apollo.annotations.ApolloDeprecatedSince.Version) java.lang.Enum.valueOf(com.apollographql.apollo.annotations.ApolloDeprecatedSince.Version.class, str);
        }

        public static com.apollographql.apollo.annotations.ApolloDeprecatedSince.Version[] values() {
            return (com.apollographql.apollo.annotations.ApolloDeprecatedSince.Version[]) getHighResolutionOutputSizeshNQ4ISI.clone();
        }

        public static kotlin.enums.EnumEntries<com.apollographql.apollo.annotations.ApolloDeprecatedSince.Version> getEntries() {
            return getHighSpeedVideoFpsRangesFor;
        }
    }
}
