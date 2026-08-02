package org.betup.ui.fragment.user.compose;

import androidx.compose.ui.graphics.Brush;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.ui.views.ComposeUtils;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: UserProfileBottomInfo.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u000e\u000f\u0010B!\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f\u0082\u0001\u0003\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lorg/betup/ui/fragment/user/compose/QuizTypeProfile;", "", "brush", "Landroidx/compose/ui/graphics/Brush;", "titleP", "", "labelP", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroidx/compose/ui/graphics/Brush;Ljava/lang/String;Ljava/lang/String;)V", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "getTitleP", "()Ljava/lang/String;", "getLabelP", "Bronze", "Silver", "Gold", "Lorg/betup/ui/fragment/user/compose/QuizTypeProfile$Bronze;", "Lorg/betup/ui/fragment/user/compose/QuizTypeProfile$Gold;", "Lorg/betup/ui/fragment/user/compose/QuizTypeProfile$Silver;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class QuizTypeProfile {
    public static final int $stable = 0;
    private final Brush brush;
    private final String labelP;
    private final String titleP;

    public /* synthetic */ QuizTypeProfile(Brush brush, String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(brush, str, str2);
    }

    private QuizTypeProfile(Brush brush, String str, String str2) {
        this.brush = brush;
        this.titleP = str;
        this.labelP = str2;
    }

    public final Brush getBrush() {
        return this.brush;
    }

    public final String getTitleP() {
        return this.titleP;
    }

    public final String getLabelP() {
        return this.labelP;
    }

    /* compiled from: UserProfileBottomInfo.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lorg/betup/ui/fragment/user/compose/QuizTypeProfile$Bronze;", "Lorg/betup/ui/fragment/user/compose/QuizTypeProfile;", "title", "", "label", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getLabel", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Bronze extends QuizTypeProfile {
        public static final int $stable = 0;
        private final String label;
        private final String title;

        public static /* synthetic */ Bronze copy$default(Bronze bronze, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bronze.title;
            }
            if ((i & 2) != 0) {
                str2 = bronze.label;
            }
            return bronze.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        public final Bronze copy(String title, String label) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(label, "label");
            return new Bronze(title, label);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Bronze)) {
                return false;
            }
            Bronze bronze = (Bronze) other;
            return Intrinsics.areEqual(this.title, bronze.title) && Intrinsics.areEqual(this.label, bronze.label);
        }

        public int hashCode() {
            return (this.title.hashCode() * 31) + this.label.hashCode();
        }

        public String toString() {
            return "Bronze(title=" + this.title + ", label=" + this.label + ")";
        }

        public final String getLabel() {
            return this.label;
        }

        public final String getTitle() {
            return this.title;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Bronze(String title, String label) {
            super(ComposeUtils.AppBrushPalette.ButtonBackgroundBronze.INSTANCE.getBrush(), title, label, null);
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(label, "label");
            this.title = title;
            this.label = label;
        }
    }

    /* compiled from: UserProfileBottomInfo.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lorg/betup/ui/fragment/user/compose/QuizTypeProfile$Silver;", "Lorg/betup/ui/fragment/user/compose/QuizTypeProfile;", "title", "", "label", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getLabel", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Silver extends QuizTypeProfile {
        public static final int $stable = 0;
        private final String label;
        private final String title;

        public static /* synthetic */ Silver copy$default(Silver silver, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = silver.title;
            }
            if ((i & 2) != 0) {
                str2 = silver.label;
            }
            return silver.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        public final Silver copy(String title, String label) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(label, "label");
            return new Silver(title, label);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Silver)) {
                return false;
            }
            Silver silver = (Silver) other;
            return Intrinsics.areEqual(this.title, silver.title) && Intrinsics.areEqual(this.label, silver.label);
        }

        public int hashCode() {
            return (this.title.hashCode() * 31) + this.label.hashCode();
        }

        public String toString() {
            return "Silver(title=" + this.title + ", label=" + this.label + ")";
        }

        public final String getLabel() {
            return this.label;
        }

        public final String getTitle() {
            return this.title;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Silver(String title, String label) {
            super(ComposeUtils.AppBrushPalette.ButtonBackgroundSilver.INSTANCE.getBrush(), title, label, null);
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(label, "label");
            this.title = title;
            this.label = label;
        }
    }

    /* compiled from: UserProfileBottomInfo.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lorg/betup/ui/fragment/user/compose/QuizTypeProfile$Gold;", "Lorg/betup/ui/fragment/user/compose/QuizTypeProfile;", "title", "", "label", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getLabel", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Gold extends QuizTypeProfile {
        public static final int $stable = 0;
        private final String label;
        private final String title;

        public static /* synthetic */ Gold copy$default(Gold gold, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = gold.title;
            }
            if ((i & 2) != 0) {
                str2 = gold.label;
            }
            return gold.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        public final Gold copy(String title, String label) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(label, "label");
            return new Gold(title, label);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Gold)) {
                return false;
            }
            Gold gold = (Gold) other;
            return Intrinsics.areEqual(this.title, gold.title) && Intrinsics.areEqual(this.label, gold.label);
        }

        public int hashCode() {
            return (this.title.hashCode() * 31) + this.label.hashCode();
        }

        public String toString() {
            return "Gold(title=" + this.title + ", label=" + this.label + ")";
        }

        public final String getLabel() {
            return this.label;
        }

        public final String getTitle() {
            return this.title;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Gold(String title, String label) {
            super(ComposeUtils.AppBrushPalette.ButtonBackgroundGold.INSTANCE.getBrush(), title, label, null);
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(label, "label");
            this.title = title;
            this.label = label;
        }
    }
}
