package com.inmobi.sdk;

import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.os.SystemClock;
import androidx.autofill.HintConstants;
import com.facebook.AuthenticationTokenClaims;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.inmobi.media.AbstractC3604bm;
import com.inmobi.media.AbstractC3648d9;
import com.inmobi.media.AbstractC3797ii;
import com.inmobi.media.AbstractC3904ma;
import com.inmobi.media.AbstractC3914mk;
import com.inmobi.media.AbstractC3940ni;
import com.inmobi.media.AbstractC3971ok;
import com.inmobi.media.AbstractC4027qk;
import com.inmobi.media.AbstractC4055rk;
import com.inmobi.media.AbstractC4083sk;
import com.inmobi.media.AbstractC4263z7;
import com.inmobi.media.Ba;
import com.inmobi.media.C3657di;
import com.inmobi.media.C3770hi;
import com.inmobi.media.C3810j3;
import com.inmobi.media.C3829jm;
import com.inmobi.media.C3845ka;
import com.inmobi.media.C3859kn;
import com.inmobi.media.C3886lk;
import com.inmobi.media.Cb;
import com.inmobi.media.Db;
import com.inmobi.media.EnumC3779i;
import com.inmobi.media.EnumC3944nm;
import com.inmobi.media.Gm;
import com.inmobi.media.Kc;
import com.inmobi.media.Mm;
import com.inmobi.media.Og;
import com.inmobi.media.Pa;
import com.inmobi.media.RunnableC3874la;
import com.inmobi.media.Ta;
import com.inmobi.media.Y1;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.inmobi.unifiedId.InMobiUnifiedIdService;
import com.ironsource.C4593pg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0011\bÆ\u0002\u0018\u00002\u00020\u0001:\u0005OPQRSJ9\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\n2\u0006\u0010 \u001a\u00020\rH\u0007¢\u0006\u0004\b!\u0010\u0015J\u0017\u0010$\u001a\u00020\n2\u0006\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b$\u0010%J\u0019\u0010'\u001a\u00020\n2\b\u0010&\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b'\u0010(J\u0019\u0010*\u001a\u00020\n2\b\u0010)\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b*\u0010(J-\u0010.\u001a\u00020\n2\b\u0010+\u001a\u0004\u0018\u00010\u00042\b\u0010,\u001a\u0004\u0018\u00010\u00042\b\u0010-\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\n2\u0006\u00100\u001a\u00020\u001cH\u0007¢\u0006\u0004\b1\u0010\u001fJ\u0017\u00104\u001a\u00020\n2\u0006\u00103\u001a\u000202H\u0007¢\u0006\u0004\b4\u00105J\u0017\u00108\u001a\u00020\n2\u0006\u00107\u001a\u000206H\u0007¢\u0006\u0004\b8\u00109J\u0019\u0010;\u001a\u00020\n2\b\u0010:\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b;\u0010(J\u0019\u0010=\u001a\u00020\n2\b\u0010<\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b=\u0010(J\u0019\u0010@\u001a\u00020\n2\b\u0010?\u001a\u0004\u0018\u00010>H\u0007¢\u0006\u0004\b@\u0010AJ\u0011\u0010B\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\bB\u0010\u0017J1\u0010B\u001a\u0004\u0018\u00010\u00042\u0014\u0010D\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010C2\b\u0010E\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\bB\u0010FJ\u0019\u0010H\u001a\u00020\n2\b\u0010G\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\bH\u0010\u0011J\u000f\u0010I\u001a\u00020\rH\u0007¢\u0006\u0004\bI\u0010JR\u0014\u0010K\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010M\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u0006\n\u0004\bM\u0010LR\u0014\u0010N\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u0006\n\u0004\bN\u0010L¨\u0006T"}, d2 = {"Lcom/inmobi/sdk/InMobiSdk;", "", "Landroid/content/Context;", "context", "", "accountId", "Lorg/json/JSONObject;", "consentObject", "Lcom/inmobi/sdk/SdkInitializationListener;", "sdkInitializationListener", "", "init", "(Landroid/content/Context;Ljava/lang/String;Lorg/json/JSONObject;Lcom/inmobi/sdk/SdkInitializationListener;)V", "", "initFromContentProvider", "(Landroid/content/Context;)Z", "updateGDPRConsent", "(Lorg/json/JSONObject;)V", "setPartnerGDPRConsent", "muted", "setApplicationMuted", "(Z)V", C4593pg.b, "()Ljava/lang/String;", "Lcom/inmobi/sdk/InMobiSdk$LogLevel;", "logLevel", "setLogLevel", "(Lcom/inmobi/sdk/InMobiSdk$LogLevel;)V", "", "age", "setAge", "(I)V", "isAgeRestricted", "setIsAgeRestricted", "Lcom/inmobi/sdk/InMobiSdk$AgeGroup;", "group", "setAgeGroup", "(Lcom/inmobi/sdk/InMobiSdk$AgeGroup;)V", "areaCode", "setAreaCode", "(Ljava/lang/String;)V", HintConstants.AUTOFILL_HINT_POSTAL_CODE, "setPostalCode", "city", "state", "country", "setLocationWithCityStateCountry", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "yearOfBirth", "setYearOfBirth", "Lcom/inmobi/sdk/InMobiSdk$Gender;", "gender", "setGender", "(Lcom/inmobi/sdk/InMobiSdk$Gender;)V", "Lcom/inmobi/sdk/InMobiSdk$Education;", "education", "setEducation", "(Lcom/inmobi/sdk/InMobiSdk$Education;)V", "language", "setLanguage", "interests", "setInterests", "Landroid/location/Location;", FirebaseAnalytics.Param.LOCATION, "setLocation", "(Landroid/location/Location;)V", "getToken", "", "extras", "keywords", "(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;", "jsonObject", "setPublisherProvidedUnifiedId", "isSDKInitialized", "()Z", "IM_GDPR_CONSENT_AVAILABLE", "Ljava/lang/String;", "IM_GDPR_CONSENT_IAB", "IM_GDPR_CONSENT_GDPR_APPLIES", "LogLevel", "Education", "PublisherSignals", "Gender", "AgeGroup", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InMobiSdk {
    public static final String IM_GDPR_CONSENT_AVAILABLE = "gdpr_consent_available";
    public static final String IM_GDPR_CONSENT_GDPR_APPLIES = "gdpr";
    public static final String IM_GDPR_CONSENT_IAB = "gdpr_consent";
    public static final InMobiSdk INSTANCE = new InMobiSdk();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u000e\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lcom/inmobi/sdk/InMobiSdk$AgeGroup;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "BELOW_18", "BETWEEN_18_AND_24", "BETWEEN_25_AND_29", "BETWEEN_30_AND_34", "BETWEEN_35_AND_44", "BETWEEN_45_AND_54", "BETWEEN_55_AND_65", "ABOVE_65", InAppPurchaseConstants.METHOD_TO_STRING, "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AgeGroup {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AgeGroup[] $VALUES;
        private final String value;
        public static final AgeGroup BELOW_18 = new AgeGroup("BELOW_18", 0, "below18");
        public static final AgeGroup BETWEEN_18_AND_24 = new AgeGroup("BETWEEN_18_AND_24", 1, "between18and24");
        public static final AgeGroup BETWEEN_25_AND_29 = new AgeGroup("BETWEEN_25_AND_29", 2, "between25and29");
        public static final AgeGroup BETWEEN_30_AND_34 = new AgeGroup("BETWEEN_30_AND_34", 3, "between30and34");
        public static final AgeGroup BETWEEN_35_AND_44 = new AgeGroup("BETWEEN_35_AND_44", 4, "between35and44");
        public static final AgeGroup BETWEEN_45_AND_54 = new AgeGroup("BETWEEN_45_AND_54", 5, "between45and54");
        public static final AgeGroup BETWEEN_55_AND_65 = new AgeGroup("BETWEEN_55_AND_65", 6, "between55and65");
        public static final AgeGroup ABOVE_65 = new AgeGroup("ABOVE_65", 7, "above65");

        private static final /* synthetic */ AgeGroup[] $values() {
            return new AgeGroup[]{BELOW_18, BETWEEN_18_AND_24, BETWEEN_25_AND_29, BETWEEN_30_AND_34, BETWEEN_35_AND_44, BETWEEN_45_AND_54, BETWEEN_55_AND_65, ABOVE_65};
        }

        static {
            AgeGroup[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private AgeGroup(String str, int i, String str2) {
            this.value = str2;
        }

        public static EnumEntries<AgeGroup> getEntries() {
            return $ENTRIES;
        }

        public static AgeGroup valueOf(String str) {
            return (AgeGroup) Enum.valueOf(AgeGroup.class, str);
        }

        public static AgeGroup[] values() {
            return (AgeGroup[]) $VALUES.clone();
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\t\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lcom/inmobi/sdk/InMobiSdk$Education;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "HIGH_SCHOOL_OR_LESS", "COLLEGE_OR_GRADUATE", "POST_GRADUATE_OR_ABOVE", InAppPurchaseConstants.METHOD_TO_STRING, "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Education {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Education[] $VALUES;
        private final String value;
        public static final Education HIGH_SCHOOL_OR_LESS = new Education("HIGH_SCHOOL_OR_LESS", 0, "highschoolorless");
        public static final Education COLLEGE_OR_GRADUATE = new Education("COLLEGE_OR_GRADUATE", 1, "collegeorgraduate");
        public static final Education POST_GRADUATE_OR_ABOVE = new Education("POST_GRADUATE_OR_ABOVE", 2, "postgraduateorabove");

        private static final /* synthetic */ Education[] $values() {
            return new Education[]{HIGH_SCHOOL_OR_LESS, COLLEGE_OR_GRADUATE, POST_GRADUATE_OR_ABOVE};
        }

        static {
            Education[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private Education(String str, int i, String str2) {
            this.value = str2;
        }

        public static EnumEntries<Education> getEntries() {
            return $ENTRIES;
        }

        public static Education valueOf(String str) {
            return (Education) Enum.valueOf(Education.class, str);
        }

        public static Education[] values() {
            return (Education[]) $VALUES.clone();
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lcom/inmobi/sdk/InMobiSdk$Gender;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "FEMALE", "MALE", InAppPurchaseConstants.METHOD_TO_STRING, "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Gender {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Gender[] $VALUES;
        public static final Gender FEMALE = new Gender("FEMALE", 0, "f");
        public static final Gender MALE = new Gender("MALE", 1, InneractiveMediationDefs.GENDER_MALE);
        private final String value;

        private static final /* synthetic */ Gender[] $values() {
            return new Gender[]{FEMALE, MALE};
        }

        static {
            Gender[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private Gender(String str, int i, String str2) {
            this.value = str2;
        }

        public static EnumEntries<Gender> getEntries() {
            return $ENTRIES;
        }

        public static Gender valueOf(String str) {
            return (Gender) Enum.valueOf(Gender.class, str);
        }

        public static Gender[] values() {
            return (Gender[]) $VALUES.clone();
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/inmobi/sdk/InMobiSdk$LogLevel;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "ERROR", "DEBUG", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LogLevel {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ LogLevel[] $VALUES;
        public static final LogLevel NONE = new LogLevel("NONE", 0);
        public static final LogLevel ERROR = new LogLevel("ERROR", 1);
        public static final LogLevel DEBUG = new LogLevel("DEBUG", 2);

        private static final /* synthetic */ LogLevel[] $values() {
            return new LogLevel[]{NONE, ERROR, DEBUG};
        }

        static {
            LogLevel[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private LogLevel(String str, int i) {
        }

        public static EnumEntries<LogLevel> getEntries() {
            return $ENTRIES;
        }

        public static LogLevel valueOf(String str) {
            return (LogLevel) Enum.valueOf(LogLevel.class, str);
        }

        public static LogLevel[] values() {
            return (LogLevel[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\u00020\u00052\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/inmobi/sdk/InMobiSdk$PublisherSignals;", "", "", "", "signals", "", "putPublisherSignals", "(Ljava/util/Map;)V", "getPublisherSignals", "()Ljava/util/Map;", "resetPublisherSignals", "()V", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PublisherSignals {
        public static final PublisherSignals INSTANCE = new PublisherSignals();

        /* JADX WARN: Removed duplicated region for block: B:23:0x009d A[Catch: Exception -> 0x0179, TryCatch #0 {Exception -> 0x0179, blocks: (B:5:0x000f, B:7:0x001e, B:10:0x0025, B:20:0x0067, B:21:0x0097, B:23:0x009d, B:26:0x00b9, B:28:0x00d0, B:29:0x00dd, B:32:0x00d5, B:35:0x00e1, B:36:0x010b, B:38:0x0111, B:41:0x012d, B:43:0x0135, B:44:0x0142, B:47:0x013a, B:50:0x0146, B:51:0x0153, B:53:0x0159, B:56:0x016d, B:64:0x0059, B:14:0x002a, B:16:0x0037, B:19:0x003e, B:62:0x0043), top: B:4:0x000f, inners: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0111 A[Catch: Exception -> 0x0179, TryCatch #0 {Exception -> 0x0179, blocks: (B:5:0x000f, B:7:0x001e, B:10:0x0025, B:20:0x0067, B:21:0x0097, B:23:0x009d, B:26:0x00b9, B:28:0x00d0, B:29:0x00dd, B:32:0x00d5, B:35:0x00e1, B:36:0x010b, B:38:0x0111, B:41:0x012d, B:43:0x0135, B:44:0x0142, B:47:0x013a, B:50:0x0146, B:51:0x0153, B:53:0x0159, B:56:0x016d, B:64:0x0059, B:14:0x002a, B:16:0x0037, B:19:0x003e, B:62:0x0043), top: B:4:0x000f, inners: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0159 A[Catch: Exception -> 0x0179, TryCatch #0 {Exception -> 0x0179, blocks: (B:5:0x000f, B:7:0x001e, B:10:0x0025, B:20:0x0067, B:21:0x0097, B:23:0x009d, B:26:0x00b9, B:28:0x00d0, B:29:0x00dd, B:32:0x00d5, B:35:0x00e1, B:36:0x010b, B:38:0x0111, B:41:0x012d, B:43:0x0135, B:44:0x0142, B:47:0x013a, B:50:0x0146, B:51:0x0153, B:53:0x0159, B:56:0x016d, B:64:0x0059, B:14:0x002a, B:16:0x0037, B:19:0x003e, B:62:0x0043), top: B:4:0x000f, inners: #1 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Map<String, Object> getPublisherSignals() {
            Map emptyMap;
            SignalsConfig.PublisherConfig d;
            if (!InMobiSdk.isSDKInitialized()) {
                String access$getTAG$p = InMobiSdk.access$getTAG$p();
                Intrinsics.checkNotNullExpressionValue(access$getTAG$p, "access$getTAG$p(...)");
                Kc.a((byte) 1, access$getTAG$p, "SDK not initialized. Cannot get publisher signals.");
                return null;
            }
            C3770hi c3770hi = C3770hi.f7146a;
            c3770hi.getClass();
            try {
                SignalsConfig.PublisherConfig d2 = C3770hi.d();
                Map map = AbstractC3797ii.f7164a;
                Intrinsics.checkNotNullParameter(d2, "<this>");
                if (!d2.getEnableMCO() && !d2.getEnableAB()) {
                    return MapsKt.emptyMap();
                }
                try {
                    d = C3770hi.d();
                    Intrinsics.checkNotNullParameter(d, "<this>");
                } catch (Exception e) {
                    Lazy lazy = Ba.f6473a;
                    Ba.a(new C3810j3(e));
                    emptyMap = MapsKt.emptyMap();
                }
                if (!d.getEnableMCO() && !d.getEnableAB()) {
                    emptyMap = MapsKt.emptyMap();
                    Map mutableMap = MapsKt.toMutableMap(emptyMap);
                    for (Pair pair : CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(C3770hi.d().getObj(), "o_i_dep"), TuplesKt.to(C3770hi.d().getDirect(), "d_i_dep")})) {
                        SignalsConfig.PublisherConfig.BaseInputData baseInputData = (SignalsConfig.PublisherConfig.BaseInputData) pair.component1();
                        String str = (String) pair.component2();
                        if (baseInputData.getDepth().getEnabled()) {
                            C3770hi c3770hi2 = C3770hi.f7146a;
                            c3770hi2.getClass();
                            JSONArray optJSONArray = ((JSONObject) C3770hi.f.getValue(c3770hi2, C3770hi.b[1])).optJSONArray(str);
                            mutableMap.put(str, optJSONArray != null ? AbstractC3797ii.a(optJSONArray) : AbstractC3797ii.a(AbstractC3797ii.a()));
                        }
                    }
                    for (Pair pair2 : CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(C3770hi.d().getObj(), "o_s_dep"), TuplesKt.to(C3770hi.d().getDirect(), "d_s_dep")})) {
                        SignalsConfig.PublisherConfig.BaseInputData baseInputData2 = (SignalsConfig.PublisherConfig.BaseInputData) pair2.component1();
                        String str2 = (String) pair2.component2();
                        if (baseInputData2.getDepth().getSessionEnabled()) {
                            JSONArray optJSONArray2 = C3770hi.g.optJSONArray(str2);
                            mutableMap.put(str2, optJSONArray2 != null ? AbstractC3797ii.a(optJSONArray2) : AbstractC3797ii.a(AbstractC3797ii.a()));
                        }
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : mutableMap.entrySet()) {
                        if (!StringsKt.startsWith$default((String) entry.getKey(), "auto_", false, 2, (Object) null)) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    return linkedHashMap;
                }
                emptyMap = MapsKt.plus(AbstractC3797ii.a(c3770hi.c(), C3770hi.d()), c3770hi.e());
                Map mutableMap2 = MapsKt.toMutableMap(emptyMap);
                while (r1.hasNext()) {
                }
                while (r1.hasNext()) {
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (r0.hasNext()) {
                }
                return linkedHashMap2;
            } catch (Exception e2) {
                Lazy lazy2 = Ba.f6473a;
                Ba.a(new C3810j3(e2));
                Kc.a((byte) 1, "PubSignals", "Publisher signals could not be retrieved.");
                return MapsKt.emptyMap();
            }
        }

        public final void putPublisherSignals(Map<String, ? extends Object> signals) {
            if (!InMobiSdk.isSDKInitialized()) {
                String access$getTAG$p = InMobiSdk.access$getTAG$p();
                Intrinsics.checkNotNullExpressionValue(access$getTAG$p, "access$getTAG$p(...)");
                Kc.a((byte) 1, access$getTAG$p, "SDK not initialized. Cannot set publisher signals.");
            } else if (signals != null) {
                C3770hi.f7146a.getClass();
                C3770hi.a(signals);
            }
        }

        public final void resetPublisherSignals() {
            Job launch$default;
            if (!InMobiSdk.isSDKInitialized()) {
                String access$getTAG$p = InMobiSdk.access$getTAG$p();
                Intrinsics.checkNotNullExpressionValue(access$getTAG$p, "access$getTAG$p(...)");
                Kc.a((byte) 1, access$getTAG$p, "SDK not initialized. Cannot reset publisher signals.");
                return;
            }
            C3770hi.f7146a.getClass();
            Context context = AbstractC3914mk.f7252a;
            if (context != null) {
                launch$default = BuildersKt__Builders_commonKt.launch$default(AbstractC3904ma.f, null, null, new C3657di(context, null), 3, null);
                if (launch$default != null) {
                    return;
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public static void a(Pa initRequest, String str) {
        List<SdkInitializationListener> emptyList;
        byte b = initRequest.c;
        if (b == 1) {
            b(initRequest, str);
            return;
        }
        if (b == 2) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - initRequest.f;
            byte b2 = initRequest.c;
            AbstractC4055rk.a(b2 == 1 ? "PROVIDER" : b2 == 2 ? "PUBLISHER" : "NONE", AbstractC3914mk.c, str, Long.valueOf(elapsedRealtime));
            Context context = initRequest.f6780a;
            Long valueOf = Long.valueOf(elapsedRealtime);
            Ta ta = Ta.f6869a;
            Ta.a(context, "SdkInitFailed", valueOf, Short.valueOf(Ta.a(str)));
            AtomicBoolean atomicBoolean = AbstractC4027qk.f7332a;
            Intrinsics.checkNotNullParameter(initRequest, "initRequest");
            if (initRequest.c == 2) {
                SdkInitializationListener sdkInitializationListener = initRequest.e;
                emptyList = sdkInitializationListener != null ? CollectionsKt.listOf(sdkInitializationListener) : null;
                if (emptyList == null) {
                    emptyList = CollectionsKt.emptyList();
                }
            } else {
                emptyList = CollectionsKt.emptyList();
            }
            if (emptyList.isEmpty()) {
                return;
            }
            for (SdkInitializationListener sdkInitializationListener2 : emptyList) {
                INSTANCE.getClass();
                sdkInitializationListener2.onInitializationComplete(new Error(str));
            }
        }
    }

    public static final /* synthetic */ String access$getTAG$p() {
        return "InMobiSdk";
    }

    public static final /* synthetic */ void access$onInitCompleted(InMobiSdk inMobiSdk, Pa pa, String str) {
        inMobiSdk.getClass();
        b(pa, str);
    }

    public static final Unit b(Context context, String providerAccountId) {
        Intrinsics.checkNotNullParameter(providerAccountId, "providerAccountId");
        INSTANCE.getClass();
        a(context, providerAccountId, null, null, (byte) 1);
        return Unit.INSTANCE;
    }

    @JvmStatic
    public static final String getToken() {
        return getToken(null, null);
    }

    @JvmStatic
    public static final String getVersion() {
        return "11.4.0";
    }

    @JvmStatic
    public static final void init(Context context, final String accountId, final JSONObject consentObject, final SdkInitializationListener sdkInitializationListener) {
        Intrinsics.checkNotNullExpressionValue("InMobiSdk", "TAG");
        final Context applicationContext = context != null ? context.getApplicationContext() : null;
        Context context2 = AbstractC3914mk.f7252a;
        if (context2 == null) {
            context2 = applicationContext;
        }
        Long a2 = AbstractC4027qk.a();
        Ta ta = Ta.f6869a;
        Ta.a(context2, "SdkInitStarted", a2, null);
        if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            AbstractC3604bm.a(new Runnable() { // from class: com.inmobi.sdk.InMobiSdk$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    InMobiSdk.a(applicationContext, accountId, consentObject, sdkInitializationListener);
                }
            });
        } else {
            INSTANCE.getClass();
            a(applicationContext, accountId, consentObject, sdkInitializationListener, (byte) 2);
        }
    }

    @JvmStatic
    public static final boolean initFromContentProvider(Context context) {
        Intrinsics.checkNotNullExpressionValue("InMobiSdk", "TAG");
        final Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (applicationContext == null) {
            Intrinsics.checkNotNullExpressionValue("InMobiSdk", "TAG");
            return false;
        }
        if (!AbstractC4027qk.f7332a.compareAndSet(false, true)) {
            Intrinsics.checkNotNullExpressionValue("InMobiSdk", "TAG");
            return false;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            return AbstractC4027qk.a(applicationContext, currentTimeMillis, elapsedRealtime, new Function1() { // from class: com.inmobi.sdk.InMobiSdk$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InMobiSdk.a(applicationContext, (String) obj);
                }
            });
        }
        AbstractC3604bm.a(new Runnable() { // from class: com.inmobi.sdk.InMobiSdk$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                InMobiSdk.a(applicationContext, currentTimeMillis, elapsedRealtime);
            }
        });
        return true;
    }

    @JvmStatic
    public static final boolean isSDKInitialized() {
        return AbstractC3914mk.c();
    }

    @JvmStatic
    public static final void setAge(int age) {
        Context context = AbstractC3914mk.f7252a;
        if (age != Integer.MIN_VALUE) {
            AbstractC3940ni.f7268a = age;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Db.b;
                Cb.a(context, "user_info_store").a("user_age", age, false);
            }
        }
    }

    @JvmStatic
    public static final void setAgeGroup(AgeGroup group) {
        Intrinsics.checkNotNullParameter(group, "group");
        String ageGroup = group.toString();
        Locale ENGLISH = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
        String lowerCase = ageGroup.toLowerCase(ENGLISH);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        Context context = AbstractC3914mk.f7252a;
        if (lowerCase != null) {
            AbstractC3940ni.c = lowerCase;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Db.b;
                Cb.a(context, "user_info_store").a("user_age_group", lowerCase, false);
            }
        }
    }

    @JvmStatic
    public static final void setApplicationMuted(boolean muted) {
        AbstractC3914mk.g = muted;
    }

    @JvmStatic
    public static final void setAreaCode(String areaCode) {
        Context context = AbstractC3914mk.f7252a;
        AbstractC3940ni.d = areaCode;
        if (context == null || areaCode == null) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = Db.b;
        Cb.a(context, "user_info_store").a("user_area_code", areaCode, false);
    }

    @JvmStatic
    public static final void setEducation(Education education) {
        Intrinsics.checkNotNullParameter(education, "education");
        String education2 = education.toString();
        Locale ENGLISH = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
        String lowerCase = education2.toLowerCase(ENGLISH);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        Context context = AbstractC3914mk.f7252a;
        if (lowerCase != null) {
            AbstractC3940ni.k = lowerCase;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Db.b;
                Cb.a(context, "user_info_store").a("user_education", lowerCase, false);
            }
        }
    }

    @JvmStatic
    public static final void setGender(Gender gender) {
        Intrinsics.checkNotNullParameter(gender, "gender");
        String gender2 = gender.toString();
        Locale ENGLISH = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
        String lowerCase = gender2.toLowerCase(ENGLISH);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        Context context = AbstractC3914mk.f7252a;
        if (lowerCase != null) {
            AbstractC3940ni.j = lowerCase;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Db.b;
                Cb.a(context, "user_info_store").a(AuthenticationTokenClaims.JSON_KEY_USER_GENDER, lowerCase, false);
            }
        }
    }

    @JvmStatic
    public static final void setInterests(String interests) {
        Context context = AbstractC3914mk.f7252a;
        if (interests != null) {
            AbstractC3940ni.m = interests;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Db.b;
                Cb.a(context, "user_info_store").a("user_interest", interests, false);
            }
        }
    }

    @JvmStatic
    public static final void setIsAgeRestricted(boolean isAgeRestricted) {
        AbstractC3940ni.a(isAgeRestricted);
        Mm.a(isAgeRestricted);
        if (isAgeRestricted) {
            InMobiUnifiedIdService.reset();
            AbstractC3648d9.a(null);
        }
    }

    @JvmStatic
    public static final void setLanguage(String language) {
        Context context = AbstractC3914mk.f7252a;
        if (language != null) {
            AbstractC3940ni.l = language;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Db.b;
                Cb.a(context, "user_info_store").a("user_language", language, false);
            }
        }
    }

    @JvmStatic
    public static final void setLocation(Location location) {
        Context context = AbstractC3914mk.f7252a;
        if (location != null) {
            AbstractC3940ni.n = location;
            if (context != null) {
                String a2 = AbstractC3940ni.a(location);
                ConcurrentHashMap concurrentHashMap = Db.b;
                Cb.a(context, "user_info_store").a(AuthenticationTokenClaims.JSON_KEY_USER_LOCATION, a2, false);
            }
        }
    }

    @JvmStatic
    public static final void setLocationWithCityStateCountry(String city, String state, String country) {
        Context context = AbstractC3914mk.f7252a;
        if (city != null) {
            AbstractC3940ni.f = city;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Db.b;
                Cb.a(context, "user_info_store").a("user_city_code", city, false);
            }
        }
        Context context2 = AbstractC3914mk.f7252a;
        if (state != null) {
            AbstractC3940ni.g = state;
            if (context2 != null) {
                ConcurrentHashMap concurrentHashMap2 = Db.b;
                Cb.a(context2, "user_info_store").a("user_state_code", state, false);
            }
        }
        Context context3 = AbstractC3914mk.f7252a;
        if (country != null) {
            AbstractC3940ni.h = country;
            if (context3 != null) {
                ConcurrentHashMap concurrentHashMap3 = Db.b;
                Cb.a(context3, "user_info_store").a("user_country_code", country, false);
            }
        }
    }

    @JvmStatic
    public static final void setLogLevel(LogLevel logLevel) {
        int i = logLevel == null ? -1 : a.f7533a[logLevel.ordinal()];
        if (i == 1) {
            Kc.f6670a = (byte) 0;
            return;
        }
        if (i == 2) {
            Kc.f6670a = (byte) 1;
        } else if (i != 3) {
            Kc.f6670a = (byte) 2;
        } else {
            Kc.f6670a = (byte) 2;
        }
    }

    @JvmStatic
    public static final void setPartnerGDPRConsent(JSONObject consentObject) {
        if (consentObject != null) {
            AbstractC4263z7.b = consentObject;
        }
    }

    @JvmStatic
    public static final void setPostalCode(String postalCode) {
        Context context = AbstractC3914mk.f7252a;
        if (postalCode != null) {
            AbstractC3940ni.e = postalCode;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Db.b;
                Cb.a(context, "user_info_store").a("user_post_code", postalCode, false);
            }
        }
    }

    @JvmStatic
    public static final void setPublisherProvidedUnifiedId(JSONObject jsonObject) {
        Intrinsics.checkNotNullExpressionValue("InMobiSdk", "TAG");
        String str = "setPublisherProvidedUnifiedId " + jsonObject;
        RunnableC3874la runnable = new RunnableC3874la(jsonObject);
        Context context = AbstractC3914mk.f7252a;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        AbstractC3914mk.h.submit(runnable);
    }

    @JvmStatic
    public static final void setYearOfBirth(int yearOfBirth) {
        Context context = AbstractC3914mk.f7252a;
        if (yearOfBirth != Integer.MIN_VALUE) {
            AbstractC3940ni.i = yearOfBirth;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Db.b;
                Cb.a(context, "user_info_store").a("user_yob", yearOfBirth, false);
            }
        }
    }

    @JvmStatic
    public static final void updateGDPRConsent(JSONObject consentObject) {
        AbstractC4263z7.a(consentObject);
    }

    @JvmStatic
    public static final String getToken(Map<String, String> extras, String keywords) {
        return Gm.a(extras, keywords);
    }

    public static void b(Pa initRequest, String str) {
        String str2;
        SdkInitializationListener sdkInitializationListener;
        long elapsedRealtime = SystemClock.elapsedRealtime() - initRequest.f;
        byte b = initRequest.c;
        if (b == 1) {
            str2 = "PROVIDER";
        } else if (b == 2) {
            str2 = "PUBLISHER";
        } else {
            str2 = "NONE";
        }
        AbstractC4055rk.a(str2, AbstractC3914mk.c, str, Long.valueOf(elapsedRealtime));
        Ta ta = Ta.f6869a;
        Intrinsics.checkNotNullParameter(initRequest, "initRequest");
        Short valueOf = str != null ? Short.valueOf(Ta.a(str)) : null;
        if (initRequest.c == 1) {
            if (valueOf == null) {
                Map mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("latency", Long.valueOf(elapsedRealtime)));
                C3829jm c3829jm = C3829jm.f7187a;
                C3829jm.b("PreInitCompleted", mutableMapOf, EnumC3944nm.f7271a);
            } else {
                Ta.a(initRequest.f6780a, "SdkInitFailed", Long.valueOf(elapsedRealtime), valueOf);
            }
        } else if (valueOf != null) {
            Ta.a(initRequest.f6780a, "SdkInitFailed", Long.valueOf(elapsedRealtime), valueOf);
        }
        AtomicBoolean atomicBoolean = AbstractC4027qk.f7332a;
        Intrinsics.checkNotNullParameter(initRequest, "initRequest");
        ArrayList arrayList = new ArrayList();
        if (initRequest.c == 2 && (sdkInitializationListener = initRequest.e) != null) {
            arrayList.add(sdkInitializationListener);
        }
        if (AbstractC4027qk.c == initRequest.c) {
            ArrayList arrayList2 = AbstractC4027qk.e;
            arrayList.addAll(arrayList2);
            arrayList2.clear();
            AbstractC4027qk.f = (byte) 0;
            AbstractC4027qk.c = (byte) 0;
        }
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            SdkInitializationListener sdkInitializationListener2 = (SdkInitializationListener) it.next();
            INSTANCE.getClass();
            sdkInitializationListener2.onInitializationComplete(str == null ? null : new Error(str));
        }
    }

    public static Pa a(Pa pa, Context context, byte b) {
        if (b == 1) {
            Context context2 = AbstractC3914mk.f7252a;
            if (context2 == null) {
                context = context != null ? context.getApplicationContext() : null;
            } else {
                context = context2;
            }
        }
        if (context == null) {
            a(pa, SdkInitializationListener.MISSING_CONTEXT);
            return null;
        }
        String str = pa.b;
        if (str == null) {
            a(Pa.a(pa, context, null, 62), "Account id cannot be empty. Please provide a valid account id.");
            return null;
        }
        C3859kn c3859kn = C3859kn.f7207a;
        if (C3859kn.a()) {
            a(Pa.a(pa, context, null, 62), "SDK could not be initialized; Required dependency could not be found. Please check out documentation and include the required dependency.");
            return null;
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = Intrinsics.compare((int) str.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        String obj = str.subSequence(i, length + 1).toString();
        if (obj.length() == 0) {
            a(Pa.a(pa, context, null, 62), "Account id cannot be empty. Please provide a valid account id.");
            return null;
        }
        return Pa.a(pa, context, obj, 60);
    }

    public static final void a(Context context, String str, JSONObject jSONObject, SdkInitializationListener sdkInitializationListener) {
        INSTANCE.getClass();
        a(context, str, jSONObject, sdkInitializationListener, (byte) 2);
    }

    public static final Unit a(Context context, String providerAccountId) {
        Intrinsics.checkNotNullParameter(providerAccountId, "providerAccountId");
        INSTANCE.getClass();
        a(context, providerAccountId, null, null, (byte) 1);
        return Unit.INSTANCE;
    }

    public static final void a(final Context context, long j, long j2) {
        AtomicBoolean atomicBoolean = AbstractC4027qk.f7332a;
        AbstractC4027qk.a(context, j, j2, new Function1() { // from class: com.inmobi.sdk.InMobiSdk$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InMobiSdk.b(context, (String) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059 A[Catch: Exception -> 0x014d, TRY_LEAVE, TryCatch #1 {Exception -> 0x014d, blocks: (B:3:0x0021, B:5:0x0027, B:7:0x002b, B:14:0x004b, B:19:0x0059, B:23:0x0061, B:25:0x0065, B:28:0x006d, B:30:0x0075, B:33:0x0085, B:35:0x0090, B:37:0x009d, B:38:0x00a0, B:41:0x00bc, B:43:0x00cd, B:45:0x00d5, B:46:0x00da, B:49:0x00e3, B:51:0x0105, B:53:0x0115, B:58:0x00b2, B:69:0x0036, B:72:0x003e, B:75:0x0044), top: B:2:0x0021 }] */
    /* JADX WARN: Type inference failed for: r10v0, types: [T, com.inmobi.media.Pa] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r6v3, types: [T, com.inmobi.media.Pa] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(Context context, String str, JSONObject jSONObject, SdkInitializationListener sdkInitializationListener, byte b) {
        Ref.ObjectRef objectRef;
        byte b2;
        ?? a2;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        objectRef2.element = new Pa(context, str, b, jSONObject, sdkInitializationListener, elapsedRealtime);
        try {
            AtomicBoolean atomicBoolean = AbstractC4027qk.f7332a;
            objectRef = 2;
            if (b == 2 && AbstractC4027qk.d) {
                AbstractC4027qk.d = false;
            }
            boolean z = b == 2;
            if (b == 2) {
                if (AbstractC3914mk.c()) {
                    b2 = 1;
                } else if (AbstractC4027qk.c == 1) {
                    b2 = 2;
                } else if (AbstractC3914mk.j == 1) {
                    b2 = 3;
                }
                a2 = a((Pa) objectRef2.element, context, b2);
                if (a2 != 0) {
                    return;
                }
                objectRef2.element = a2;
                Context context2 = a2.f6780a;
                try {
                    if (context2 != null) {
                        String accountId = a2.b;
                        if (accountId != null) {
                            if (AbstractC3971ok.a(a2)) {
                                a((Pa) objectRef2.element, SdkInitializationListener.ACCOUNT_ID_DIFFERENT);
                                return;
                            }
                            EnumC3779i b3 = AbstractC3971ok.b((Pa) objectRef2.element);
                            if (b3 == EnumC3779i.b) {
                                Intrinsics.checkNotNullExpressionValue("InMobiSdk", "TAG");
                                a((Pa) objectRef2.element, SdkInitializationListener.ACCOUNT_ID_DIFFERENT);
                                return;
                            }
                            T t = objectRef2.element;
                            byte b4 = ((Pa) t).c;
                            JSONObject jSONObject2 = ((Pa) t).d;
                            if (b4 == 2) {
                                AbstractC4263z7.a(jSONObject2);
                            }
                            byte a3 = AbstractC4083sk.a((Pa) objectRef2.element, b2);
                            T t2 = objectRef2.element;
                            Pa pa = (Pa) t2;
                            if (a3 != 0) {
                                if (a3 == 1) {
                                    Intrinsics.checkNotNullExpressionValue("InMobiSdk", "TAG");
                                    b(pa, (String) null);
                                    return;
                                } else if (a3 == 2) {
                                    return;
                                }
                            }
                            AbstractC4027qk.c = ((Pa) t2).c;
                            Intrinsics.checkNotNullParameter(context2, "context");
                            if (!Og.a(context2, "android.permission.ACCESS_COARSE_LOCATION") && !Og.a(context2, "android.permission.ACCESS_FINE_LOCATION")) {
                                Kc.a((byte) 1, "InMobiSdk", "Please grant the location permissions (ACCESS_COARSE_LOCATION or ACCESS_FINE_LOCATION, or both) for better ad targeting.");
                            }
                            boolean z2 = ((Pa) objectRef2.element).c == 2;
                            Context context3 = AbstractC3914mk.f7252a;
                            Intrinsics.checkNotNullParameter(context2, "context");
                            Intrinsics.checkNotNullParameter(accountId, "accountId");
                            Intrinsics.checkNotNullParameter(context2, "context");
                            AbstractC3914mk.f7252a = context2.getApplicationContext();
                            AbstractC3914mk.d.set(z2);
                            AbstractC3914mk.c = accountId;
                            AbstractC3914mk.j = 1;
                            if (!AbstractC3914mk.c(context2)) {
                                AbstractC3914mk.c = null;
                                AbstractC3914mk.f7252a = null;
                                AbstractC3914mk.j = 3;
                                b((Pa) objectRef2.element, SdkInitializationListener.MISSING_WEBVIEW_DEPENDENCY);
                                return;
                            }
                            C3859kn c3859kn = C3859kn.f7207a;
                            Intrinsics.checkNotNullParameter(context2, "context");
                            Y1.a(context2, C3859kn.d, z2);
                            AbstractC4055rk.a();
                            C3845ka runnable = new C3845ka(b3, context2, z, accountId, objectRef2, null);
                            Intrinsics.checkNotNullParameter(runnable, "runnable");
                            BuildersKt__Builders_commonKt.launch$default(AbstractC3914mk.i, null, null, new C3886lk(runnable, null), 3, null);
                            return;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    throw new IllegalArgumentException("Required value was null.");
                } catch (Exception unused) {
                    AbstractC3914mk.c = null;
                    AbstractC3914mk.f7252a = null;
                    AbstractC3914mk.j = 3;
                    b((Pa) objectRef.element, "SDK could not be initialized; an unexpected error was encountered.");
                    return;
                }
            }
            b2 = 0;
            a2 = a((Pa) objectRef2.element, context, b2);
            if (a2 != 0) {
            }
        } catch (Exception unused2) {
            objectRef = objectRef2;
        }
    }
}
