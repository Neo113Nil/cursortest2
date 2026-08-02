package androidx.media3.session;

import android.app.PendingIntent;
import android.media.session.MediaSession;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import androidx.annotation.Nullable;
import androidx.core.app.BundleCompat;
import androidx.media3.common.Player;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.BundleCollectionUtil;
import androidx.media3.common.util.Util;
import androidx.media3.session.IMediaSession;
import com.google.common.collect.G;
import java.util.ArrayList;

/* loaded from: classes3.dex */
class ConnectionState {
    public final com.google.common.collect.G<CommandButton> commandButtonsForMediaItems;
    public final com.google.common.collect.G<CommandButton> customLayout;
    public final int libraryVersion;
    public final com.google.common.collect.G<CommandButton> mediaButtonPreferences;

    @Nullable
    public final MediaSession.Token platformToken;
    public final Player.Commands playerCommandsFromPlayer;
    public final Player.Commands playerCommandsFromSession;
    public final PlayerInfo playerInfo;

    @Nullable
    public final PendingIntent sessionActivity;
    public final IMediaSession sessionBinder;
    public final SessionCommands sessionCommands;
    public final Bundle sessionExtras;
    public final int sessionInterfaceVersion;
    public final Bundle tokenExtras;
    private static final String FIELD_LIBRARY_VERSION = Util.intToStringMaxRadix(0);
    private static final String FIELD_SESSION_BINDER = Util.intToStringMaxRadix(1);
    private static final String FIELD_SESSION_ACTIVITY = Util.intToStringMaxRadix(2);
    private static final String FIELD_CUSTOM_LAYOUT = Util.intToStringMaxRadix(9);
    private static final String FIELD_MEDIA_BUTTON_PREFERENCES = Util.intToStringMaxRadix(14);
    private static final String FIELD_COMMAND_BUTTONS_FOR_MEDIA_ITEMS = Util.intToStringMaxRadix(13);
    private static final String FIELD_SESSION_COMMANDS = Util.intToStringMaxRadix(3);
    private static final String FIELD_PLAYER_COMMANDS_FROM_SESSION = Util.intToStringMaxRadix(4);
    private static final String FIELD_PLAYER_COMMANDS_FROM_PLAYER = Util.intToStringMaxRadix(5);
    private static final String FIELD_TOKEN_EXTRAS = Util.intToStringMaxRadix(6);
    private static final String FIELD_SESSION_EXTRAS = Util.intToStringMaxRadix(11);
    private static final String FIELD_PLAYER_INFO = Util.intToStringMaxRadix(7);
    private static final String FIELD_SESSION_INTERFACE_VERSION = Util.intToStringMaxRadix(8);
    private static final String FIELD_IN_PROCESS_BINDER = Util.intToStringMaxRadix(10);
    private static final String FIELD_PLATFORM_TOKEN = Util.intToStringMaxRadix(12);

    public final class InProcessBinder extends Binder {
        private InProcessBinder() {
        }

        public ConnectionState getConnectionState() {
            return ConnectionState.this;
        }
    }

    public ConnectionState(int i, int i2, IMediaSession iMediaSession, @Nullable PendingIntent pendingIntent, com.google.common.collect.G<CommandButton> g, com.google.common.collect.G<CommandButton> g2, com.google.common.collect.G<CommandButton> g3, SessionCommands sessionCommands, Player.Commands commands, Player.Commands commands2, Bundle bundle, Bundle bundle2, PlayerInfo playerInfo, @Nullable MediaSession.Token token) {
        this.libraryVersion = i;
        this.sessionInterfaceVersion = i2;
        this.sessionBinder = iMediaSession;
        this.sessionActivity = pendingIntent;
        this.customLayout = g;
        this.mediaButtonPreferences = g2;
        this.commandButtonsForMediaItems = g3;
        this.sessionCommands = sessionCommands;
        this.playerCommandsFromSession = commands;
        this.playerCommandsFromPlayer = commands2;
        this.tokenExtras = bundle;
        this.sessionExtras = bundle2;
        this.playerInfo = playerInfo;
        this.platformToken = token;
    }

