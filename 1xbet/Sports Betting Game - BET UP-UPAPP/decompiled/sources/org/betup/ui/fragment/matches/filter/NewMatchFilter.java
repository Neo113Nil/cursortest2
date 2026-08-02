package org.betup.ui.fragment.matches.filter;

import android.app.Activity;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.betup.R;
import org.betup.model.remote.api.rest.user.V7UserBetStatisticsInteractor;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: NewMatchFilter.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 #2\u00020\u0001:\b\u001c\u001d\u001e\u001f !\"#B\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B-\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0004\u0010\fJ\u000e\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014J \u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u0082\u0001\u0007$%&'()*¨\u0006+"}, d2 = {"Lorg/betup/ui/fragment/matches/filter/NewMatchFilter;", "", "name", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;)V", "seen0", "", "isSelected", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getName", "()Ljava/lang/String;", "()Z", "setSelected", "(Z)V", "getResString", "context", "Landroid/app/Activity;", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "All", "Today", "Live", "OneHour", "ThreeHours", "SixHours", "TwelveHours", VastTagName.COMPANION, "Lorg/betup/ui/fragment/matches/filter/NewMatchFilter$All;", "Lorg/betup/ui/fragment/matches/filter/NewMatchFilter$Live;", "Lorg/betup/ui/fragment/matches/filter/NewMatchFilter$OneHour;", "Lorg/betup/ui/fragment/matches/filter/NewMatchFilter$SixHours;", "Lorg/betup/ui/fragment/matches/filter/NewMatchFilter$ThreeHours;", "Lorg/betup/ui/fragment/matches/filter/NewMatchFilter$Today;", "Lorg/betup/ui/fragment/matches/filter/NewMatchFilter$TwelveHours;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes4.dex */
public abstract class NewMatchFilter {
    private boolean isSelected;
    private final String name;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: org.betup.ui.fragment.matches.filter.NewMatchFilter$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            KSerializer _init_$_anonymous_;
            _init_$_anonymous_ = NewMatchFilter._init_$_anonymous_();
            return _init_$_anonymous_;
        }
    });

    public /* synthetic */ NewMatchFilter(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* compiled from: NewMatchFilter.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lorg/betup/ui/fragment/matches/filter/NewMatchFilter$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lorg/betup/ui/fragment/matches/filter/NewMatchFilter;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) NewMatchFilter.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<NewMatchFilter> serializer() {
            return get$cachedSerializer();
        }
    }

    public /* synthetic */ NewMatchFilter(int i, String str, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        this.name = str;
        if ((i & 2) == 0) {
            this.isSelected = false;
        } else {
            this.isSelected = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new SealedClassSerializer("org.betup.ui.fragment.matches.filter.NewMatchFilter", Reflection.getOrCreateKotlinClass(NewMatchFilter.class), new KClass[0], new KSerializer[0], new Annotation[0]);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self(NewMatchFilter self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.name);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.isSelected) {
            output.encodeBooleanElement(serialDesc, 1, self.isSelected);
        }
    }

    private NewMatchFilter(String str) {
        this.name = str;
    }

    public final String getName() {
        return this.name;
    }

    /* renamed from: isSelected, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    /* compiled from: NewMatchFilter.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/fragment/matches/filter/NewMatchFilter$All;", "Lorg/betup/ui/fragment/matches/filter/NewMatchFilter;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class All extends NewMatchFilter {
        public static final All INSTANCE = new All();
        public static final int $stable = 8;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof All)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -1289324741;
        }

        public String toString() {
            return "All";
        }

        private All() {
            super(V7UserBetStatisticsInteractor.STATS_TYPE_ALL, null);
        }
    }

    /* compiled from: NewMatchFilter.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/fragment/matches/filter/NewMatchFilter$Today;", "Lorg/betup/ui/fragment/matches/filter/NewMatchFilter;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Today extends NewMatchFilter {
        public static final Today INSTANCE = new Today();
        public static final int $stable = 8;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Today)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -2072863141;
        }

        public String toString() {
            return "Today";
        }

        private Today() {
            super("ONE_DAY", null);
        }
    }

    /* compiled from: NewMatchFilter.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/fragment/matches/filter/NewMatchFilter$Live;", "Lorg/betup/ui/fragment/matches/filter/NewMatchFilter;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Live extends NewMatchFilter {
        public static final Live INSTANCE = new Live();
        public static final int $stable = 8;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Live)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -1314036078;
        }

        public String toString() {
            return "Live";
        }

        private Live() {
            super("LIVE", null);
        }
    }

    /* compiled from: NewMatchFilter.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/fragment/matches/filter/NewMatchFilter$OneHour;", "Lorg/betup/ui/fragment/matches/filter/NewMatchFilter;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OneHour extends NewMatchFilter {
        public static final OneHour INSTANCE = new OneHour();
        public static final int $stable = 8;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OneHour)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 672339460;
        }

        public String toString() {
            return "OneHour";
        }

        private OneHour() {
            super("HOUR", null);
        }
    }

    /* compiled from: NewMatchFilter.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/fragment/matches/filter/NewMatchFilter$ThreeHours;", "Lorg/betup/ui/fragment/matches/filter/NewMatchFilter;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ThreeHours extends NewMatchFilter {
        public static final ThreeHours INSTANCE = new ThreeHours();
        public static final int $stable = 8;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ThreeHours)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 31286583;
        }

        public String toString() {
            return "ThreeHours";
        }

        private ThreeHours() {
            super("THREE_HOURS", null);
        }
    }

    /* compiled from: NewMatchFilter.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/fragment/matches/filter/NewMatchFilter$SixHours;", "Lorg/betup/ui/fragment/matches/filter/NewMatchFilter;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SixHours extends NewMatchFilter {
        public static final SixHours INSTANCE = new SixHours();
        public static final int $stable = 8;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SixHours)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -1849603597;
        }

        public String toString() {
            return "SixHours";
        }

        private SixHours() {
            super("SIX_HOURS", null);
        }
    }

    /* compiled from: NewMatchFilter.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/fragment/matches/filter/NewMatchFilter$TwelveHours;", "Lorg/betup/ui/fragment/matches/filter/NewMatchFilter;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TwelveHours extends NewMatchFilter {
        public static final TwelveHours INSTANCE = new TwelveHours();
        public static final int $stable = 8;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TwelveHours)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -1939230832;
        }

        public String toString() {
            return "TwelveHours";
        }

        private TwelveHours() {
            super("TWELVE_HOURS", null);
        }
    }

    public final String getResString(Activity context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (Intrinsics.areEqual(this, All.INSTANCE)) {
            String string = context.getString(R.string.all);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
        if (Intrinsics.areEqual(this, Today.INSTANCE)) {
            String string2 = context.getString(R.string.today);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        if (Intrinsics.areEqual(this, Live.INSTANCE)) {
            String string3 = context.getString(R.string.live);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            return string3;
        }
        if (Intrinsics.areEqual(this, OneHour.INSTANCE)) {
            String string4 = context.getString(R.string.one_hour);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            return string4;
        }
        if (Intrinsics.areEqual(this, ThreeHours.INSTANCE)) {
            String string5 = context.getString(R.string.three_hours);
            Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
            return string5;
        }
        if (Intrinsics.areEqual(this, SixHours.INSTANCE)) {
            String string6 = context.getString(R.string.six_hours);
            Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
            return string6;
        }
        if (!Intrinsics.areEqual(this, TwelveHours.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        }
        String string7 = context.getString(R.string.twelve_hours);
        Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
        return string7;
    }
}
