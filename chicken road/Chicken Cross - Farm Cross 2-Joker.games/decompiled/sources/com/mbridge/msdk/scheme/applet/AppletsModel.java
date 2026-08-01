package com.mbridge.msdk.scheme.applet;

import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.U3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.net.e;
import com.mbridge.msdk.foundation.same.net.exception.a;
import com.mbridge.msdk.foundation.same.net.utils.d;
import com.mbridge.msdk.foundation.tools.c1;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.scheme.report.AppletsReport;
import com.mbridge.msdk.scheme.request.AppletSchemeRequest;
import com.mbridge.msdk.scheme.response.AppletSchemeResponse;
import java.io.Serializable;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class AppletsModel implements Serializable {
    private static final String DYNAMIC_VIEW_WX_IS_REDIRECT_0 = "0";
    private static final String DYNAMIC_VIEW_WX_IS_REDIRECT_1 = "1";
    private static final String DYNAMIC_VIEW_WX_QUERY_PARAM_EVENT_CALLBACK = "event_callback";
    private static final String DYNAMIC_VIEW_WX_QUERY_PARAM_INSTALL_CALLBACK = "install_callback";
    public static final int REQUEST_TYPE_CLICK = 1;
    public static final int REQUEST_TYPE_SHOW = 0;
    private static String TAG = "AppletsModel";
    private static final String URL_ENCODE_UTF_8 = "UTF-8";
    private static final String WX_MINIPROGRAM = "wx_miniprogram";
    private static final int WX_SCHEME_REQUEST_ERROR_CODE_44993 = 44993;
    private volatile IAppletSchemeCallBack appletSchemeCallBack;
    private final CampaignEx campaignEx;
    private String deepLink = "";
    private volatile boolean isRequestSuccess = false;
    private boolean isRequestTimesMaxPerDay = false;
    private volatile boolean isRequesting = false;
    private boolean isSupportWxScheme = false;
    private boolean isUserClick = false;
    private int lastRequestType = -1;
    private Map<String, String> params;
    private String reBuildClickUrl;
    private final String requestId;
    private final String unitID;

    private static final class DefaultAppletSchemeResponse extends AppletSchemeResponse {
        private AppletsModel appletsModel;

        public DefaultAppletSchemeResponse(AppletsModel appletsModel) {
            this.appletsModel = appletsModel;
        }

        @Override // com.mbridge.msdk.scheme.response.AppletSchemeResponse, com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
        public void onError(a aVar) {
            super.onError(aVar);
            AppletsModel appletsModel = this.appletsModel;
            if (appletsModel == null) {
                return;
            }
            appletsModel.changeRequestingState(false);
            this.appletsModel.handlerSchemeRequestNetworkError(aVar);
        }

        @Override // com.mbridge.msdk.scheme.response.AppletSchemeResponse, com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
        public void onSuccess(e<JSONObject> eVar) {
            super.onSuccess(eVar);
            AppletsModel appletsModel = this.appletsModel;
            if (appletsModel == null) {
                return;
            }
            appletsModel.changeRequestingState(false);
            if (eVar == null || eVar.c == null) {
                this.appletsModel.handlerRequestNetworkError();
                return;
            }
            try {
                this.appletsModel.handlerSchemeRequestResult(eVar);
            } catch (SchemeRequestException e) {
                this.appletsModel.handlerSchemeRequestFailed(-2, e.getMessage());
            }
        }
    }

    private static final class SchemeRequestException extends Exception {
        public SchemeRequestException(String str) {
            super(str);
        }
    }

    public AppletsModel(CampaignEx campaignEx, String str, String str2) {
        this.campaignEx = campaignEx;
        this.unitID = str;
        this.requestId = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void changeRequestingState(boolean z) {
        this.isRequesting = z;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:11|(8:12|13|(4:15|16|(2:44|45)(10:20|21|22|23|(2:34|35)|27|28|(1:30)|31|32)|33)(1:52)|46|47|48|(1:50)|51)|53|54|55|(14:57|58|59|60|(9:62|63|64|65|(4:67|68|69|70)|87|68|69|70)|94|63|64|65|(0)|87|68|69|70)|101|58|59|60|(0)|94|63|64|65|(0)|87|68|69|70) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x00fe, code lost:
    
        com.mbridge.msdk.foundation.tools.q0.b(com.mbridge.msdk.scheme.applet.AppletsModel.TAG, "create wechat app request param failed ", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x00df, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x00e3, code lost:
    
        if (com.mbridge.msdk.MBridgeConstans.DEBUG != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x00e5, code lost:
    
        com.mbridge.msdk.foundation.tools.q0.b(com.mbridge.msdk.scheme.applet.AppletsModel.TAG, "create wechat app request param failed ", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0129, code lost:
    
        if (r0 != null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x013c, code lost:
    
        r8.put(r18, r0);
        r8.put(r17, "0");
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0148, code lost:
    
        if (com.mbridge.msdk.MBridgeConstans.DEBUG == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x014a, code lost:
    
        com.mbridge.msdk.foundation.tools.q0.a(com.mbridge.msdk.scheme.applet.AppletsModel.TAG, "query: " + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01bb, code lost:
    
        r19.reBuildClickUrl = reCreateClickUrl(com.mbridge.msdk.MBridgeConstans.DYNAMIC_VIEW_WX_APP + com.ironsource.U3.j.b + r1 + com.ironsource.U3.j.c + "path" + com.ironsource.U3.j.b + r2 + com.ironsource.U3.j.c + r18 + com.ironsource.U3.j.b + r0 + com.ironsource.U3.j.c + com.mbridge.msdk.MBridgeConstans.DYNAMIC_VIEW_WX_CLICKID + com.ironsource.U3.j.b + r3 + com.ironsource.U3.j.c + r17 + com.ironsource.U3.j.b + "1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0139, code lost:
    
        r0 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x012f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0132, code lost:
    
        if (com.mbridge.msdk.MBridgeConstans.DEBUG != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0134, code lost:
    
        com.mbridge.msdk.foundation.tools.q0.b(com.mbridge.msdk.scheme.applet.AppletsModel.TAG, "create wechat app request param failed ", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0111, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0115, code lost:
    
        if (com.mbridge.msdk.MBridgeConstans.DEBUG != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0117, code lost:
    
        com.mbridge.msdk.foundation.tools.q0.b(com.mbridge.msdk.scheme.applet.AppletsModel.TAG, "create wechat app request param failed ", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00f8, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x00fc, code lost:
    
        if (com.mbridge.msdk.MBridgeConstans.DEBUG != false) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Map<String, String> getAppletsParamsAndBuildRequest(CampaignEx campaignEx) {
        Uri parse;
        String str;
        String str2;
        String str3;
        String queryParameter;
        String queryParameter2;
        String str4;
        String str5;
        String str6 = MBridgeConstans.DYNAMIC_VIEW_WX_IS_REDIRECT;
        String str7 = "query";
        HashMap hashMap = new HashMap();
        if (campaignEx == null) {
            return hashMap;
        }
        try {
            parse = Uri.parse(campaignEx.getClickURL());
        } catch (Exception e) {
            e = e;
        }
        if (parse != null && parse.getQueryParameterNames() != null) {
            StringBuilder sb = new StringBuilder();
            Iterator<String> it = parse.getQueryParameterNames().iterator();
            int i = 0;
            while (true) {
                String str8 = "";
                if (!it.hasNext()) {
                    break;
                }
                try {
                    Iterator<String> it2 = it;
                    String next = it.next();
                    if (TextUtils.isEmpty(next) || TextUtils.equals(next, "wx_miniprogram")) {
                        str4 = str6;
                        str5 = str7;
                    } else {
                        try {
                            str8 = parse.getQueryParameter(next);
                        } catch (Exception unused) {
                        }
                        String str9 = str8;
                        if (TextUtils.equals(next, DYNAMIC_VIEW_WX_QUERY_PARAM_EVENT_CALLBACK) || TextUtils.equals(next, DYNAMIC_VIEW_WX_QUERY_PARAM_INSTALL_CALLBACK)) {
                            try {
                                str9 = URLEncoder.encode(str9, "UTF-8");
                            } catch (Exception e2) {
                                if (MBridgeConstans.DEBUG) {
                                    str4 = str6;
                                    str5 = str7;
                                    q0.b(TAG, "encode url for " + str9 + " failed", e2);
                                }
                            }
                        }
                        str4 = str6;
                        str5 = str7;
                        sb.append(next).append(U3.j.b).append(str9);
                        if (i < parse.getQueryParameterNames().size()) {
                            sb.append(U3.j.c);
                        }
                        i++;
                    }
                    it = it2;
                    str6 = str4;
                    str7 = str5;
                } catch (Exception e3) {
                    e = e3;
                }
                e = e3;
                if (MBridgeConstans.DEBUG) {
                    q0.b(TAG, "create wechat app request param failed ", e);
                }
                return hashMap;
            }
            String str10 = str6;
            String str11 = str7;
            String queryParameter3 = parse.getQueryParameter(MBridgeConstans.DYNAMIC_VIEW_WX_APP);
            if (queryParameter3 != null) {
                str = queryParameter3;
                hashMap.put(MBridgeConstans.DYNAMIC_VIEW_WX_APP, str);
                queryParameter2 = parse.getQueryParameter("path");
                if (queryParameter2 != null) {
                    str2 = queryParameter2;
                    hashMap.put("path", str2);
                    queryParameter = parse.getQueryParameter(MBridgeConstans.DYNAMIC_VIEW_WX_CLICKID);
                    if (queryParameter != null) {
                        str3 = queryParameter;
                        hashMap.put(MBridgeConstans.DYNAMIC_VIEW_WX_CLICKID, str3);
                        String str12 = URLEncoder.encode(sb.toString(), "UTF-8");
                    }
                    str3 = "";
                    hashMap.put(MBridgeConstans.DYNAMIC_VIEW_WX_CLICKID, str3);
                    String str122 = URLEncoder.encode(sb.toString(), "UTF-8");
                }
                str2 = "";
                hashMap.put("path", str2);
                queryParameter = parse.getQueryParameter(MBridgeConstans.DYNAMIC_VIEW_WX_CLICKID);
                if (queryParameter != null) {
                }
                str3 = "";
                hashMap.put(MBridgeConstans.DYNAMIC_VIEW_WX_CLICKID, str3);
                String str1222 = URLEncoder.encode(sb.toString(), "UTF-8");
            }
            str = "";
            hashMap.put(MBridgeConstans.DYNAMIC_VIEW_WX_APP, str);
            queryParameter2 = parse.getQueryParameter("path");
            if (queryParameter2 != null) {
            }
            str2 = "";
            hashMap.put("path", str2);
            queryParameter = parse.getQueryParameter(MBridgeConstans.DYNAMIC_VIEW_WX_CLICKID);
            if (queryParameter != null) {
            }
            str3 = "";
            hashMap.put(MBridgeConstans.DYNAMIC_VIEW_WX_CLICKID, str3);
            String str12222 = URLEncoder.encode(sb.toString(), "UTF-8");
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handlerRequestNetworkError() {
        if (this.appletSchemeCallBack == null) {
            return;
        }
        if (MBridgeConstans.DEBUG) {
            q0.a(TAG, "handlerRequestNetworkError response or result is null");
        }
        try {
            this.appletSchemeCallBack.onNetworkError(1, "response or result is null", this.reBuildClickUrl);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                q0.b(TAG, "handler request network error exception ", e);
            }
        }
        AppletsReport.reportAppletsLoadState(c.n().d(), "response or result is null", this.unitID, this.requestId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handlerSchemeRequestFailed(int i, String str) {
        if (this.appletSchemeCallBack == null) {
            return;
        }
        if (MBridgeConstans.DEBUG) {
            q0.a(TAG, String.format("handlerSchemeRequestFailed network error by code %s and %s", String.valueOf(i), str));
        }
        try {
            this.appletSchemeCallBack.onAppletSchemeRequestFailed(i, str, this.reBuildClickUrl);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                q0.b(TAG, "handler wx scheme failed exception  ", e);
            }
        }
        AppletsReport.reportAppletsLoadState(c.n().d(), String.format("network error by code %s and %s", String.valueOf(i), str), this.unitID, this.requestId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handlerSchemeRequestNetworkError(a aVar) {
        int i;
        String str;
        if (this.appletSchemeCallBack == null) {
            return;
        }
        if (aVar != null) {
            i = aVar.f9348a;
            str = aVar.getMessage();
            if (i == 10) {
                str = "request timeout";
            }
        } else {
            i = -1;
            str = "unKnown";
        }
        if (MBridgeConstans.DEBUG) {
            q0.a(TAG, String.format("handlerSchemeRequestNetworkError network error by code %s and %s", String.valueOf(i), str));
        }
        try {
            this.appletSchemeCallBack.onNetworkError(i, "network error: " + str, this.reBuildClickUrl);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                q0.b(TAG, "handler wx scheme network error exception ", e);
            }
        }
        AppletsReport.reportAppletsLoadState(c.n().d(), String.format("network error by code %s and %s", String.valueOf(i), str), this.unitID, this.requestId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handlerSchemeRequestResult(e<JSONObject> eVar) throws SchemeRequestException {
        JSONObject jSONObject = eVar.c;
        if (MBridgeConstans.DEBUG) {
            q0.a("AppletsModel", "result: " + jSONObject.toString());
        }
        if (jSONObject.has("wx_scheme")) {
            String optString = jSONObject.optString("wx_scheme", "");
            if (TextUtils.isEmpty(optString)) {
                throw new SchemeRequestException("wx_scheme value is null");
            }
            this.isRequestSuccess = true;
            handlerSchemeRequestSuccess(optString);
            return;
        }
        int optInt = jSONObject.optInt("error_code", -1);
        String optString2 = jSONObject.optString("error_msg", "");
        if (optInt == WX_SCHEME_REQUEST_ERROR_CODE_44993) {
            this.isRequestTimesMaxPerDay = true;
        }
        handlerSchemeRequestFailed(optInt, optString2);
    }

    private void handlerSchemeRequestStart() {
        if (this.appletSchemeCallBack == null) {
            return;
        }
        try {
            this.appletSchemeCallBack.onAppletSchemeRequestStart();
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                q0.b(TAG, "handler wx scheme start exception ", e);
            }
        }
        AppletsReport.reportAppletsLoadState(c.n().d(), "start load wx scheme", this.unitID, this.requestId);
    }

    private void handlerSchemeRequestSuccess(String str) {
        if (this.appletSchemeCallBack == null) {
            return;
        }
        if (MBridgeConstans.DEBUG) {
            q0.a(TAG, "handlerSchemeRequestSuccess: " + str);
        }
        try {
            this.deepLink = str;
            this.appletSchemeCallBack.onAppletSchemeRequestSuccess(str);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                q0.b(TAG, "handler wx scheme success exception ", e);
            }
        }
        AppletsReport.reportAppletsLoadState(c.n().d(), "request wx scheme success", this.unitID, this.requestId);
    }

    private boolean isCanRequestByClickUrl(String str) {
        try {
            CampaignEx campaignEx = this.campaignEx;
            if (campaignEx == null) {
                return false;
            }
            String clickURL = campaignEx.getClickURL();
            if (TextUtils.isEmpty(clickURL)) {
                return false;
            }
            return TextUtils.equals(c1.a(clickURL, "wx_miniprogram"), str);
        } catch (Exception e) {
            if (!MBridgeConstans.DEBUG) {
                return false;
            }
            q0.b(TAG, "query wx_miniprogram from click url exception ", e);
            return false;
        }
    }

    private boolean isCanRequestByLinkType() {
        CampaignEx campaignEx = this.campaignEx;
        if (campaignEx == null) {
            return false;
        }
        int linkType = campaignEx.getLinkType();
        return linkType == 8 || linkType == 9;
    }

    private boolean isCanRequestByTemplateUrl(String str) {
        CampaignEx.c rewardTemplateMode;
        try {
            CampaignEx campaignEx = this.campaignEx;
            if (campaignEx != null && (rewardTemplateMode = campaignEx.getRewardTemplateMode()) != null && !TextUtils.isEmpty(rewardTemplateMode.j())) {
                return TextUtils.equals(c1.a(rewardTemplateMode.j(), MBridgeConstans.DYNAMIC_VIEW_REQ_WX_URL), str);
            }
            return false;
        } catch (Exception e) {
            if (!MBridgeConstans.DEBUG) {
                return false;
            }
            q0.b(TAG, "query reqwxurl from template url exception ", e);
            return false;
        }
    }

    private String reCreateClickUrl(String str) {
        return d.h().b + "?" + str;
    }

    public boolean can(int i) {
        if (isRequesting() || !canRequestWxScheme(i)) {
            return false;
        }
        if (this.lastRequestType == -1) {
            return true;
        }
        if (isRequestSuccess()) {
            return false;
        }
        int i2 = this.lastRequestType;
        return (i2 == 0 && i == 1) || (i2 == 1 && i == 1 && this.isUserClick);
    }

    public boolean canRequestWxScheme(int i) {
        if (isSupportWxScheme()) {
            return i != 0 ? i == 1 : isCanRequestByTemplateUrl("2");
        }
        return false;
    }

    public void clearRequestState() {
        this.isRequestSuccess = false;
        this.isRequesting = false;
        this.appletSchemeCallBack = null;
    }

    public String getDeepLink() {
        return this.deepLink;
    }

    public String getReBuildClickUrl() {
        return this.reBuildClickUrl;
    }

    public boolean isRequestSuccess() {
        return this.isRequestSuccess;
    }

    public boolean isRequestTimesMaxPerDay() {
        return this.isRequestTimesMaxPerDay;
    }

    public boolean isRequesting() {
        return this.isRequesting;
    }

    public boolean isSupportWxScheme() {
        if (!this.isSupportWxScheme) {
            this.isSupportWxScheme = isCanRequestByClickUrl("1") && isCanRequestByLinkType();
        }
        return this.isSupportWxScheme;
    }

    public void requestWxAppletsScheme(int i, IAppletSchemeCallBack iAppletSchemeCallBack) {
        if (this.campaignEx == null || TextUtils.isEmpty(this.unitID)) {
            return;
        }
        if (MBridgeConstans.DEBUG) {
            q0.b(TAG, "start request wx scheme");
        }
        this.isRequesting = true;
        if (iAppletSchemeCallBack != null) {
            this.appletSchemeCallBack = iAppletSchemeCallBack;
        }
        handlerSchemeRequestStart();
        AppletSchemeRequest appletSchemeRequest = new AppletSchemeRequest(c.n().d());
        if (this.params == null) {
            this.params = getAppletsParamsAndBuildRequest(this.campaignEx);
        }
        if (this.params == null) {
            return;
        }
        if (isRequestTimesMaxPerDay()) {
            handlerSchemeRequestFailed(WX_SCHEME_REQUEST_ERROR_CODE_44993, "get wxscheme failed : request times is max");
        } else {
            this.lastRequestType = i;
            appletSchemeRequest.get(1, d.h().b, this.params, new DefaultAppletSchemeResponse(this), "applets_model", 60000L);
        }
    }

    public void setAppletSchemeCallBack(IAppletSchemeCallBack iAppletSchemeCallBack) {
        this.appletSchemeCallBack = iAppletSchemeCallBack;
    }

    public void setRequestingFinish() {
        this.isRequesting = false;
    }

    public void setUserClick(boolean z) {
        this.isUserClick = z;
    }
}
