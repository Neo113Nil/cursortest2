package com.google.android.gms.fido;

import com.google.android.gms.common.C0854d;

/* loaded from: classes4.dex */
public final class b {
    public static final C0854d a;
    public static final C0854d b;
    public static final C0854d c;
    public static final C0854d d;

    static {
        new C0854d("cancel_target_direct_transfer", 1L);
        new C0854d("delete_credential", 1L);
        new C0854d("delete_device_public_key", 1L);
        new C0854d("get_or_generate_device_public_key", 1L);
        new C0854d("get_passkeys", 1L);
        new C0854d("update_passkey", 1L);
        a = new C0854d("is_user_verifying_platform_authenticator_available_for_credential", 1L);
        b = new C0854d("is_user_verifying_platform_authenticator_available", 1L);
        c = new C0854d("privileged_api_list_credentials", 2L);
        new C0854d("start_target_direct_transfer", 1L);
        new C0854d("first_party_api_get_link_info", 1L);
        new C0854d("zero_party_api_register", 3L);
        new C0854d("zero_party_api_sign", 3L);
        new C0854d("zero_party_api_list_discoverable_credentials", 2L);
        new C0854d("zero_party_api_authenticate_passkey", 3L);
        new C0854d("zero_party_api_register_passkey", 1L);
        new C0854d("zero_party_api_register_passkey_with_sync_account", 1L);
        new C0854d("zero_party_api_get_hybrid_client_registration_pending_intent", 1L);
        new C0854d("zero_party_api_get_hybrid_client_sign_pending_intent", 1L);
        d = new C0854d("get_browser_hybrid_client_sign_pending_intent", 1L);
        new C0854d("get_browser_hybrid_client_registration_pending_intent", 1L);
        new C0854d("privileged_authenticate_passkey", 2L);
        new C0854d("privileged_register_passkey_with_sync_account", 1L);
        new C0854d("zero_party_api_get_privileged_hybrid_client_registration_pending_intent", 1L);
        new C0854d("zero_party_api_get_privileged_hybrid_client_sign_pending_intent", 1L);
        new C0854d("zero_party_api_get_fido_security_key_only_sign_pending_intent", 1L);
        new C0854d("zero_party_api_get_fido_security_key_only_registration_pending_intent", 1L);
        new C0854d("zero_party_api_get_privileged_fido_security_key_only_sign_pending_intent", 1L);
        new C0854d("zero_party_api_get_privileged_fido_security_key_only_registration_pending_intent", 1L);
    }
}
