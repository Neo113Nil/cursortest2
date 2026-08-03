package androidx.core.service.quicksettings;

/* loaded from: classes.dex */
public class TileServiceCompat {
    private static androidx.core.service.quicksettings.TileServiceCompat.TileServiceWrapper sTileServiceWrapper;

    interface TileServiceWrapper {
        void startActivityAndCollapse(android.app.PendingIntent pendingIntent);

        void startActivityAndCollapse(android.content.Intent intent);
    }

    public static void startActivityAndCollapse(android.service.quicksettings.TileService tileService, androidx.core.service.quicksettings.PendingIntentActivityWrapper pendingIntentActivityWrapper) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            androidx.core.service.quicksettings.TileServiceCompat.TileServiceWrapper tileServiceWrapper = sTileServiceWrapper;
            if (tileServiceWrapper != null) {
                tileServiceWrapper.startActivityAndCollapse(pendingIntentActivityWrapper.getPendingIntent());
                return;
            } else {
                androidx.core.service.quicksettings.TileServiceCompat.Api34Impl.startActivityAndCollapse(tileService, pendingIntentActivityWrapper.getPendingIntent());
                return;
            }
        }
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            androidx.core.service.quicksettings.TileServiceCompat.TileServiceWrapper tileServiceWrapper2 = sTileServiceWrapper;
            if (tileServiceWrapper2 != null) {
                tileServiceWrapper2.startActivityAndCollapse(pendingIntentActivityWrapper.getIntent());
            } else {
                androidx.core.service.quicksettings.TileServiceCompat.Api24Impl.startActivityAndCollapse(tileService, pendingIntentActivityWrapper.getIntent());
            }
        }
    }

    public static void setTileServiceWrapper(androidx.core.service.quicksettings.TileServiceCompat.TileServiceWrapper tileServiceWrapper) {
        sTileServiceWrapper = tileServiceWrapper;
    }

    public static void clearTileServiceWrapper() {
        sTileServiceWrapper = null;
    }

    private static class Api34Impl {
        private Api34Impl() {
        }

        static void startActivityAndCollapse(android.service.quicksettings.TileService tileService, android.app.PendingIntent pendingIntent) {
            tileService.startActivityAndCollapse(pendingIntent);
        }
    }

    private static class Api24Impl {
        private Api24Impl() {
        }

        static void startActivityAndCollapse(android.service.quicksettings.TileService tileService, android.content.Intent intent) {
            tileService.startActivityAndCollapse(intent);
        }
    }

    private TileServiceCompat() {
    }
}
