package com.yandex.varioqub.flutter;

import android.content.Context;
import android.util.Log;
import com.yandex.varioqub.appmetricaadapter.AppMetricaAdapter;
import com.yandex.varioqub.config.FetchError;
import com.yandex.varioqub.config.OnFetchCompleteListener;
import com.yandex.varioqub.config.Varioqub;
import com.yandex.varioqub.flutter.pigeon.Pigeon;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class VarioqubImpl implements Pigeon.VarioqubPigeon {
    private static final long FETCH_REQUEST_ERROR = 2;
    private static final long FETCH_REQUEST_SUCCESS = 0;
    private static final long FETCH_REQUEST_THROTTLED = 1;
    public static final String TAG = "VarioqubFlutter";
    private final Context context;

    /* renamed from: com.yandex.varioqub.flutter.VarioqubImpl$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$yandex$varioqub$config$FetchError;

        static {
            int[] iArr = new int[FetchError.values().length];
            $SwitchMap$com$yandex$varioqub$config$FetchError = iArr;
            try {
                iArr[FetchError.REQUEST_THROTTLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$yandex$varioqub$config$FetchError[FetchError.EMPTY_RESULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$yandex$varioqub$config$FetchError[FetchError.IDENTIFIERS_NULL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$yandex$varioqub$config$FetchError[FetchError.RESPONSE_PARSE_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$yandex$varioqub$config$FetchError[FetchError.NETWORK_ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$yandex$varioqub$config$FetchError[FetchError.INTERNAL_ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public VarioqubImpl(Context context) {
        this.context = context;
    }

    @Override // com.yandex.varioqub.flutter.pigeon.Pigeon.VarioqubPigeon
    public void activateConfig() {
        Varioqub.activateConfig(null);
    }

    @Override // com.yandex.varioqub.flutter.pigeon.Pigeon.VarioqubPigeon
    public void clearClientFeatures() {
        Varioqub.clearClientFeatures();
    }

    @Override // com.yandex.varioqub.flutter.pigeon.Pigeon.VarioqubPigeon
    public void fetchConfig(final Pigeon.Result<Pigeon.FetchStatus> result) {
        Varioqub.fetchConfig(new OnFetchCompleteListener() { // from class: com.yandex.varioqub.flutter.VarioqubImpl.1
            @Override // com.yandex.varioqub.config.OnFetchCompleteListener
            public void onError(String str, FetchError fetchError) {
                long j2;
                switch (AnonymousClass2.$SwitchMap$com$yandex$varioqub$config$FetchError[fetchError.ordinal()]) {
                    case 1:
                        j2 = VarioqubImpl.FETCH_REQUEST_THROTTLED;
                        break;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        j2 = VarioqubImpl.FETCH_REQUEST_ERROR;
                        break;
                    default:
                        Log.e(VarioqubImpl.TAG, "Unknown fetch error: " + fetchError);
                        j2 = -1;
                        break;
                }
                result.success(new Pigeon.FetchStatus.Builder().setStatus(Long.valueOf(j2)).setError(fetchError.name()).build());
            }

            @Override // com.yandex.varioqub.config.OnFetchCompleteListener
            public void onSuccess() {
                result.success(new Pigeon.FetchStatus.Builder().setStatus(0L).build());
            }
        });
    }

    @Override // com.yandex.varioqub.flutter.pigeon.Pigeon.VarioqubPigeon
    public List<String> getAllKeys() {
        return new ArrayList(Varioqub.getAllKeys());
    }

    @Override // com.yandex.varioqub.flutter.pigeon.Pigeon.VarioqubPigeon
    public Boolean getBoolean(String str, Boolean bool) {
        return Boolean.valueOf(Varioqub.getBoolean(str, bool.booleanValue()));
    }

    @Override // com.yandex.varioqub.flutter.pigeon.Pigeon.VarioqubPigeon
    public Double getDouble(String str, Double d6) {
        return Double.valueOf(Varioqub.getDouble(str, d6.doubleValue()));
    }

    @Override // com.yandex.varioqub.flutter.pigeon.Pigeon.VarioqubPigeon
    public String getId() {
        return Varioqub.getId();
    }

    @Override // com.yandex.varioqub.flutter.pigeon.Pigeon.VarioqubPigeon
    public Long getInt(String str, Long l2) {
        return Long.valueOf(Varioqub.getLong(str, l2.longValue()));
    }

    @Override // com.yandex.varioqub.flutter.pigeon.Pigeon.VarioqubPigeon
    public String getString(String str, String str2) {
        return Varioqub.getString(str, str2);
    }

    @Override // com.yandex.varioqub.flutter.pigeon.Pigeon.VarioqubPigeon
    public void initVarioqubWithAppMetricaAdapter(Pigeon.VarioqubSettingsPigeon varioqubSettingsPigeon) {
        try {
            Varioqub.init(VarioqubSettingsConverter.convertSettingsFromPigeon(varioqubSettingsPigeon), new AppMetricaAdapter(this.context), this.context);
        } catch (Throwable th) {
            Log.e(TAG, "Something went wrong while parsing Varioqub Settings", th);
        }
    }

    @Override // com.yandex.varioqub.flutter.pigeon.Pigeon.VarioqubPigeon
    public void putClientFeature(String str, String str2) {
        Varioqub.putClientFeature(str, str2);
    }

    @Override // com.yandex.varioqub.flutter.pigeon.Pigeon.VarioqubPigeon
    public void setDefaults(Map<String, String> map) {
        Varioqub.setDefaults(map);
    }
}
