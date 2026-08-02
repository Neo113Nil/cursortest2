package org.betup.model.remote.api.rest.base;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import okhttp3.ResponseBody;
import org.betup.R;
import org.betup.model.remote.api.ServiceGenerator;
import org.betup.utils.SnackbarHelper;

/* loaded from: classes2.dex */
public abstract class BaseInteractor<K> {
    protected Context context;
    public K mRetrofitService = (K) ServiceGenerator.getRestClient(getApi());

    public abstract Class<K> getApi();

    protected void setContext(Context context) {
        this.context = context;
    }

    protected Context getContext() {
        return this.context;
    }

    public void errorLog(Context context, ResponseBody error) {
        if (error != null) {
            String stringFromInputStream = getStringFromInputStream(error.byteStream());
            Log.e("errorLog", "failure, error: " + stringFromInputStream);
            SnackbarHelper.showShort(context, stringFromInputStream);
            if (checkConnection(context)) {
                return;
            }
            SnackbarHelper.showShort(context, R.string.conection_internet_failed);
        }
    }

    public boolean checkConnection(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    protected String getStringFromInputStream(InputStream is) {
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            try {
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(is));
                    while (true) {
                        try {
                            String readLine = bufferedReader2.readLine();
                            if (readLine == null) {
                                break;
                            }
                            sb.append(readLine);
                        } catch (IOException e) {
                            e = e;
                            bufferedReader = bufferedReader2;
                            e.printStackTrace();
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            return sb.toString();
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader = bufferedReader2;
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (IOException e2) {
                                    e2.printStackTrace();
                                }
                            }
                            throw th;
                        }
                    }
                    bufferedReader2.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e3) {
                e = e3;
            }
        } catch (IOException e4) {
            e4.printStackTrace();
        }
        return sb.toString();
    }
}
