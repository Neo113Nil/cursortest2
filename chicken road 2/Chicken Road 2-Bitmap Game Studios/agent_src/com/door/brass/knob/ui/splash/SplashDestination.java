package com.door.brass.knob.ui.splash;

import defpackage.OcGJUxcOVecQiKb;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/door/brass/knob/ui/splash/SplashDestination;", "", "Cafe", "Offer", "Lcom/door/brass/knob/ui/splash/SplashDestination$Cafe;", "Lcom/door/brass/knob/ui/splash/SplashDestination$Offer;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public interface SplashDestination {

    /* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/door/brass/knob/ui/splash/SplashDestination$Cafe;", "Lcom/door/brass/knob/ui/splash/SplashDestination;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Cafe implements SplashDestination {
        public static final Cafe yzPsTade5rL7D3 = new Cafe();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Cafe);
        }

        public final int hashCode() {
            return 1778096345;
        }

        public final String toString() {
            return "Cafe";
        }
    }

    /* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/door/brass/knob/ui/splash/SplashDestination$Offer;", "Lcom/door/brass/knob/ui/splash/SplashDestination;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Offer implements SplashDestination {
        public final String yzPsTade5rL7D3;

        public Offer(String str) {
            str.getClass();
            this.yzPsTade5rL7D3 = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Offer) && Intrinsics.yzPsTade5rL7D3(this.yzPsTade5rL7D3, ((Offer) obj).yzPsTade5rL7D3);
        }

        public final int hashCode() {
            return this.yzPsTade5rL7D3.hashCode();
        }

        public final String toString() {
            return OcGJUxcOVecQiKb.UEutaskTsxaI("Offer(url=", this.yzPsTade5rL7D3, ")");
        }
    }
}
