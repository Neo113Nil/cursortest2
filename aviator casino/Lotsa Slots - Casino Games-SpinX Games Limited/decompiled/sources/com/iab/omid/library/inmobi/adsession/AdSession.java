package com.iab.omid.library.inmobi.adsession;

/* loaded from: classes5.dex */
public abstract class AdSession {
    public static com.iab.omid.library.inmobi.adsession.AdSession createAdSession(com.iab.omid.library.inmobi.adsession.AdSessionConfiguration adSessionConfiguration, com.iab.omid.library.inmobi.adsession.AdSessionContext adSessionContext) {
        com.iab.omid.library.inmobi.utils.g.a();
        com.iab.omid.library.inmobi.utils.g.a(adSessionConfiguration, "AdSessionConfiguration is null");
        com.iab.omid.library.inmobi.utils.g.a(adSessionContext, "AdSessionContext is null");
        return new com.iab.omid.library.inmobi.adsession.a(adSessionConfiguration, adSessionContext);
    }

    public abstract void addFriendlyObstruction(android.view.View view, com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose friendlyObstructionPurpose, java.lang.String str);

    public abstract void error(com.iab.omid.library.inmobi.adsession.ErrorType errorType, java.lang.String str);

    public abstract void finish();

    public abstract void registerAdView(android.view.View view);

    public abstract void removeAllFriendlyObstructions();

    public abstract void removeFriendlyObstruction(android.view.View view);

    public abstract void setPossibleObstructionListener(com.iab.omid.library.inmobi.adsession.PossibleObstructionListener possibleObstructionListener);

    public abstract void start();
}
