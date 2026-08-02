package org.betup.ui.fragment.user.compose;

import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: RankingCupBaseItem.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0019\u001a\u001bBA\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f\u0082\u0001\u0003\u001c\u001d\u001e¨\u0006\u001f"}, d2 = {"Lorg/betup/ui/fragment/user/compose/RankingCupType;", "", "cupImageR", "", "cupDimension", "Landroidx/compose/ui/unit/Dp;", "name", "", "photo", "level", "countryImage", "id", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(IFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getCupImageR", "()I", "getCupDimension-D9Ej5fM", "()F", "F", "getName", "()Ljava/lang/String;", "getPhoto", "getLevel", "getCountryImage", "getId", "Bronze", "Silver", "Gold", "Lorg/betup/ui/fragment/user/compose/RankingCupType$Bronze;", "Lorg/betup/ui/fragment/user/compose/RankingCupType$Gold;", "Lorg/betup/ui/fragment/user/compose/RankingCupType$Silver;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class RankingCupType {
    public static final int $stable = 0;
    private final String countryImage;
    private final float cupDimension;
    private final int cupImageR;
    private final int id;
    private final String level;
    private final String name;
    private final String photo;

    public /* synthetic */ RankingCupType(int i, float f, String str, String str2, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, f, str, str2, str3, str4, i2);
    }

    private RankingCupType(int i, float f, String name, String photo, String level, String countryImage, int i2) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(photo, "photo");
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(countryImage, "countryImage");
        this.cupImageR = i;
        this.cupDimension = f;
        this.name = name;
        this.photo = photo;
        this.level = level;
        this.countryImage = countryImage;
        this.id = i2;
    }

    public final int getCupImageR() {
        return this.cupImageR;
    }

    /* renamed from: getCupDimension-D9Ej5fM, reason: not valid java name and from getter */
    public final float getCupDimension() {
        return this.cupDimension;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPhoto() {
        return this.photo;
    }

    public final String getLevel() {
        return this.level;
    }

    public final String getCountryImage() {
        return this.countryImage;
    }

    public final int getId() {
        return this.id;
    }

    /* compiled from: RankingCupBaseItem.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lorg/betup/ui/fragment/user/compose/RankingCupType$Bronze;", "Lorg/betup/ui/fragment/user/compose/RankingCupType;", "name", "", "photo", "level", "countryImage", "id", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Bronze extends RankingCupType {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Bronze(String name, String photo, String level, String countryImage, int i) {
            super(R.drawable.bronze_cup_ranking, Dp.m7774constructorimpl(70), name, photo, level, countryImage, i, null);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(photo, "photo");
            Intrinsics.checkNotNullParameter(level, "level");
            Intrinsics.checkNotNullParameter(countryImage, "countryImage");
        }
    }

    /* compiled from: RankingCupBaseItem.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lorg/betup/ui/fragment/user/compose/RankingCupType$Gold;", "Lorg/betup/ui/fragment/user/compose/RankingCupType;", "name", "", "photo", "level", "countryImage", "id", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Gold extends RankingCupType {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Gold(String name, String photo, String level, String countryImage, int i) {
            super(R.drawable.gold_cup_ranking, Dp.m7774constructorimpl((float) 87.5d), name, photo, level, countryImage, i, null);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(photo, "photo");
            Intrinsics.checkNotNullParameter(level, "level");
            Intrinsics.checkNotNullParameter(countryImage, "countryImage");
        }
    }

    /* compiled from: RankingCupBaseItem.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lorg/betup/ui/fragment/user/compose/RankingCupType$Silver;", "Lorg/betup/ui/fragment/user/compose/RankingCupType;", "name", "", "photo", "level", "countryImage", "id", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Silver extends RankingCupType {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Silver(String name, String photo, String level, String countryImage, int i) {
            super(R.drawable.silver_cup_ranking, Dp.m7774constructorimpl(70), name, photo, level, countryImage, i, null);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(photo, "photo");
            Intrinsics.checkNotNullParameter(level, "level");
            Intrinsics.checkNotNullParameter(countryImage, "countryImage");
        }
    }
}
