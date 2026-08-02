package Ve;

/* loaded from: classes10.dex */
public enum Ap implements InterfaceC4443me {
    TOUCH_BACK("TouchBack"),
    TOUCH_LOG_OUT("TouchLogOut"),
    /* JADX INFO: Fake field, exist only in values array */
    RQ_REVOKE_TOKEN_SDK("RQRevokeTokenSdk"),
    RQ_GOOD_REVOKE_TOKEN_SDK("RQGoodRevokeTokenSdk"),
    RQ_FAIL_REVOKE_TOKEN_SDK("RQFailRevokeTokenSdk"),
    RS_GOOD_REVOKE_TOKEN_SDK("RSGoodRevokeTokenSdk"),
    RS_FAIL_REVOKE_TOKEN_SDK("RSFailRevokeTokenSdk"),
    /* JADX INFO: Fake field, exist only in values array */
    ST_REMOVE_REFRESH("STRemoveRefresh"),
    LC_PROFILE_VIEW_APPEARED("LCProfileViewAppeared"),
    LC_PROFILE_VIEW_DISAPPEARED("LCProfileViewDisappeared");


    /* renamed from: a, reason: collision with root package name */
    public final String f28647a;

    Ap(String str) {
        this.f28647a = str;
    }

    @Override // Ve.InterfaceC4443me
    public final String a() {
        return this.f28647a;
    }
}
