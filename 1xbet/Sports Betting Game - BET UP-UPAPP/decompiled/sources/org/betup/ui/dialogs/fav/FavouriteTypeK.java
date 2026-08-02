package org.betup.ui.dialogs.fav;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: EditFavouritesDialog.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\b\t\nB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lorg/betup/ui/dialogs/fav/FavouriteTypeK;", "Ljava/io/Serializable;", "name", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "Teams", "Leagues", "Sports", "Lorg/betup/ui/dialogs/fav/FavouriteTypeK$Leagues;", "Lorg/betup/ui/dialogs/fav/FavouriteTypeK$Sports;", "Lorg/betup/ui/dialogs/fav/FavouriteTypeK$Teams;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class FavouriteTypeK implements Serializable {
    public static final int $stable = 0;
    private final String name;

    public /* synthetic */ FavouriteTypeK(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private FavouriteTypeK(String str) {
        this.name = str;
    }

    public final String getName() {
        return this.name;
    }

    /* compiled from: EditFavouritesDialog.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lorg/betup/ui/dialogs/fav/FavouriteTypeK$Teams;", "Lorg/betup/ui/dialogs/fav/FavouriteTypeK;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Teams extends FavouriteTypeK {
        public static final int $stable = 0;
        public static final Teams INSTANCE = new Teams();

        private Teams() {
            super("Teams", null);
        }
    }

    /* compiled from: EditFavouritesDialog.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lorg/betup/ui/dialogs/fav/FavouriteTypeK$Leagues;", "Lorg/betup/ui/dialogs/fav/FavouriteTypeK;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Leagues extends FavouriteTypeK {
        public static final int $stable = 0;
        public static final Leagues INSTANCE = new Leagues();

        private Leagues() {
            super("Leagues", null);
        }
    }

    /* compiled from: EditFavouritesDialog.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lorg/betup/ui/dialogs/fav/FavouriteTypeK$Sports;", "Lorg/betup/ui/dialogs/fav/FavouriteTypeK;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Sports extends FavouriteTypeK {
        public static final int $stable = 0;
        public static final Sports INSTANCE = new Sports();

        private Sports() {
            super("Sports", null);
        }
    }
}
