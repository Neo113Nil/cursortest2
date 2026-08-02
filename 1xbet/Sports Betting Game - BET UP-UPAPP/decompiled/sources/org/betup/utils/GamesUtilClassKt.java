package org.betup.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;
import org.betup.bus.NavigateMessage;
import org.betup.games.GameListItem;

/* compiled from: GamesUtilClass.kt */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u00012\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\u000b"}, d2 = {"buildNativeMiniGameItems", "", "Lorg/betup/games/GameListItem$Native;", "list", "", "context", "Landroid/content/Context;", "getDrawableByGameType", "Landroid/graphics/drawable/Drawable;", "target", "Lorg/betup/bus/NavigateMessage$TargetGame;", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GamesUtilClassKt {

    /* compiled from: GamesUtilClass.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NavigateMessage.TargetGame.values().length];
            try {
                iArr[NavigateMessage.TargetGame.HIGHER_LOWER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NavigateMessage.TargetGame.DICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NavigateMessage.TargetGame.WAR_GAME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NavigateMessage.TargetGame.LUCKY_CELLS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[NavigateMessage.TargetGame.DOUBLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final List<GameListItem.Native> buildNativeMiniGameItems(List<String> list, Context context) {
        NavigateMessage.TargetGame targetGame;
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(context, "context");
        Gson gson = new Gson();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            try {
                targetGame = (NavigateMessage.TargetGame) gson.fromJson((String) it.next(), NavigateMessage.TargetGame.class);
            } catch (Exception unused) {
                targetGame = null;
            }
            if (targetGame != null) {
                arrayList.add(targetGame);
            }
        }
        ArrayList<NavigateMessage.TargetGame> arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        for (NavigateMessage.TargetGame targetGame2 : arrayList2) {
            arrayList3.add(new GameListItem.Native(targetGame2, getDrawableByGameType(targetGame2, context)));
        }
        return arrayList3;
    }

    private static final Drawable getDrawableByGameType(NavigateMessage.TargetGame targetGame, Context context) {
        int i = WhenMappings.$EnumSwitchMapping$0[targetGame.ordinal()];
        if (i == 1) {
            return ContextCompat.getDrawable(context, R.drawable.high_low_game_icon);
        }
        if (i == 2) {
            return ContextCompat.getDrawable(context, R.drawable.dice_game_icon);
        }
        if (i == 3) {
            return ContextCompat.getDrawable(context, R.drawable.war_game_icon);
        }
        if (i == 4) {
            return ContextCompat.getDrawable(context, R.drawable.lucky_cells_game_icon);
        }
        if (i == 5) {
            return ContextCompat.getDrawable(context, R.drawable.double_game_icon);
        }
        return ContextCompat.getDrawable(context, R.drawable.item_game_unavailable);
    }
}
