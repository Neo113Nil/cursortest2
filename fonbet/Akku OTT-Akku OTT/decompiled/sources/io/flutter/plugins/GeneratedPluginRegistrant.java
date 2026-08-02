package io.flutter.plugins;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.aaassseee.screen_brightness_android.ScreenBrightnessAndroidPlugin;
import com.alexmercerind.media_kit_libs_android_video.MediaKitLibsAndroidVideoPlugin;
import com.alexmercerind.media_kit_video.MediaKitVideoPlugin;
import com.amplitude.amplitude_flutter.AmplitudeFlutterPlugin;
import com.baseflow.permissionhandler.c;
import com.bbflight.background_downloader.BDPlugin;
import com.csdcorp.speech_to_text.SpeechToTextPlugin;
import com.dexterous.flutterlocalnotifications.FlutterLocalNotificationsPlugin;
import com.example.nb_utils.NbUtilsPlugin;
import com.github.droibit.flutter.plugins.customtabs.CustomTabsPlugin;
import com.kurenai7968.volume_controller.VolumeControllerPlugin;
import com.llfbandit.app_links.a;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.prongbang.screen_protector.ScreenProtectorPlugin;
import com.razorpay.razorpay_flutter.RazorpayFlutterPlugin;
import com.sabpaisa.sabpaisa_flutter.SabPaisaFlutterPlugin;
import com.tekartik.sqflite.u;
import de.lschmierer.android_play_install_referrer.AndroidPlayInstallReferrerPlugin;
import dev.fluttercommunity.plus.connectivity.d;
import dev.fluttercommunity.plus.device_info.DeviceInfoPlusPlugin;
import dev.fluttercommunity.plus.packageinfo.PackageInfoPlugin;
import dev.fluttercommunity.plus.share.SharePlusPlugin;
import dev.fluttercommunity.plus.wakelock.WakelockPlusPlugin;
import dev.fluttercommunity.workmanager.WorkmanagerPlugin;
import es.antonborri.home_widget.HomeWidgetPlugin;
import fman.ge.smart_auth.SmartAuthPlugin;
import id.oddbit.flutter.facebook_app_events.FacebookAppEventsPlugin;
import io.flutter.Log;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugins.firebase.analytics.FlutterFirebaseAnalyticsPlugin;
import io.flutter.plugins.firebase.auth.FlutterFirebaseAuthPlugin;
import io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin;
import io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingPlugin;
import io.flutter.plugins.flutter_plugin_android_lifecycle.FlutterAndroidLifecyclePlugin;
import io.flutter.plugins.googlesignin.GoogleSignInPlugin;
import io.flutter.plugins.imagepicker.ImagePickerPlugin;
import io.flutter.plugins.pathprovider.PathProviderPlugin;
import io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin;
import io.flutter.plugins.urllauncher.UrlLauncherPlugin;
import io.flutter.plugins.webviewflutter.WebViewFlutterPlugin;
import io.github.ponnamkarthik.toast.fluttertoast.FlutterToastPlugin;
import io.objectbox.objectbox_flutter_libs.ObjectboxFlutterLibsPlugin;
import net.nfet.flutter.printing.i;
import uz.shs.better_player_plus.BetterPlayerPlugin;

@Keep
/* loaded from: classes3.dex */
public final class GeneratedPluginRegistrant {
    private static final String TAG = "GeneratedPluginRegistrant";

