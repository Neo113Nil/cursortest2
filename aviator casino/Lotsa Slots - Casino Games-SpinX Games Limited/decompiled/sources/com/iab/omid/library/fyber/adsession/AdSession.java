package com.iab.omid.library.fyber.adsession;

/* loaded from: classes5.dex */
public abstract class AdSession {
    public static com.iab.omid.library.fyber.adsession.AdSession createAdSession(com.iab.omid.library.fyber.adsession.AdSessionConfiguration adSessionConfiguration, com.iab.omid.library.fyber.adsession.AdSessionContext adSessionContext) {
        com.iab.omid.library.fyber.utils.g.a();
        com.iab.omid.library.fyber.utils.g.a(adSessionConfiguration, "AdSessionConfiguration is null");
        com.iab.omid.library.fyber.utils.g.a(adSessionContext, "AdSessionContext is null");
        return new com.iab.omid.library.fyber.adsession.a(adSessionConfiguration, adSessionContext);
    }

    public abstract void addFriendlyObstruction(android.view.View view, com.iab.omid.library.fyber.adsession.FriendlyObstructionPurpose friendlyObstructionPurpose, java.lang.String str);

    public abstract void error(com.iab.omid.library.fyber.adsession.ErrorType errorType, java.lang.String str);

    public abstract void finish();

    public abstract void registerAdView(android.view.View view);

    public abstract void removeAllFriendlyObstructions();

    public abstract void removeFriendlyObstruction(android.view.View view);

    public abstract void setPossibleObstructionListener(com.iab.omid.library.fyber.adsession.PossibleObstructionListener possibleObstructionListener);

    public abstract void start();
}
