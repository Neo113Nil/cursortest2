package org.betup.games.doubles.ui;

import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.betup.games.doubles.model.rest.DoubleBetType;
import org.betup.games.doubles.model.rest.RouletteDoubleGameModel;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: DoubleGameFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0002\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lorg/betup/games/doubles/ui/DoubleGame;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class DoubleGame {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final List<RouletteDoubleGameModel> cubeList;

    /* compiled from: DoubleGameFragment.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lorg/betup/games/doubles/ui/DoubleGame$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "cubeList", "", "Lorg/betup/games/doubles/model/rest/RouletteDoubleGameModel;", "getCubeList", "()Ljava/util/List;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<RouletteDoubleGameModel> getCubeList() {
            return DoubleGame.cubeList;
        }
    }

    static {
        int i;
        List createListBuilder = CollectionsKt.createListBuilder();
        int i2 = 1;
        while (true) {
            if (i2 >= 8) {
                break;
            }
            createListBuilder.add(new RouletteDoubleGameModel(DoubleBetType.RED, i2));
            i2++;
        }
        for (i = 8; i < 15; i++) {
            createListBuilder.add(new RouletteDoubleGameModel(DoubleBetType.BLACK, i));
        }
        createListBuilder.add(new RouletteDoubleGameModel(DoubleBetType.ZERO, 15));
        cubeList = CollectionsKt.build(createListBuilder);
    }
}
