package org.betup.ui.dialogs;

import android.content.Context;
import android.os.Bundle;
import butterknife.ButterKnife;
import butterknife.OnClick;
import javax.inject.Inject;
import org.betup.BetUpApp;
import org.betup.R;
import org.betup.services.offer.ConsentUserConfirmationListener;
import org.betup.services.storage.LocalPreferencesService;

/* loaded from: classes2.dex */
public class DialogConsent extends BaseDialog {
    private final ConsentUserConfirmationListener consentUserConfirmationListener;

    @Inject
    LocalPreferencesService localPreferencesService;

    @Override // android.app.Dialog
    public void onBackPressed() {
    }

    public DialogConsent(Context context, ConsentUserConfirmationListener consentUserConfirmationListener) {
        super(R.layout.dialog_consent, context);
        this.consentUserConfirmationListener = consentUserConfirmationListener;
    }

    @Override // org.betup.ui.dialogs.BaseDialog, android.app.Dialog
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((BetUpApp) getContext().getApplicationContext()).getComponent().inject(this);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.yes})
    public void onYesClick() {
        this.localPreferencesService.saveUserConsentAsked(true);
        this.localPreferencesService.saveUserContent(true);
        dismiss();
        this.consentUserConfirmationListener.onAccept();
    }

    @OnClick({R.id.no})
    public void onNoClick() {
        this.localPreferencesService.saveUserConsentAsked(true);
        this.localPreferencesService.saveUserContent(false);
        dismiss();
        this.consentUserConfirmationListener.onReject();
    }
}
