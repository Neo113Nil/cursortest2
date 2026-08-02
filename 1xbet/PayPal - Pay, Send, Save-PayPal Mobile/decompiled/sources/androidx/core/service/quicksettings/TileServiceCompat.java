package androidx.core.service.quicksettings;

/* loaded from: classes7.dex */
public class TileServiceCompat {
    private static androidx.core.service.quicksettings.TileServiceCompat.TileServiceWrapper getHighSpeedVideoFpsRangesFor;

    interface TileServiceWrapper {
        void getHighSpeedVideoFpsRangesFor(android.content.Intent intent);

        void getHighSpeedVideoSizes(android.app.PendingIntent pendingIntent);
    }

    public static void startActivityAndCollapse(android.service.quicksettings.TileService tileService, androidx.core.service.quicksettings.PendingIntentActivityWrapper pendingIntentActivityWrapper) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            androidx.core.service.quicksettings.TileServiceCompat.TileServiceWrapper tileServiceWrapper = getHighSpeedVideoFpsRangesFor;
            if (tileServiceWrapper != null) {
                tileServiceWrapper.getHighSpeedVideoSizes(pendingIntentActivityWrapper.getPendingIntent());
                return;
            } else {
                androidx.core.service.quicksettings.TileServiceCompat.Api34Impl.getHighSpeedVideoFpsRanges(tileService, pendingIntentActivityWrapper.getPendingIntent());
                return;
            }
        }
        androidx.core.service.quicksettings.TileServiceCompat.TileServiceWrapper tileServiceWrapper2 = getHighSpeedVideoFpsRangesFor;
        if (tileServiceWrapper2 != null) {
            tileServiceWrapper2.getHighSpeedVideoFpsRangesFor(pendingIntentActivityWrapper.getIntent());
        } else {
            androidx.core.service.quicksettings.TileServiceCompat.Api24Impl.getHighSpeedVideoFpsRanges(tileService, pendingIntentActivityWrapper.getIntent());
        }
    }

    public static void setTileServiceWrapper(androidx.core.service.quicksettings.TileServiceCompat.TileServiceWrapper tileServiceWrapper) {
        getHighSpeedVideoFpsRangesFor = tileServiceWrapper;
    }

    public static void clearTileServiceWrapper() {
        getHighSpeedVideoFpsRangesFor = null;
    }

    static class Api34Impl {
        private Api34Impl() {
        }

        static void getHighSpeedVideoFpsRanges(android.service.quicksettings.TileService tileService, android.app.PendingIntent pendingIntent) {
            tileService.startActivityAndCollapse(pendingIntent);
        }
    }

    static class Api24Impl {
        private Api24Impl() {
        }

        static void getHighSpeedVideoFpsRanges(android.service.quicksettings.TileService tileService, android.content.Intent intent) {
            tileService.startActivityAndCollapse(intent);
        }
    }

    private TileServiceCompat() {
    }
}
