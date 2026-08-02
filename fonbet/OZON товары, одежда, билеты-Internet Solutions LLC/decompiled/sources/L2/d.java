package L2;

import C2.C2712g;
import C2.k0;
import E2.B;
import E2.C2961a;
import E2.C2962b;
import E2.C2964d;
import E2.f;
import E2.l;
import E2.n;
import E2.p;
import E2.r;
import E2.s;
import E2.x;
import E2.z;
import Sc.InterfaceC3999a;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Base64;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.Attachment;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria;
import com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension;
import com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity;
import com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension;
import com.google.android.gms.fido.u2f.api.common.ClientData;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final LinkedHashMap<ErrorCode, E2.e> f16231a = U.g(new Pair(ErrorCode.UNKNOWN_ERR, new B()), new Pair(ErrorCode.ABORT_ERR, new C2961a()), new Pair(ErrorCode.ATTESTATION_NOT_PRIVATE_ERR, new r()), new Pair(ErrorCode.CONSTRAINT_ERR, new C2962b()), new Pair(ErrorCode.DATA_ERR, new C2964d()), new Pair(ErrorCode.INVALID_STATE_ERR, new l()), new Pair(ErrorCode.ENCODING_ERR, new f()), new Pair(ErrorCode.NETWORK_ERR, new n()), new Pair(ErrorCode.NOT_ALLOWED_ERR, new p()), new Pair(ErrorCode.NOT_SUPPORTED_ERR, new s()), new Pair(ErrorCode.SECURITY_ERR, new x()), new Pair(ErrorCode.TIMEOUT_ERR, new z()));

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f16232b = 0;

    public static final class a {
        @NotNull
        public static PublicKeyCredentialCreationOptions a(@NotNull C2712g request, @NotNull Context context) {
            boolean z11;
            int i11;
            String str;
            ArrayList arrayList;
            long j11;
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(context, "context");
            if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0) {
                PackageManager packageManager = context.getPackageManager();
                Intrinsics.checkNotNullExpressionValue(packageManager, "context.packageManager");
                if (Build.VERSION.SDK_INT >= 28) {
                    PackageInfo packageInfo = packageManager.getPackageInfo("com.google.android.gms", 0);
                    Intrinsics.checkNotNullExpressionValue(packageInfo, "packageManager.getPackageInfo(packageName, 0)");
                    j11 = b.a(packageInfo);
                } else {
                    j11 = packageManager.getPackageInfo("com.google.android.gms", 0).versionCode;
                }
                if (j11 > 241217000) {
                    request.getClass();
                    return new PublicKeyCredentialCreationOptions(null);
                }
            }
            request.getClass();
            JSONObject json = new JSONObject((String) null);
            Intrinsics.checkNotNullParameter(json, "json");
            PublicKeyCredentialCreationOptions.Builder builder = new PublicKeyCredentialCreationOptions.Builder();
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(builder, "builder");
            builder.setChallenge(c(json));
            int i12 = d.f16232b;
            JSONObject jSONObject = json.getJSONObject("user");
            String str2 = "id";
            String str3 = jSONObject.getString("id");
            Intrinsics.checkNotNullExpressionValue(str3, "user.getString(JSON_KEY_ID)");
            Intrinsics.checkNotNullParameter(str3, "str");
            byte[] decode = Base64.decode(str3, 11);
            String str4 = "decode(str, FLAGS)";
            Intrinsics.checkNotNullExpressionValue(decode, "decode(str, FLAGS)");
            String userName = jSONObject.getString(AppMeasurementSdk.ConditionalUserProperty.NAME);
            String displayName = jSONObject.getString("displayName");
            String optString = jSONObject.optString("icon", "");
            Intrinsics.checkNotNullExpressionValue(displayName, "displayName");
            if (displayName.length() == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing displayName or they are unexpectedly empty");
            }
            if (decode.length == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing user id or they are unexpectedly empty");
            }
            Intrinsics.checkNotNullExpressionValue(userName, "userName");
            if (userName.length() == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing user name or they are unexpectedly empty");
            }
            builder.setUser(new PublicKeyCredentialUserEntity(decode, userName, optString, displayName));
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(builder, "builder");
            JSONObject jSONObject2 = json.getJSONObject("rp");
            String rpId = jSONObject2.getString("id");
            String rpName = jSONObject2.optString(AppMeasurementSdk.ConditionalUserProperty.NAME, "");
            String optString2 = jSONObject2.optString("icon", "");
            Intrinsics.f(optString2);
            if (optString2.length() == 0) {
                optString2 = null;
            }
            Intrinsics.checkNotNullExpressionValue(rpName, "rpName");
            if (rpName.length() == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions rp name is missing or unexpectedly empty");
            }
            Intrinsics.checkNotNullExpressionValue(rpId, "rpId");
            if (rpId.length() == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions rp ID is missing or unexpectedly empty");
            }
            builder.setRp(new PublicKeyCredentialRpEntity(rpId, rpName, optString2));
            JSONArray jSONArray = json.getJSONArray("pubKeyCredParams");
            ArrayList arrayList2 = new ArrayList();
            int length = jSONArray.length();
            int i13 = 0;
            while (i13 < length) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i13);
                int i14 = d.f16232b;
                String str5 = str4;
                int i15 = (int) jSONObject3.getLong("alg");
                String typeParam = jSONObject3.optString("type", "");
                Intrinsics.checkNotNullExpressionValue(typeParam, "typeParam");
                if (typeParam.length() == 0) {
                    throw new JSONException("PublicKeyCredentialCreationOptions PublicKeyCredentialParameter type missing or unexpectedly empty");
                }
                try {
                    COSEAlgorithmIdentifier.fromCoseValue(i15);
                    arrayList2.add(new PublicKeyCredentialParameters(typeParam, i15));
                } catch (Throwable unused) {
                }
                i13++;
                str4 = str5;
            }
            String str6 = str4;
            builder.setParameters(arrayList2);
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(builder, "builder");
            ArrayList arrayList3 = new ArrayList();
            int i16 = d.f16232b;
            if (json.has("excludeCredentials")) {
                JSONArray jSONArray2 = json.getJSONArray("excludeCredentials");
                int length2 = jSONArray2.length();
                int i17 = 0;
                while (i17 < length2) {
                    JSONObject jSONObject4 = jSONArray2.getJSONObject(i17);
                    int i18 = d.f16232b;
                    String str7 = jSONObject4.getString(str2);
                    Intrinsics.checkNotNullExpressionValue(str7, "descriptorJSON.getString(JSON_KEY_ID)");
                    Intrinsics.checkNotNullParameter(str7, "str");
                    byte[] decode2 = Base64.decode(str7, 11);
                    String str8 = str6;
                    Intrinsics.checkNotNullExpressionValue(decode2, str8);
                    String descriptorType = jSONObject4.getString("type");
                    JSONArray jSONArray3 = jSONArray2;
                    Intrinsics.checkNotNullExpressionValue(descriptorType, "descriptorType");
                    if (descriptorType.length() == 0) {
                        throw new JSONException("PublicKeyCredentialDescriptor type value is not found or unexpectedly empty");
                    }
                    if (decode2.length == 0) {
                        throw new JSONException("PublicKeyCredentialDescriptor id value is not found or unexpectedly empty");
                    }
                    if (jSONObject4.has("transports")) {
                        i11 = length2;
                        arrayList = new ArrayList();
                        JSONArray jSONArray4 = jSONObject4.getJSONArray("transports");
                        int length3 = jSONArray4.length();
                        str = str2;
                        int i19 = 0;
                        while (i19 < length3) {
                            try {
                                JSONArray jSONArray5 = jSONArray4;
                                Transport fromString = Transport.fromString(jSONArray4.getString(i19));
                                int i21 = i19;
                                Intrinsics.checkNotNullExpressionValue(fromString, "fromString(descriptorTransports.getString(j))");
                                arrayList.add(fromString);
                                i19 = i21 + 1;
                                jSONArray4 = jSONArray5;
                            } catch (Transport.UnsupportedTransportException e11) {
                                throw new F2.a(new f(), e11.getMessage());
                            }
                        }
                    } else {
                        i11 = length2;
                        str = str2;
                        arrayList = null;
                    }
                    arrayList3.add(new PublicKeyCredentialDescriptor(descriptorType, decode2, arrayList));
                    i17++;
                    jSONArray2 = jSONArray3;
                    str6 = str8;
                    length2 = i11;
                    str2 = str;
                }
            }
            builder.setExcludeList(arrayList3);
            int i22 = d.f16232b;
            String str9 = DevicePublicKeyStringDef.NONE;
            String attestationString = json.optString("attestation", DevicePublicKeyStringDef.NONE);
            Intrinsics.checkNotNullExpressionValue(attestationString, "attestationString");
            if (attestationString.length() != 0) {
                str9 = attestationString;
            }
            builder.setAttestationConveyancePreference(AttestationConveyancePreference.fromString(str9));
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(builder, "builder");
            if (json.has("timeout")) {
                builder.setTimeoutSeconds(Double.valueOf(json.getLong("timeout") / 1000));
            }
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(builder, "builder");
            if (json.has("authenticatorSelection")) {
                JSONObject jSONObject5 = json.getJSONObject("authenticatorSelection");
                AuthenticatorSelectionCriteria.Builder builder2 = new AuthenticatorSelectionCriteria.Builder();
                boolean optBoolean = jSONObject5.optBoolean("requireResidentKey", false);
                String residentKey = jSONObject5.optString("residentKey", "");
                Intrinsics.checkNotNullExpressionValue(residentKey, "residentKey");
                builder2.setRequireResidentKey(Boolean.valueOf(optBoolean)).setResidentKeyRequirement(residentKey.length() > 0 ? ResidentKeyRequirement.fromString(residentKey) : null);
                String authenticatorAttachmentString = jSONObject5.optString("authenticatorAttachment", "");
                Intrinsics.checkNotNullExpressionValue(authenticatorAttachmentString, "authenticatorAttachmentString");
                if (authenticatorAttachmentString.length() > 0) {
                    builder2.setAttachment(Attachment.fromString(authenticatorAttachmentString));
                }
                builder.setAuthenticatorSelection(builder2.build());
            }
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(builder, "builder");
            if (json.has("extensions")) {
                JSONObject jSONObject6 = json.getJSONObject("extensions");
                AuthenticationExtensions.Builder builder3 = new AuthenticationExtensions.Builder();
                String appIdExtension = jSONObject6.optString(AppsFlyerProperties.APP_ID, "");
                Intrinsics.checkNotNullExpressionValue(appIdExtension, "appIdExtension");
                if (appIdExtension.length() > 0) {
                    builder3.setFido2Extension(new FidoAppIdExtension(appIdExtension));
                }
                if (jSONObject6.optBoolean("thirdPartyPayment", false)) {
                    z11 = true;
                    builder3.setGoogleThirdPartyPaymentExtension(new GoogleThirdPartyPaymentExtension(true));
                } else {
                    z11 = true;
                }
                if (jSONObject6.optBoolean("uvm", false)) {
                    builder3.setUserVerificationMethodExtension(new UserVerificationMethodExtension(z11));
                }
                builder.setAuthenticationExtensions(builder3.build());
            }
            PublicKeyCredentialCreationOptions build = builder.build();
            Intrinsics.checkNotNullExpressionValue(build, "builder.build()");
            return build;
        }

        @InterfaceC3999a
        @NotNull
        public static BeginSignInRequest.PasskeysRequestOptions b(@NotNull k0 option) {
            Intrinsics.checkNotNullParameter(option, "option");
            option.getClass();
            JSONObject jSONObject = new JSONObject((String) null);
            int i11 = d.f16232b;
            String rpId = jSONObject.optString("rpId", "");
            Intrinsics.checkNotNullExpressionValue(rpId, "rpId");
            if (rpId.length() == 0) {
                throw new JSONException("GetPublicKeyCredentialOption - rpId not specified in the request or is unexpectedly empty");
            }
            BeginSignInRequest.PasskeysRequestOptions build = new BeginSignInRequest.PasskeysRequestOptions.Builder().setSupported(true).setRpId(rpId).setChallenge(c(jSONObject)).build();
            Intrinsics.checkNotNullExpressionValue(build, "Builder()\n              …\n                .build()");
            return build;
        }

        private static byte[] c(JSONObject jSONObject) {
            int i11 = d.f16232b;
            String str = jSONObject.optString(ClientData.KEY_CHALLENGE, "");
            Intrinsics.checkNotNullExpressionValue(str, "challengeB64");
            if (str.length() == 0) {
                throw new JSONException("Challenge not found in request or is unexpectedly empty");
            }
            Intrinsics.checkNotNullParameter(str, "str");
            byte[] decode = Base64.decode(str, 11);
            Intrinsics.checkNotNullExpressionValue(decode, "decode(str, FLAGS)");
            return decode;
        }
    }

    private static final class b {
        public static final long a(@NotNull PackageInfo info) {
            long longVersionCode;
            Intrinsics.checkNotNullParameter(info, "info");
            longVersionCode = info.getLongVersionCode();
            return longVersionCode;
        }
    }
}
