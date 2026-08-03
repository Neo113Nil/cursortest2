package com.iab.omid.library.vungle.adsession;

/* loaded from: classes5.dex */
public abstract class AdSession {
    public static com.iab.omid.library.vungle.adsession.AdSession createAdSession(com.iab.omid.library.vungle.adsession.AdSessionConfiguration adSessionConfiguration, com.iab.omid.library.vungle.adsession.AdSessionContext adSessionContext) {
        com.iab.omid.library.vungle.utils.g.a();
        com.iab.omid.library.vungle.utils.g.a(adSessionConfiguration, "AdSessionConfiguration is null");
        com.iab.omid.library.vungle.utils.g.a(adSessionContext, "AdSessionContext is null");
        return new com.iab.omid.library.vungle.adsession.a(adSessionConfiguration, adSessionContext);
    }

    public abstract void addFriendlyObstruction(android.view.View view, com.iab.omid.library.vungle.adsession.FriendlyObstructionPurpose friendlyObstructionPurpose, java.lang.String str);

    public abstract void error(com.iab.omid.library.vungle.adsession.ErrorType errorType, java.lang.String str);

    public abstract void finish();

    public abstract void registerAdView(android.view.View view);

    public abstract void removeAllFriendlyObstructions();

    public abstract void removeFriendlyObstruction(android.view.View view);

    public abstract void setPossibleObstructionListener(com.iab.omid.library.vungle.adsession.PossibleObstructionListener possibleObstructionListener);

    public abstract void start();
}