    public static ConnectionState fromBundle(Bundle bundle) {
        com.google.common.collect.G g;
        com.google.common.collect.G g2;
        com.google.common.collect.G g3;
        IBinder binder = bundle.getBinder(FIELD_IN_PROCESS_BINDER);
        if (binder instanceof InProcessBinder) {
            return ((InProcessBinder) binder).getConnectionState();
        }
        int i = bundle.getInt(FIELD_LIBRARY_VERSION, 0);
        final int i2 = bundle.getInt(FIELD_SESSION_INTERFACE_VERSION, 0);
        IBinder iBinder = (IBinder) Assertions.checkNotNull(BundleCompat.getBinder(bundle, FIELD_SESSION_BINDER));
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(FIELD_SESSION_ACTIVITY);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(FIELD_CUSTOM_LAYOUT);
        if (parcelableArrayList != null) {
            g = BundleCollectionUtil.fromBundleList(new com.google.common.base.f() { // from class: androidx.media3.session.e
                @Override // com.google.common.base.f
                public final Object apply(Object obj) {
                    CommandButton lambda$fromBundle$0;
                    lambda$fromBundle$0 = ConnectionState.lambda$fromBundle$0(i2, (Bundle) obj);
                    return lambda$fromBundle$0;
                }
            }, parcelableArrayList);
        } else {
            G.b bVar = com.google.common.collect.G.b;
            g = com.google.common.collect.i0.e;
        }
        com.google.common.collect.G g4 = g;
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(FIELD_MEDIA_BUTTON_PREFERENCES);
        if (parcelableArrayList2 != null) {
            g2 = BundleCollectionUtil.fromBundleList(new com.google.common.base.f() { // from class: androidx.media3.session.f
                @Override // com.google.common.base.f
                public final Object apply(Object obj) {
                    CommandButton lambda$fromBundle$1;
                    lambda$fromBundle$1 = ConnectionState.lambda$fromBundle$1(i2, (Bundle) obj);
                    return lambda$fromBundle$1;
                }
            }, parcelableArrayList2);
        } else {
            G.b bVar2 = com.google.common.collect.G.b;
            g2 = com.google.common.collect.i0.e;
        }
        com.google.common.collect.G g5 = g2;
        ArrayList parcelableArrayList3 = bundle.getParcelableArrayList(FIELD_COMMAND_BUTTONS_FOR_MEDIA_ITEMS);
        if (parcelableArrayList3 != null) {
            g3 = BundleCollectionUtil.fromBundleList(new com.google.common.base.f() { // from class: androidx.media3.session.g
                @Override // com.google.common.base.f
                public final Object apply(Object obj) {
                    CommandButton lambda$fromBundle$2;
                    lambda$fromBundle$2 = ConnectionState.lambda$fromBundle$2(i2, (Bundle) obj);
                    return lambda$fromBundle$2;
                }
            }, parcelableArrayList3);
        } else {
            G.b bVar3 = com.google.common.collect.G.b;
            g3 = com.google.common.collect.i0.e;
        }
        com.google.common.collect.G g6 = g3;
        Bundle bundle2 = bundle.getBundle(FIELD_SESSION_COMMANDS);
        SessionCommands fromBundle = bundle2 == null ? SessionCommands.EMPTY : SessionCommands.fromBundle(bundle2);
        Bundle bundle3 = bundle.getBundle(FIELD_PLAYER_COMMANDS_FROM_PLAYER);
        Player.Commands fromBundle2 = bundle3 == null ? Player.Commands.EMPTY : Player.Commands.fromBundle(bundle3);
        Bundle bundle4 = bundle.getBundle(FIELD_PLAYER_COMMANDS_FROM_SESSION);
        Player.Commands fromBundle3 = bundle4 == null ? Player.Commands.EMPTY : Player.Commands.fromBundle(bundle4);
        Bundle bundle5 = bundle.getBundle(FIELD_TOKEN_EXTRAS);
        Bundle bundle6 = bundle.getBundle(FIELD_SESSION_EXTRAS);
        Bundle bundle7 = bundle.getBundle(FIELD_PLAYER_INFO);
        PlayerInfo fromBundle4 = bundle7 == null ? PlayerInfo.DEFAULT : PlayerInfo.fromBundle(bundle7, i2);
        MediaSession.Token token = (MediaSession.Token) bundle.getParcelable(FIELD_PLATFORM_TOKEN);
        Bundle bundle8 = bundle6;
        IMediaSession asInterface = IMediaSession.Stub.asInterface(iBinder);
        if (bundle5 == null) {
            bundle5 = Bundle.EMPTY;
        }
        Bundle bundle9 = bundle5;
        if (bundle8 == null) {
            bundle8 = Bundle.EMPTY;
        }
        return new ConnectionState(i, i2, asInterface, pendingIntent, g4, g5, g6, fromBundle, fromBundle3, fromBundle2, bundle9, bundle8, fromBundle4, token);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ CommandButton lambda$fromBundle$0(int i, Bundle bundle) {
        return CommandButton.fromBundle(bundle, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ CommandButton lambda$fromBundle$1(int i, Bundle bundle) {
        return CommandButton.fromBundle(bundle, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ CommandButton lambda$fromBundle$2(int i, Bundle bundle) {
        return CommandButton.fromBundle(bundle, i);
    }

    public Bundle toBundleForRemoteProcess(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt(FIELD_LIBRARY_VERSION, this.libraryVersion);
        BundleCompat.putBinder(bundle, FIELD_SESSION_BINDER, this.sessionBinder.asBinder());
        bundle.putParcelable(FIELD_SESSION_ACTIVITY, this.sessionActivity);
        if (!this.customLayout.isEmpty()) {
            bundle.putParcelableArrayList(FIELD_CUSTOM_LAYOUT, BundleCollectionUtil.toBundleArrayList(this.customLayout, new C0503h()));
        }
        if (!this.mediaButtonPreferences.isEmpty()) {
            if (i >= 7) {
                bundle.putParcelableArrayList(FIELD_MEDIA_BUTTON_PREFERENCES, BundleCollectionUtil.toBundleArrayList(this.mediaButtonPreferences, new C0503h()));
            } else {
                bundle.putParcelableArrayList(FIELD_CUSTOM_LAYOUT, BundleCollectionUtil.toBundleArrayList(CommandButton.getCustomLayoutFromMediaButtonPreferences(this.mediaButtonPreferences, true, true), new C0503h()));
            }
        }
        if (!this.commandButtonsForMediaItems.isEmpty()) {
            bundle.putParcelableArrayList(FIELD_COMMAND_BUTTONS_FOR_MEDIA_ITEMS, BundleCollectionUtil.toBundleArrayList(this.commandButtonsForMediaItems, new C0503h()));
        }
        bundle.putBundle(FIELD_SESSION_COMMANDS, this.sessionCommands.toBundle());
        bundle.putBundle(FIELD_PLAYER_COMMANDS_FROM_SESSION, this.playerCommandsFromSession.toBundle());
        bundle.putBundle(FIELD_PLAYER_COMMANDS_FROM_PLAYER, this.playerCommandsFromPlayer.toBundle());
        bundle.putBundle(FIELD_TOKEN_EXTRAS, this.tokenExtras);
        bundle.putBundle(FIELD_SESSION_EXTRAS, this.sessionExtras);
        bundle.putBundle(FIELD_PLAYER_INFO, this.playerInfo.filterByAvailableCommands(MediaUtils.intersect(this.playerCommandsFromSession, this.playerCommandsFromPlayer), false, false).toBundleForRemoteProcess(i));
        bundle.putInt(FIELD_SESSION_INTERFACE_VERSION, this.sessionInterfaceVersion);
        MediaSession.Token token = this.platformToken;
        if (token != null) {
            bundle.putParcelable(FIELD_PLATFORM_TOKEN, token);
        }
        return bundle;
    }

    public Bundle toBundleInProcess() {
        Bundle bundle = new Bundle();
        bundle.putBinder(FIELD_IN_PROCESS_BINDER, new InProcessBinder());
        return bundle;
    }
}