    public static void registerWith(@NonNull FlutterEngine flutterEngine) {
        try {
            flutterEngine.getPlugins().add(new AmplitudeFlutterPlugin());
        } catch (Exception e) {
            Log.e(TAG, "Error registering plugin amplitude_flutter, com.amplitude.amplitude_flutter.AmplitudeFlutterPlugin", e);
        }
        try {
            flutterEngine.getPlugins().add(new AndroidPlayInstallReferrerPlugin());
        } catch (Exception e2) {
            Log.e(TAG, "Error registering plugin android_play_install_referrer, de.lschmierer.android_play_install_referrer.AndroidPlayInstallReferrerPlugin", e2);
        }
        try {
            flutterEngine.getPlugins().add(new a());
        } catch (Exception e3) {
            Log.e(TAG, "Error registering plugin app_links, com.llfbandit.app_links.AppLinksPlugin", e3);
        }
        try {
            flutterEngine.getPlugins().add(new BDPlugin());
        } catch (Exception e4) {
            Log.e(TAG, "Error registering plugin background_downloader, com.bbflight.background_downloader.BDPlugin", e4);
        }
        try {
            flutterEngine.getPlugins().add(new BetterPlayerPlugin());
        } catch (Exception e5) {
            Log.e(TAG, "Error registering plugin better_player_plus, uz.shs.better_player_plus.BetterPlayerPlugin", e5);
        }
        try {
            flutterEngine.getPlugins().add(new d());
        } catch (Exception e6) {
            Log.e(TAG, "Error registering plugin connectivity_plus, dev.fluttercommunity.plus.connectivity.ConnectivityPlugin", e6);
        }
        try {
            flutterEngine.getPlugins().add(new DeviceInfoPlusPlugin());
        } catch (Exception e7) {
            Log.e(TAG, "Error registering plugin device_info_plus, dev.fluttercommunity.plus.device_info.DeviceInfoPlusPlugin", e7);
        }
        try {
            flutterEngine.getPlugins().add(new FacebookAppEventsPlugin());
        } catch (Exception e8) {
            Log.e(TAG, "Error registering plugin facebook_app_events, id.oddbit.flutter.facebook_app_events.FacebookAppEventsPlugin", e8);
        }
        try {
            flutterEngine.getPlugins().add(new FlutterFirebaseAnalyticsPlugin());
        } catch (Exception e9) {
            Log.e(TAG, "Error registering plugin firebase_analytics, io.flutter.plugins.firebase.analytics.FlutterFirebaseAnalyticsPlugin", e9);
        }
        try {
            flutterEngine.getPlugins().add(new FlutterFirebaseAuthPlugin());
        } catch (Exception e10) {
            Log.e(TAG, "Error registering plugin firebase_auth, io.flutter.plugins.firebase.auth.FlutterFirebaseAuthPlugin", e10);
        }
        try {
            flutterEngine.getPlugins().add(new FlutterFirebaseCorePlugin());
        } catch (Exception e11) {
            Log.e(TAG, "Error registering plugin firebase_core, io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin", e11);
        }
        try {
            flutterEngine.getPlugins().add(new FlutterFirebaseCrashlyticsPlugin());
        } catch (Exception e12) {
            Log.e(TAG, "Error registering plugin firebase_crashlytics, io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin", e12);
        }
        try {
            flutterEngine.getPlugins().add(new FlutterFirebaseMessagingPlugin());
        } catch (Exception e13) {
            Log.e(TAG, "Error registering plugin firebase_messaging, io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingPlugin", e13);
        }
        try {
            flutterEngine.getPlugins().add(new CustomTabsPlugin());
        } catch (Exception e14) {
            Log.e(TAG, "Error registering plugin flutter_custom_tabs_android, com.github.droibit.flutter.plugins.customtabs.CustomTabsPlugin", e14);
        }
        try {
            flutterEngine.getPlugins().add(new com.odehbros.flutter_file_downloader.a());
        } catch (Exception e15) {
            Log.e(TAG, "Error registering plugin flutter_file_downloader, com.odehbros.flutter_file_downloader.FlutterFileDownloaderPlugin", e15);
        }
        try {
            flutterEngine.getPlugins().add(new InAppWebViewFlutterPlugin());
        } catch (Exception e16) {
            Log.e(TAG, "Error registering plugin flutter_inappwebview_android, com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin", e16);
        }
        try {
            flutterEngine.getPlugins().add(new FlutterLocalNotificationsPlugin());
        } catch (Exception e17) {
            Log.e(TAG, "Error registering plugin flutter_local_notifications, com.dexterous.flutterlocalnotifications.FlutterLocalNotificationsPlugin", e17);
        }
        try {
            flutterEngine.getPlugins().add(new FlutterAndroidLifecyclePlugin());
        } catch (Exception e18) {
            Log.e(TAG, "Error registering plugin flutter_plugin_android_lifecycle, io.flutter.plugins.flutter_plugin_android_lifecycle.FlutterAndroidLifecyclePlugin", e18);
        }
        try {
            flutterEngine.getPlugins().add(new FlutterToastPlugin());
        } catch (Exception e19) {
            Log.e(TAG, "Error registering plugin fluttertoast, io.github.ponnamkarthik.toast.fluttertoast.FlutterToastPlugin", e19);
        }
        try {
            flutterEngine.getPlugins().add(new GoogleSignInPlugin());
        } catch (Exception e20) {
            Log.e(TAG, "Error registering plugin google_sign_in_android, io.flutter.plugins.googlesignin.GoogleSignInPlugin", e20);
        }
        try {
            flutterEngine.getPlugins().add(new HomeWidgetPlugin());
        } catch (Exception e21) {
            Log.e(TAG, "Error registering plugin home_widget, es.antonborri.home_widget.HomeWidgetPlugin", e21);
        }
        try {
            flutterEngine.getPlugins().add(new ImagePickerPlugin());
        } catch (Exception e22) {
            Log.e(TAG, "Error registering plugin image_picker_android, io.flutter.plugins.imagepicker.ImagePickerPlugin", e22);
        }
        try {
            flutterEngine.getPlugins().add(new MediaKitLibsAndroidVideoPlugin());
        } catch (Exception e23) {
            Log.e(TAG, "Error registering plugin media_kit_libs_android_video, com.alexmercerind.media_kit_libs_android_video.MediaKitLibsAndroidVideoPlugin", e23);
        }
        try {
            flutterEngine.getPlugins().add(new MediaKitVideoPlugin());
        } catch (Exception e24) {
            Log.e(TAG, "Error registering plugin media_kit_video, com.alexmercerind.media_kit_video.MediaKitVideoPlugin", e24);
        }
        try {
            flutterEngine.getPlugins().add(new NbUtilsPlugin());
        } catch (Exception e25) {
            Log.e(TAG, "Error registering plugin nb_utils, com.example.nb_utils.NbUtilsPlugin", e25);
        }
        try {
            flutterEngine.getPlugins().add(new ObjectboxFlutterLibsPlugin());
        } catch (Exception e26) {
            Log.e(TAG, "Error registering plugin objectbox_flutter_libs, io.objectbox.objectbox_flutter_libs.ObjectboxFlutterLibsPlugin", e26);
        }
        try {
            flutterEngine.getPlugins().add(new com.crazecoder.openfile.a());
        } catch (Exception e27) {
            Log.e(TAG, "Error registering plugin open_file_android, com.crazecoder.openfile.OpenFilePlugin", e27);
        }
        try {
            flutterEngine.getPlugins().add(new PackageInfoPlugin());
        } catch (Exception e28) {
            Log.e(TAG, "Error registering plugin package_info_plus, dev.fluttercommunity.plus.packageinfo.PackageInfoPlugin", e28);
        }
        try {
            flutterEngine.getPlugins().add(new PathProviderPlugin());
        } catch (Exception e29) {
            Log.e(TAG, "Error registering plugin path_provider_android, io.flutter.plugins.pathprovider.PathProviderPlugin", e29);
        }
        try {
            flutterEngine.getPlugins().add(new c());
        } catch (Exception e30) {
            Log.e(TAG, "Error registering plugin permission_handler_android, com.baseflow.permissionhandler.PermissionHandlerPlugin", e30);
        }
        try {
            flutterEngine.getPlugins().add(new i());
        } catch (Exception e31) {
            Log.e(TAG, "Error registering plugin printing, net.nfet.flutter.printing.PrintingPlugin", e31);
        }
        try {
            flutterEngine.getPlugins().add(new RazorpayFlutterPlugin());
        } catch (Exception e32) {
            Log.e(TAG, "Error registering plugin razorpay_flutter, com.razorpay.razorpay_flutter.RazorpayFlutterPlugin", e32);
        }
        try {
            flutterEngine.getPlugins().add(new SabPaisaFlutterPlugin());
        } catch (Exception e33) {
            Log.e(TAG, "Error registering plugin sabpaisa_flutter, com.sabpaisa.sabpaisa_flutter.SabPaisaFlutterPlugin", e33);
        }
        try {
            flutterEngine.getPlugins().add(new ScreenBrightnessAndroidPlugin());
        } catch (Exception e34) {
            Log.e(TAG, "Error registering plugin screen_brightness_android, com.aaassseee.screen_brightness_android.ScreenBrightnessAndroidPlugin", e34);
        }
        try {
            flutterEngine.getPlugins().add(new ScreenProtectorPlugin());
        } catch (Exception e35) {
            Log.e(TAG, "Error registering plugin screen_protector, com.prongbang.screen_protector.ScreenProtectorPlugin", e35);
        }
        try {
            flutterEngine.getPlugins().add(new SharePlusPlugin());
        } catch (Exception e36) {
            Log.e(TAG, "Error registering plugin share_plus, dev.fluttercommunity.plus.share.SharePlusPlugin", e36);
        }
        try {
            flutterEngine.getPlugins().add(new SharedPreferencesPlugin());
        } catch (Exception e37) {
            Log.e(TAG, "Error registering plugin shared_preferences_android, io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin", e37);
        }
        try {
            flutterEngine.getPlugins().add(new SmartAuthPlugin());
        } catch (Exception e38) {
            Log.e(TAG, "Error registering plugin smart_auth, fman.ge.smart_auth.SmartAuthPlugin", e38);
        }
        try {
            flutterEngine.getPlugins().add(new SpeechToTextPlugin());
        } catch (Exception e39) {
            Log.e(TAG, "Error registering plugin speech_to_text, com.csdcorp.speech_to_text.SpeechToTextPlugin", e39);
        }
        try {
            flutterEngine.getPlugins().add(new u());
        } catch (Exception e40) {
            Log.e(TAG, "Error registering plugin sqflite_android, com.tekartik.sqflite.SqflitePlugin", e40);
        }
        try {
            flutterEngine.getPlugins().add(new UrlLauncherPlugin());
        } catch (Exception e41) {
            Log.e(TAG, "Error registering plugin url_launcher_android, io.flutter.plugins.urllauncher.UrlLauncherPlugin", e41);
        }
        try {
            flutterEngine.getPlugins().add(new VolumeControllerPlugin());
        } catch (Exception e42) {
            Log.e(TAG, "Error registering plugin volume_controller, com.kurenai7968.volume_controller.VolumeControllerPlugin", e42);
        }
        try {
            flutterEngine.getPlugins().add(new WakelockPlusPlugin());
        } catch (Exception e43) {
            Log.e(TAG, "Error registering plugin wakelock_plus, dev.fluttercommunity.plus.wakelock.WakelockPlusPlugin", e43);
        }
        try {
            flutterEngine.getPlugins().add(new WebViewFlutterPlugin());
        } catch (Exception e44) {
            Log.e(TAG, "Error registering plugin webview_flutter_android, io.flutter.plugins.webviewflutter.WebViewFlutterPlugin", e44);
        }
        try {
            flutterEngine.getPlugins().add(new WorkmanagerPlugin());
        } catch (Exception e45) {
            Log.e(TAG, "Error registering plugin workmanager_android, dev.fluttercommunity.workmanager.WorkmanagerPlugin", e45);
        }
    }
}
