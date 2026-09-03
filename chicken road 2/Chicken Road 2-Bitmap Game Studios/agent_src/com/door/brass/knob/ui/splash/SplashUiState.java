package com.door.brass.knob.ui.splash;

import kotlin.Metadata;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/door/brass/knob/ui/splash/SplashUiState;", "", "Loading", "Ready", "Failed", "Lcom/door/brass/knob/ui/splash/SplashUiState$Failed;", "Lcom/door/brass/knob/ui/splash/SplashUiState$Loading;", "Lcom/door/brass/knob/ui/splash/SplashUiState$Ready;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public interface SplashUiState {

    /* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/door/brass/knob/ui/splash/SplashUiState$Failed;", "Lcom/door/brass/knob/ui/splash/SplashUiState;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Failed implements SplashUiState {
        public final SplashError yzPsTade5rL7D3;

        public Failed(SplashError splashError) {
            this.yzPsTade5rL7D3 = splashError;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Failed) && this.yzPsTade5rL7D3 == ((Failed) obj).yzPsTade5rL7D3;
        }

        public final int hashCode() {
            return this.yzPsTade5rL7D3.hashCode();
        }

        public final String toString() {
            return "Failed(reason=" + this.yzPsTade5rL7D3 + ")";
        }
    }

    /* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/door/brass/knob/ui/splash/SplashUiState$Loading;", "Lcom/door/brass/knob/ui/splash/SplashUiState;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading implements SplashUiState {
        public static final Loading yzPsTade5rL7D3 = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -658658865;
        }

        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/door/brass/knob/ui/splash/SplashUiState$Ready;", "Lcom/door/brass/knob/ui/splash/SplashUiState;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Ready implements SplashUiState {
        public final SplashDestination yzPsTade5rL7D3;

        public Ready(SplashDestination splashDestination) {
            this.yzPsTade5rL7D3 = splashDestination;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Ready) && this.yzPsTade5rL7D3.equals(((Ready) obj).yzPsTade5rL7D3);
        }

        public final int hashCode() {
            return this.yzPsTade5rL7D3.hashCode();
        }

        public final String toString() {
            return "Ready(destination=" + this.yzPsTade5rL7D3 + ")";
        }
    }
}
