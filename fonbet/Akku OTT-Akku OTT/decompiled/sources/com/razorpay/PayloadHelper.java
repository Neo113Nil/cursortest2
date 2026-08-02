package com.razorpay;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\bM\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u0010\u0010~\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0003H\u0002J\u0006\u0010\u007f\u001a\u000203R\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0015\"\u0004\b\u001f\u0010\u0017R\u001c\u0010 \u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0015\"\u0004\b\"\u0010\u0017R\u001c\u0010#\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0015\"\u0004\b%\u0010\u0017R\u001e\u0010&\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b'\u0010\u000b\"\u0004\b(\u0010\rR\u001c\u0010)\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0015\"\u0004\b+\u0010\u0017R\u001e\u0010,\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b-\u0010\u000b\"\u0004\b.\u0010\rR\u001c\u0010/\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0015\"\u0004\b1\u0010\u0017R\u001c\u00102\u001a\u0004\u0018\u000103X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u0015\"\u0004\b9\u0010\u0017R\u001c\u0010:\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u0015\"\u0004\b<\u0010\u0017R\u001c\u0010=\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u0015\"\u0004\b?\u0010\u0017R\u001c\u0010@\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u0015\"\u0004\bB\u0010\u0017R\u001c\u0010C\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u0015\"\u0004\bE\u0010\u0017R\u001c\u0010F\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\u0015\"\u0004\bH\u0010\u0017R\u001c\u0010I\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010\u0015\"\u0004\bK\u0010\u0017R\u001c\u0010L\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010\u0015\"\u0004\bN\u0010\u0017R\u001c\u0010O\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010\u0015\"\u0004\bQ\u0010\u0017R\u001c\u0010R\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010\u0015\"\u0004\bT\u0010\u0017R\u001e\u0010U\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\bV\u0010\u000b\"\u0004\bW\u0010\rR\u001e\u0010X\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\bY\u0010\u000b\"\u0004\bZ\u0010\rR\u001e\u0010[\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\\\u0010\u000b\"\u0004\b]\u0010\rR\u001c\u0010^\u001a\u0004\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\u001e\u0010c\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\bd\u0010\u000b\"\u0004\be\u0010\rR\u001e\u0010f\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\bg\u0010\u000b\"\u0004\bh\u0010\rR\u001e\u0010i\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\bj\u0010\u000b\"\u0004\bk\u0010\rR\u001e\u0010l\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010q\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\u001e\u0010r\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\bs\u0010\u000b\"\u0004\bt\u0010\rR\u001e\u0010u\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\bv\u0010\u000b\"\u0004\bw\u0010\rR\u001c\u0010x\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\by\u0010\u0015\"\u0004\bz\u0010\u0017R\u001e\u0010{\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010q\u001a\u0004\b|\u0010n\"\u0004\b}\u0010p¨\u0006\u0080\u0001"}, d2 = {"Lcom/razorpay/PayloadHelper;", "", FirebaseAnalytics.Param.CURRENCY, "", "amount", "", "orderId", "(Ljava/lang/String;ILjava/lang/String;)V", "allowRotation", "", "getAllowRotation", "()Ljava/lang/Boolean;", "setAllowRotation", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getAmount", "()I", "setAmount", "(I)V", "backDropColor", "getBackDropColor", "()Ljava/lang/String;", "setBackDropColor", "(Ljava/lang/String;)V", "callbackUrl", "getCallbackUrl", "setCallbackUrl", "color", "getColor", "setColor", "getCurrency", "setCurrency", "customerId", "getCustomerId", "setCustomerId", "description", "getDescription", "setDescription", "hideTopBar", "getHideTopBar", "setHideTopBar", "image", "getImage", "setImage", "modalConfirmClose", "getModalConfirmClose", "setModalConfirmClose", "name", "getName", "setName", "notes", "Lorg/json/JSONObject;", "getNotes", "()Lorg/json/JSONObject;", "setNotes", "(Lorg/json/JSONObject;)V", "getOrderId", "setOrderId", "prefillBankName", "getPrefillBankName", "setPrefillBankName", "prefillCardCvv", "getPrefillCardCvv", "setPrefillCardCvv", "prefillCardExp", "getPrefillCardExp", "setPrefillCardExp", "prefillCardNum", "getPrefillCardNum", "setPrefillCardNum", "prefillContact", "getPrefillContact", "setPrefillContact", "prefillEmail", "getPrefillEmail", "setPrefillEmail", "prefillMethod", "getPrefillMethod", "setPrefillMethod", "prefillName", "getPrefillName", "setPrefillName", "prefillVpa", "getPrefillVpa", "setPrefillVpa", "readOnlyContact", "getReadOnlyContact", "setReadOnlyContact", "readOnlyEmail", "getReadOnlyEmail", "setReadOnlyEmail", "readOnlyName", "getReadOnlyName", "setReadOnlyName", "recurring", "getRecurring", "()Ljava/lang/Object;", "setRecurring", "(Ljava/lang/Object;)V", "redirect", "getRedirect", "setRedirect", "rememberCustomer", "getRememberCustomer", "setRememberCustomer", "retryEnabled", "getRetryEnabled", "setRetryEnabled", "retryMaxCount", "getRetryMaxCount", "()Ljava/lang/Integer;", "setRetryMaxCount", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "sendSmsHash", "getSendSmsHash", "setSendSmsHash", "subscriptionCardChange", "getSubscriptionCardChange", "setSubscriptionCardChange", "subscriptionId", "getSubscriptionId", "setSubscriptionId", "timeout", "getTimeout", "setTimeout", "checkColorValidityAndSanitize", "getJson", "checkout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PayloadHelper {
    private Boolean allowRotation;
    private int amount;
    private String backDropColor;
    private String callbackUrl;
    private String color;
    private String currency;
    private String customerId;
    private String description;
    private Boolean hideTopBar;
    private String image;
    private Boolean modalConfirmClose;
    private String name;
    private JSONObject notes;
    private String orderId;
    private String prefillBankName;
    private String prefillCardCvv;
    private String prefillCardExp;
    private String prefillCardNum;
    private String prefillContact;
    private String prefillEmail;
    private String prefillMethod;
    private String prefillName;
    private String prefillVpa;
    private Boolean readOnlyContact;
    private Boolean readOnlyEmail;
    private Boolean readOnlyName;
    private Object recurring;
    private Boolean redirect;
    private Boolean rememberCustomer;
    private Boolean retryEnabled;
    private Integer retryMaxCount;
    private Boolean sendSmsHash;
    private Boolean subscriptionCardChange;
    private String subscriptionId;
    private Integer timeout;

    public PayloadHelper(String currency, int i, String orderId) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        this.currency = currency;
        this.amount = i;
        this.orderId = orderId;
    }

    private final String checkColorValidityAndSanitize(String color) {
        boolean startsWith$default;
        boolean startsWith$default2;
        if (color.length() < 6) {
            return "Invalid color";
        }
        if (color.length() == 6) {
            startsWith$default2 = StringsKt__StringsJVMKt.startsWith$default(color, "#", false, 2, null);
            return startsWith$default2 ? "Invalid color" : "#".concat(color);
        }
        if (color.length() != 7) {
            return "Invalid color";
        }
        startsWith$default = StringsKt__StringsJVMKt.startsWith$default(color, "#", false, 2, null);
        return startsWith$default ? color : "Invalid color";
    }

    public final Boolean getAllowRotation() {
        return this.allowRotation;
    }

    public final int getAmount() {
        return this.amount;
    }

    public final String getBackDropColor() {
        return this.backDropColor;
    }

    public final String getCallbackUrl() {
        return this.callbackUrl;
    }

    public final String getColor() {
        return this.color;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getCustomerId() {
        return this.customerId;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Boolean getHideTopBar() {
        return this.hideTopBar;
    }

    public final String getImage() {
        return this.image;
    }

    public final JSONObject getJson() {
        boolean startsWith$default;
        boolean startsWith$default2;
        boolean startsWith$default3;
        boolean startsWith$default4;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        try {
            jSONObject.put(FirebaseAnalytics.Param.CURRENCY, this.currency);
            jSONObject.put("amount", this.amount);
            startsWith$default = StringsKt__StringsJVMKt.startsWith$default(this.orderId, "order_", false, 2, null);
            if (!startsWith$default) {
                JSONObject put = new JSONObject().put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Invalid order id. Order ID starts with order_");
                Intrinsics.checkNotNullExpressionValue(put, "JSONObject().put(\"error\"…r ID starts with order_\")");
                return put;
            }
            jSONObject.put("order_id", this.orderId);
            String str = this.name;
            if (str != null) {
                jSONObject.put("name", str);
            }
            String str2 = this.description;
            if (str2 != null) {
                jSONObject.put("description", str2);
            }
            String str3 = this.image;
            if (str3 != null) {
                jSONObject.put("image", str3);
            }
            String str4 = this.prefillName;
            if (str4 != null) {
                jSONObject3.put("name", str4);
            }
            String str5 = this.prefillContact;
            if (str5 != null) {
                jSONObject3.put("contact", str5);
            }
            String str6 = this.prefillEmail;
            if (str6 != null) {
                jSONObject3.put("email", str6);
            }
            String str7 = this.prefillMethod;
            if (str7 != null) {
                jSONObject3.put("method", str7);
            }
            String str8 = this.prefillCardNum;
            if (str8 != null) {
                jSONObject3.put("card[number]", str8);
            }
            String str9 = this.prefillCardExp;
            if (str9 != null) {
                jSONObject3.put("card[expiry]", str9);
            }
            String str10 = this.prefillCardCvv;
            if (str10 != null) {
                jSONObject3.put("card[cvv]", str10);
            }
            String str11 = this.prefillBankName;
            if (str11 != null) {
                jSONObject3.put("bank", str11);
            }
            String str12 = this.prefillVpa;
            if (str12 != null) {
                jSONObject3.put("vpa", str12);
            }
            if (jSONObject3.length() > 0) {
                jSONObject.put("prefill", jSONObject3);
            }
            JSONObject jSONObject5 = this.notes;
            if (jSONObject5 != null) {
                jSONObject.put("notes", jSONObject5);
            }
            String str13 = this.color;
            if (str13 != null) {
                String checkColorValidityAndSanitize = checkColorValidityAndSanitize(str13);
                startsWith$default4 = StringsKt__StringsJVMKt.startsWith$default(checkColorValidityAndSanitize, "#", false, 2, null);
                if (!startsWith$default4) {
                    JSONObject put2 = new JSONObject().put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, checkColorValidityAndSanitize);
                    Intrinsics.checkNotNullExpressionValue(put2, "JSONObject().put(\"error\",sanitizedColor)");
                    return put2;
                }
                jSONObject4.put("color", checkColorValidityAndSanitize);
            }
            Boolean bool = this.hideTopBar;
            if (bool != null) {
                jSONObject4.put("hide_topbar", bool.booleanValue());
            }
            String str14 = this.backDropColor;
            if (str14 != null) {
                String checkColorValidityAndSanitize2 = checkColorValidityAndSanitize(str14);
                startsWith$default3 = StringsKt__StringsJVMKt.startsWith$default(checkColorValidityAndSanitize2, "#", false, 2, null);
                if (!startsWith$default3) {
                    JSONObject put3 = new JSONObject().put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, checkColorValidityAndSanitize2);
                    Intrinsics.checkNotNullExpressionValue(put3, "JSONObject().put(\"error\",sanitizedColor)");
                    return put3;
                }
                jSONObject4.put("backdrop_color", checkColorValidityAndSanitize2);
            }
            if (jSONObject4.length() > 0) {
                jSONObject.put("theme", jSONObject4);
            }
            Boolean bool2 = this.modalConfirmClose;
            if (bool2 != null) {
                boolean booleanValue = bool2.booleanValue();
                JSONObject jSONObject6 = new JSONObject();
                jSONObject6.put("confirm_close", booleanValue);
                jSONObject.put("modal", jSONObject6);
            }
            String str15 = this.subscriptionId;
            if (str15 != null) {
                jSONObject.put("subscription_id", str15);
            }
            Boolean bool3 = this.subscriptionCardChange;
            if (bool3 != null) {
                jSONObject.put("subscription_card_change", bool3.booleanValue());
            }
            Object obj = this.recurring;
            if (obj != null) {
                jSONObject.put("recurring", obj);
            }
            String str16 = this.callbackUrl;
            if (str16 != null) {
                jSONObject.put("callback_url", str16);
            }
            Boolean bool4 = this.redirect;
            if (bool4 != null) {
                jSONObject.put("redirect", bool4.booleanValue());
            }
            String str17 = this.customerId;
            if (str17 != null) {
                startsWith$default2 = StringsKt__StringsJVMKt.startsWith$default(str17, "cust_", false, 2, null);
                if (!startsWith$default2) {
                    JSONObject put4 = new JSONObject().put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Invalid Customer ID. It starts with cust_");
                    Intrinsics.checkNotNullExpressionValue(put4, "JSONObject().put(\"error\"…D. It starts with cust_\")");
                    return put4;
                }
                jSONObject.put("customer_id", str17);
            }
            Integer num = this.timeout;
            if (num != null) {
                jSONObject.put("timeout", num.intValue());
            }
            Boolean bool5 = this.rememberCustomer;
            if (bool5 != null) {
                jSONObject.put("remember_customer", bool5.booleanValue());
            }
            Boolean bool6 = this.retryEnabled;
            if (bool6 != null) {
                boolean booleanValue2 = bool6.booleanValue();
                JSONObject jSONObject7 = new JSONObject();
                jSONObject7.put("enabled", booleanValue2);
                Integer num2 = this.retryMaxCount;
                jSONObject7.put("max_count", num2 != null ? num2.intValue() : 4);
                jSONObject.put("retry", jSONObject7);
            }
            Boolean bool7 = this.readOnlyName;
            if (bool7 != null) {
                jSONObject2.put("name", bool7.booleanValue());
            }
            Boolean bool8 = this.readOnlyContact;
            if (bool8 != null) {
                jSONObject2.put("contact", bool8.booleanValue());
            }
            Boolean bool9 = this.readOnlyEmail;
            if (bool9 != null) {
                jSONObject2.put("email", bool9.booleanValue());
            }
            if (jSONObject2.length() > 0) {
                jSONObject.put("readonly", jSONObject2);
            }
            Boolean bool10 = this.allowRotation;
            if (bool10 != null) {
                jSONObject.put("allow_rotation", bool10.booleanValue());
            }
            Boolean bool11 = this.sendSmsHash;
            if (bool11 != null) {
                jSONObject.put("send_sms_hash", bool11.booleanValue());
            }
            return jSONObject;
        } catch (JSONException e) {
            JSONObject put5 = new JSONObject().put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, e.getLocalizedMessage());
            Intrinsics.checkNotNullExpressionValue(put5, "JSONObject().put(\"error\", e.localizedMessage)");
            return put5;
        }
    }

    public final Boolean getModalConfirmClose() {
        return this.modalConfirmClose;
    }

    public final String getName() {
        return this.name;
    }

    public final JSONObject getNotes() {
        return this.notes;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final String getPrefillBankName() {
        return this.prefillBankName;
    }

    public final String getPrefillCardCvv() {
        return this.prefillCardCvv;
    }

    public final String getPrefillCardExp() {
        return this.prefillCardExp;
    }

    public final String getPrefillCardNum() {
        return this.prefillCardNum;
    }

    public final String getPrefillContact() {
        return this.prefillContact;
    }

    public final String getPrefillEmail() {
        return this.prefillEmail;
    }

    public final String getPrefillMethod() {
        return this.prefillMethod;
    }

    public final String getPrefillName() {
        return this.prefillName;
    }

    public final String getPrefillVpa() {
        return this.prefillVpa;
    }

    public final Boolean getReadOnlyContact() {
        return this.readOnlyContact;
    }

    public final Boolean getReadOnlyEmail() {
        return this.readOnlyEmail;
    }

    public final Boolean getReadOnlyName() {
        return this.readOnlyName;
    }

    public final Object getRecurring() {
        return this.recurring;
    }

    public final Boolean getRedirect() {
        return this.redirect;
    }

    public final Boolean getRememberCustomer() {
        return this.rememberCustomer;
    }

    public final Boolean getRetryEnabled() {
        return this.retryEnabled;
    }

    public final Integer getRetryMaxCount() {
        return this.retryMaxCount;
    }

    public final Boolean getSendSmsHash() {
        return this.sendSmsHash;
    }

    public final Boolean getSubscriptionCardChange() {
        return this.subscriptionCardChange;
    }

    public final String getSubscriptionId() {
        return this.subscriptionId;
    }

    public final Integer getTimeout() {
        return this.timeout;
    }

    public final void setAllowRotation(Boolean bool) {
        this.allowRotation = bool;
    }

    public final void setAmount(int i) {
        this.amount = i;
    }

    public final void setBackDropColor(String str) {
        this.backDropColor = str;
    }

    public final void setCallbackUrl(String str) {
        this.callbackUrl = str;
    }

    public final void setColor(String str) {
        this.color = str;
    }

    public final void setCurrency(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.currency = str;
    }

    public final void setCustomerId(String str) {
        this.customerId = str;
    }

    public final void setDescription(String str) {
        this.description = str;
    }

    public final void setHideTopBar(Boolean bool) {
        this.hideTopBar = bool;
    }

    public final void setImage(String str) {
        this.image = str;
    }

    public final void setModalConfirmClose(Boolean bool) {
        this.modalConfirmClose = bool;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setNotes(JSONObject jSONObject) {
        this.notes = jSONObject;
    }

    public final void setOrderId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.orderId = str;
    }

    public final void setPrefillBankName(String str) {
        this.prefillBankName = str;
    }

    public final void setPrefillCardCvv(String str) {
        this.prefillCardCvv = str;
    }

    public final void setPrefillCardExp(String str) {
        this.prefillCardExp = str;
    }

    public final void setPrefillCardNum(String str) {
        this.prefillCardNum = str;
    }

    public final void setPrefillContact(String str) {
        this.prefillContact = str;
    }

    public final void setPrefillEmail(String str) {
        this.prefillEmail = str;
    }

    public final void setPrefillMethod(String str) {
        this.prefillMethod = str;
    }

    public final void setPrefillName(String str) {
        this.prefillName = str;
    }

    public final void setPrefillVpa(String str) {
        this.prefillVpa = str;
    }

    public final void setReadOnlyContact(Boolean bool) {
        this.readOnlyContact = bool;
    }

    public final void setReadOnlyEmail(Boolean bool) {
        this.readOnlyEmail = bool;
    }

    public final void setReadOnlyName(Boolean bool) {
        this.readOnlyName = bool;
    }

    public final void setRecurring(Object obj) {
        this.recurring = obj;
    }

    public final void setRedirect(Boolean bool) {
        this.redirect = bool;
    }

    public final void setRememberCustomer(Boolean bool) {
        this.rememberCustomer = bool;
    }

    public final void setRetryEnabled(Boolean bool) {
        this.retryEnabled = bool;
    }

    public final void setRetryMaxCount(Integer num) {
        this.retryMaxCount = num;
    }

    public final void setSendSmsHash(Boolean bool) {
        this.sendSmsHash = bool;
    }

    public final void setSubscriptionCardChange(Boolean bool) {
        this.subscriptionCardChange = bool;
    }

    public final void setSubscriptionId(String str) {
        this.subscriptionId = str;
    }

    public final void setTimeout(Integer num) {
        this.timeout = num;
    }
}
