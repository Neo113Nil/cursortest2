package org.betup.services.offer;

import android.os.AsyncTask;
import com.google.gson.Gson;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.betup.services.storage.LocalPreferencesService;

/* loaded from: classes2.dex */
public class GDPRAreaChecker extends AsyncTask<Void, Void, Boolean> {
    private static final String CONSENT_URL = "https://adservice.google.com/getconfig/pubvendors";
    private final LocalPreferencesService localPreferencesService;

    public GDPRAreaChecker(LocalPreferencesService localPreferencesService) {
        this.localPreferencesService = localPreferencesService;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public Boolean doInBackground(Void... voids) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(CONSENT_URL).openConnection();
            if (httpURLConnection.getResponseCode() == 200) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new BufferedInputStream(httpURLConnection.getInputStream())));
                StringBuffer stringBuffer = new StringBuffer();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        stringBuffer.append(readLine);
                    } else {
                        return Boolean.valueOf(((ConsentResponse) new Gson().fromJson(stringBuffer.toString(), ConsentResponse.class)).isEu());
                    }
                }
            } else {
                return false;
            }
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public void onPostExecute(Boolean aBoolean) {
        super.onPostExecute((GDPRAreaChecker) aBoolean);
        this.localPreferencesService.saveIsEU(aBoolean.booleanValue());
    }
}
