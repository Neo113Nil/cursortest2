package com.google.maps.android.compose;

@kotlin.Metadata(d1 = {"\u0000x\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u001a#\u0010\u0000\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a\u0017\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\b\u001aý\u0001\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00102\b\b\u0002\u0010\u0017\u001a\u00020\u000e2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00122\b\b\u0002\u0010\u001d\u001a\u00020\u000e2\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00120\u001f2\u0014\b\u0002\u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\n0\u001f2\u0014\b\u0002\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\n0\u001f2\u0014\b\u0002\u0010#\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\n0\u001fH\u0007¢\u0006\u0004\b$\u0010%\u001a\u009d\u0002\u0010&\u001a\u00020\n2\u0012\u0010'\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001a0(\"\u00020\u001a2\b\b\u0002\u0010\u000b\u001a\u00020\u00012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u00102\b\b\u0002\u0010\u0017\u001a\u00020\u000e2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00122\b\b\u0002\u0010\u001d\u001a\u00020\u000e2\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00120\u001f2\u0014\b\u0002\u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\n0\u001f2\u0014\b\u0002\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\n0\u001f2\u0014\b\u0002\u0010#\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\n0\u001f2\u0016\u0010)\u001a\u0012\u0012\u0004\u0012\u00020\n0*¢\u0006\u0002\b+¢\u0006\u0002\b,H\u0007¢\u0006\u0004\b-\u0010.\u001a\u009f\u0002\u0010/\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00102\b\b\u0002\u0010\u0017\u001a\u00020\u000e2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00122\b\b\u0002\u0010\u001d\u001a\u00020\u000e2\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00120\u001f2\u0014\b\u0002\u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\n0\u001f2\u0014\b\u0002\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\n0\u001f2\u0014\b\u0002\u0010#\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\n0\u001f2 \b\u0002\u0010)\u001a\u001a\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\n\u0018\u00010\u001f¢\u0006\u0002\b+¢\u0006\u0002\b,H\u0007¢\u0006\u0004\b0\u00101\u001a³\u0002\u00102\u001a\u00020\n2\u0012\u0010'\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001a0(\"\u00020\u001a2\b\b\u0002\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u00102\b\b\u0002\u0010\u0017\u001a\u00020\u000e2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00122\b\b\u0002\u0010\u001d\u001a\u00020\u000e2\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00120\u001f2\u0014\b\u0002\u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\n0\u001f2\u0014\b\u0002\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\n0\u001f2\u0014\b\u0002\u0010#\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\n0\u001f2 \b\u0002\u00103\u001a\u001a\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\n\u0018\u00010\u001f¢\u0006\u0002\b+¢\u0006\u0002\b,2\u0016\u0010)\u001a\u0012\u0012\u0004\u0012\u00020\n0*¢\u0006\u0002\b+¢\u0006\u0002\b,H\u0007¢\u0006\u0004\b4\u00105\u001a\u0093\u0002\u00106\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00102\b\b\u0002\u0010\u0017\u001a\u00020\u000e2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00122\b\b\u0002\u0010\u001d\u001a\u00020\u000e2\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00120\u001f2\u0014\b\u0002\u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\n0\u001f2\u0014\b\u0002\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\n0\u001f2\u0014\b\u0002\u0010#\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\n0\u001f2 \b\u0002\u0010)\u001a\u001a\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\n\u0018\u00010\u001f¢\u0006\u0002\b+¢\u0006\u0002\b,H\u0007¢\u0006\u0004\b7\u00108\u001a·\u0002\u00109\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00102\b\b\u0002\u0010\u0017\u001a\u00020\u000e2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00122\b\b\u0002\u0010\u001d\u001a\u00020\u000e2\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00120\u001f2\u0014\b\u0002\u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\n0\u001f2\u0014\b\u0002\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\n0\u001f2\u0014\b\u0002\u0010#\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\n0\u001f2\u001b\b\u0002\u0010:\u001a\u0015\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\n\u0018\u00010\u001f¢\u0006\u0002\b,2\u001b\b\u0002\u00103\u001a\u0015\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\n\u0018\u00010\u001f¢\u0006\u0002\b,H\u0003¢\u0006\u0004\b;\u0010<\u001a\u009f\u0002\u0010=\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u00102\b\b\u0002\u0010\u0017\u001a\u00020\u000e2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00122\b\b\u0002\u0010\u001d\u001a\u00020\u000e2\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00120\u001f2\u0014\b\u0002\u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\n0\u001f2\u0014\b\u0002\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\n0\u001f2\u0014\b\u0002\u0010#\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\n0\u001f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010>\u001a\u0004\u0018\u00010?2\n\b\u0002\u0010@\u001a\u0004\u0018\u00010A2\b\b\u0002\u0010B\u001a\u00020CH\u0007¢\u0006\u0004\bD\u0010E\u001aÙ\u0002\u0010F\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u00102\b\b\u0002\u0010\u0017\u001a\u00020\u000e2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00122\b\b\u0002\u0010\u001d\u001a\u00020\u000e2\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00120\u001f2\u0014\b\u0002\u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\n0\u001f2\u0014\b\u0002\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\n0\u001f2\u0014\b\u0002\u0010#\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\n0\u001f2\u001b\b\u0002\u0010:\u001a\u0015\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\n\u0018\u00010\u001f¢\u0006\u0002\b,2\u001b\b\u0002\u00103\u001a\u0015\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\n\u0018\u00010\u001f¢\u0006\u0002\b,2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010>\u001a\u0004\u0018\u00010?2\n\b\u0002\u0010@\u001a\u0004\u0018\u00010A2\b\b\u0002\u0010B\u001a\u00020CH\u0003¢\u0006\u0004\bG\u0010H¨\u0006I"}, d2 = {"rememberMarkerState", "Lcom/google/maps/android/compose/MarkerState;", "key", "", com.daon.sdk.face.license.License.FEATURE_POSITION, "Lcom/google/android/gms/maps/model/LatLng;", "(Ljava/lang/String;Lcom/google/android/gms/maps/model/LatLng;Landroidx/compose/runtime/Composer;II)Lcom/google/maps/android/compose/MarkerState;", "rememberUpdatedMarkerState", "(Lcom/google/android/gms/maps/model/LatLng;Landroidx/compose/runtime/Composer;II)Lcom/google/maps/android/compose/MarkerState;", "Marker", "", "state", "contentDescription", "alpha", "", io.ktor.http.LinkHeader.Parameters.Anchor, "Landroidx/compose/ui/geometry/Offset;", "draggable", "", "flat", "icon", "Lcom/google/android/gms/maps/model/BitmapDescriptor;", "infoWindowAnchor", androidx.constraintlayout.motion.widget.Key.ROTATION, "snippet", "tag", "", "title", "visible", "zIndex", "onClick", "Lkotlin/Function1;", "Lcom/google/android/gms/maps/model/Marker;", "onInfoWindowClick", "onInfoWindowClose", "onInfoWindowLongClick", "Marker-qld6geY", "(Lcom/google/maps/android/compose/MarkerState;Ljava/lang/String;FJZZLcom/google/android/gms/maps/model/BitmapDescriptor;JFLjava/lang/String;Ljava/lang/Object;Ljava/lang/String;ZFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "MarkerComposable", org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME, "", "content", "Lkotlin/Function0;", "Landroidx/compose/ui/UiComposable;", "Landroidx/compose/runtime/Composable;", "MarkerComposable-Khg_OnI", "([Ljava/lang/Object;Lcom/google/maps/android/compose/MarkerState;Ljava/lang/String;FJZZJFLjava/lang/String;Ljava/lang/Object;Ljava/lang/String;ZFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "MarkerInfoWindow", "MarkerInfoWindow-jYtn1XM", "(Lcom/google/maps/android/compose/MarkerState;FJZLjava/lang/String;ZLcom/google/android/gms/maps/model/BitmapDescriptor;JFLjava/lang/String;Ljava/lang/Object;Ljava/lang/String;ZFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "MarkerInfoWindowComposable", "infoContent", "MarkerInfoWindowComposable-LZmgDss", "([Ljava/lang/Object;Lcom/google/maps/android/compose/MarkerState;FJZZJFLjava/lang/String;Ljava/lang/Object;Ljava/lang/String;ZFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "MarkerInfoWindowContent", "MarkerInfoWindowContent-dVEpkwM", "(Lcom/google/maps/android/compose/MarkerState;FJZZLcom/google/android/gms/maps/model/BitmapDescriptor;JFLjava/lang/String;Ljava/lang/Object;Ljava/lang/String;ZFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "MarkerImpl", "infoWindow", "MarkerImpl-khPtz74", "(Lcom/google/maps/android/compose/MarkerState;Ljava/lang/String;FJZZLcom/google/android/gms/maps/model/BitmapDescriptor;JFLjava/lang/String;Ljava/lang/Object;Ljava/lang/String;ZFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "AdvancedMarker", "pinConfig", "Lcom/google/android/gms/maps/model/PinConfig;", "iconView", "Landroid/view/View;", "collisionBehavior", "", "AdvancedMarker-3D-2zJA", "(Lcom/google/maps/android/compose/MarkerState;Ljava/lang/String;FJZZJFLjava/lang/String;Ljava/lang/Object;Ljava/lang/String;ZFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/google/android/gms/maps/model/BitmapDescriptor;Lcom/google/android/gms/maps/model/PinConfig;Landroid/view/View;ILandroidx/compose/runtime/Composer;IIII)V", "AdvancedMarkerImpl", "AdvancedMarkerImpl-myiKm0s", "(Lcom/google/maps/android/compose/MarkerState;Ljava/lang/String;FJZZJFLjava/lang/String;Ljava/lang/Object;Ljava/lang/String;ZFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lcom/google/android/gms/maps/model/BitmapDescriptor;Lcom/google/android/gms/maps/model/PinConfig;Landroid/view/View;ILandroidx/compose/runtime/Composer;IIII)V", "maps-compose_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MarkerKt {
    @kotlin.Deprecated(message = "Use 'rememberUpdatedMarkerState' instead - It may be confusing to think that the state is automatically updated as the position changes, so it will be changed or removed.", replaceWith = @kotlin.ReplaceWith(expression = "\n            val markerState = rememberSaveable(key = key, saver = MarkerState.Saver) {\n                MarkerState(position)\n            }\n        ", imports = {}))
    public static final com.google.maps.android.compose.MarkerState rememberMarkerState(java.lang.String str, final com.google.android.gms.maps.model.LatLng latLng, androidx.compose.runtime.Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        java.lang.String str2 = str;
        if ((i2 & 2) != 0) {
            latLng = new com.google.android.gms.maps.model.LatLng(0.0d, 0.0d);
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-665345564, i, -1, "com.google.maps.android.compose.rememberMarkerState (Marker.kt:206)");
        }
        androidx.compose.runtime.saveable.Saver<com.google.maps.android.compose.MarkerState, com.google.android.gms.maps.model.LatLng> saver = com.google.maps.android.compose.MarkerState.INSTANCE.getSaver();
        java.lang.Object[] objArr = new java.lang.Object[0];
        boolean z = (((i & 112) ^ 48) > 32 && composer.changed(latLng)) || (i & 48) == 32;
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda81
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    com.google.maps.android.compose.MarkerState rememberMarkerState$lambda$0$0;
                    rememberMarkerState$lambda$0$0 = com.google.maps.android.compose.MarkerKt.rememberMarkerState$lambda$0$0(com.google.android.gms.maps.model.LatLng.this);
                    return rememberMarkerState$lambda$0$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        com.google.maps.android.compose.MarkerState markerState = (com.google.maps.android.compose.MarkerState) androidx.compose.runtime.saveable.RememberSaveableKt.m5464rememberSaveable(objArr, (androidx.compose.runtime.saveable.Saver) saver, str2, (kotlin.jvm.functions.Function0) rememberedValue, composer, (i << 6) & 896, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return markerState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.google.maps.android.compose.MarkerState rememberMarkerState$lambda$0$0(com.google.android.gms.maps.model.LatLng latLng) {
        return com.google.maps.android.compose.MarkerState.INSTANCE.invoke(latLng);
    }

    public static final com.google.maps.android.compose.MarkerState rememberUpdatedMarkerState(com.google.android.gms.maps.model.LatLng latLng, androidx.compose.runtime.Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            latLng = new com.google.android.gms.maps.model.LatLng(0.0d, 0.0d);
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1974742690, i, -1, "com.google.maps.android.compose.rememberUpdatedMarkerState (Marker.kt:219)");
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = com.google.maps.android.compose.MarkerState.INSTANCE.invoke(latLng);
            composer.updateRememberedValue(rememberedValue);
        }
        com.google.maps.android.compose.MarkerState markerState = (com.google.maps.android.compose.MarkerState) rememberedValue;
        markerState.setPosition(latLng);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return markerState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Marker_qld6geY$lambda$1$0(com.google.android.gms.maps.model.Marker marker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(marker, "");
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Marker_qld6geY$lambda$2$0(com.google.android.gms.maps.model.Marker marker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(marker, "");
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Marker_qld6geY$lambda$3$0(com.google.android.gms.maps.model.Marker marker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(marker, "");
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* renamed from: Marker-qld6geY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m10526Markerqld6geY(com.google.maps.android.compose.MarkerState markerState, java.lang.String str, float f, long j, boolean z, boolean z2, com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptor, long j2, float f2, java.lang.String str2, java.lang.Object obj, java.lang.String str3, boolean z3, float f3, kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, java.lang.Boolean> function1, kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function12, kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function13, kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function14, androidx.compose.runtime.Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        androidx.compose.runtime.Composer composer2;
        final com.google.maps.android.compose.MarkerState markerState2;
        final java.lang.String str4;
        final float f4;
        final long j3;
        final boolean z4;
        final boolean z5;
        final com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptor2;
        final long j4;
        final float f5;
        final java.lang.String str5;
        final java.lang.Object obj2;
        final java.lang.String str6;
        boolean z6;
        final float f6;
        final kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, java.lang.Boolean> function15;
        final kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function16;
        final kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function17;
        final kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function18;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        com.google.maps.android.compose.MarkerState markerState3;
        float f7;
        boolean z7;
        com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptor3;
        int i24;
        java.lang.String str7;
        long j5;
        long j6;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, java.lang.Boolean> function19;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function110;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function111;
        float f8;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function112;
        int i25;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function113;
        boolean z8;
        float f9;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, java.lang.Boolean> function114;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function115;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function116;
        java.lang.String str8;
        float f10;
        java.lang.String str9;
        java.lang.Object obj3;
        long j7;
        boolean z9;
        long j8;
        java.lang.Object obj4;
        int i26;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(122922304);
        if ((i & 6) == 0) {
            if ((i3 & 1) == 0 && startRestartGroup.changed(markerState)) {
                i26 = 4;
                i4 = i26 | i;
            }
            i26 = 2;
            i4 = i26 | i;
        } else {
            i4 = i;
        }
        int i27 = i3 & 2;
        if (i27 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= startRestartGroup.changed(str) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i & 384) == 0) {
                i4 |= startRestartGroup.changed(f) ? 256 : 128;
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else if ((i & 3072) == 0) {
                    i4 |= startRestartGroup.changed(j) ? 2048 : 1024;
                }
                i7 = i3 & 16;
                if (i7 != 0) {
                    i4 |= 24576;
                } else if ((i & 24576) == 0) {
                    i4 |= startRestartGroup.changed(z) ? 16384 : 8192;
                    i8 = i3 & 32;
                    if (i8 == 0) {
                        i4 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i4 |= startRestartGroup.changed(z2) ? 131072 : 65536;
                    }
                    i9 = i3 & 64;
                    if (i9 == 0) {
                        i4 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i4 |= startRestartGroup.changed(bitmapDescriptor) ? 1048576 : 524288;
                    }
                    i10 = i3 & 128;
                    if (i10 == 0) {
                        i4 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i4 |= startRestartGroup.changed(j2) ? 8388608 : 4194304;
                    }
                    i11 = i3 & 256;
                    if (i11 == 0) {
                        i4 |= 100663296;
                    } else if ((100663296 & i) == 0) {
                        i4 |= startRestartGroup.changed(f2) ? 67108864 : 33554432;
                        i12 = i3 & 512;
                        if (i12 != 0) {
                            i4 |= 805306368;
                        } else if ((i & 805306368) == 0) {
                            i4 |= startRestartGroup.changed(str2) ? 536870912 : 268435456;
                        }
                        i13 = i3 & 1024;
                        if (i13 != 0) {
                            i14 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            i14 = i2 | (startRestartGroup.changedInstance(obj) ? 4 : 2);
                        } else {
                            i14 = i2;
                        }
                        i15 = i3 & 2048;
                        if (i15 != 0) {
                            i14 |= 48;
                        } else if ((i2 & 48) == 0) {
                            i14 |= startRestartGroup.changed(str3) ? 32 : 16;
                        }
                        i16 = i14;
                        i17 = i3 & 4096;
                        if (i17 != 0) {
                            i16 |= 384;
                        } else if ((i2 & 384) == 0) {
                            i16 |= startRestartGroup.changed(z3) ? 256 : 128;
                            i18 = i3 & 8192;
                            if (i18 == 0) {
                                i16 |= 3072;
                            } else if ((i2 & 3072) == 0) {
                                i16 |= startRestartGroup.changed(f3) ? 2048 : 1024;
                                i19 = i3 & 16384;
                                if (i19 != 0) {
                                    i16 |= 24576;
                                    i20 = i19;
                                } else {
                                    i20 = i19;
                                    if ((i2 & 24576) == 0) {
                                        i16 |= startRestartGroup.changedInstance(function1) ? 16384 : 8192;
                                        i21 = i3 & 32768;
                                        if (i21 == 0) {
                                            i16 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                                        } else if ((i2 & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                            i16 |= startRestartGroup.changedInstance(function12) ? 131072 : 65536;
                                        }
                                        i22 = i3 & 65536;
                                        if (i22 == 0) {
                                            i16 |= 1572864;
                                        } else if ((i2 & 1572864) == 0) {
                                            i16 |= startRestartGroup.changedInstance(function13) ? 1048576 : 524288;
                                        }
                                        i23 = i3 & 131072;
                                        if (i23 == 0) {
                                            i16 |= 12582912;
                                        } else if ((i2 & 12582912) == 0) {
                                            i16 |= startRestartGroup.changedInstance(function14) ? 8388608 : 4194304;
                                        }
                                        if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (4793491 & i16) != 4793490, i4 & 1)) {
                                            startRestartGroup.startDefaults();
                                            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                                startRestartGroup.skipToGroupEnd();
                                                if ((i3 & 1) != 0) {
                                                    i4 &= -15;
                                                }
                                                markerState2 = markerState;
                                                str4 = str;
                                                f7 = f;
                                                z7 = z;
                                                z9 = z2;
                                                bitmapDescriptor3 = bitmapDescriptor;
                                                j7 = j2;
                                                f10 = f2;
                                                str9 = str2;
                                                obj3 = obj;
                                                str8 = str3;
                                                z8 = z3;
                                                f9 = f3;
                                                function114 = function1;
                                                function115 = function12;
                                                function116 = function13;
                                                function113 = function14;
                                                i25 = i4;
                                                j8 = j;
                                            } else {
                                                if ((i3 & 1) != 0) {
                                                    markerState3 = rememberUpdatedMarkerState(null, startRestartGroup, 0, 1);
                                                    i4 &= -15;
                                                } else {
                                                    markerState3 = markerState;
                                                }
                                                java.lang.String str10 = i27 != 0 ? "" : str;
                                                f7 = i5 != 0 ? 1.0f : f;
                                                long m5744constructorimpl = i6 != 0 ? androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(1.0f) & 4294967295L) | (java.lang.Float.floatToRawIntBits(0.5f) << 32)) : j;
                                                z7 = i7 != 0 ? false : z;
                                                boolean z10 = i8 != 0 ? false : z2;
                                                bitmapDescriptor3 = i9 != 0 ? null : bitmapDescriptor;
                                                if (i10 != 0) {
                                                    i24 = i4;
                                                    str7 = str10;
                                                    j5 = m5744constructorimpl;
                                                    j6 = androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(0.5f) << 32) | (java.lang.Float.floatToRawIntBits(0.0f) & 4294967295L));
                                                } else {
                                                    i24 = i4;
                                                    str7 = str10;
                                                    j5 = m5744constructorimpl;
                                                    j6 = j2;
                                                }
                                                float f11 = i11 != 0 ? 0.0f : f2;
                                                java.lang.String str11 = i12 != 0 ? null : str2;
                                                java.lang.Object obj5 = i13 != 0 ? null : obj;
                                                java.lang.String str12 = i15 != 0 ? null : str3;
                                                boolean z11 = i17 != 0 ? true : z3;
                                                float f12 = i18 != 0 ? 0.0f : f3;
                                                if (i20 != 0) {
                                                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                                                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                        rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda41
                                                            @Override // kotlin.jvm.functions.Function1
                                                            public final java.lang.Object invoke(java.lang.Object obj6) {
                                                                boolean Marker_qld6geY$lambda$0$0;
                                                                Marker_qld6geY$lambda$0$0 = com.google.maps.android.compose.MarkerKt.Marker_qld6geY$lambda$0$0((com.google.android.gms.maps.model.Marker) obj6);
                                                                return java.lang.Boolean.valueOf(Marker_qld6geY$lambda$0$0);
                                                            }
                                                        };
                                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                                    }
                                                    function19 = (kotlin.jvm.functions.Function1) rememberedValue;
                                                } else {
                                                    function19 = function1;
                                                }
                                                if (i21 != 0) {
                                                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                                                    if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                        rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda42
                                                            @Override // kotlin.jvm.functions.Function1
                                                            public final java.lang.Object invoke(java.lang.Object obj6) {
                                                                kotlin.Unit Marker_qld6geY$lambda$1$0;
                                                                Marker_qld6geY$lambda$1$0 = com.google.maps.android.compose.MarkerKt.Marker_qld6geY$lambda$1$0((com.google.android.gms.maps.model.Marker) obj6);
                                                                return Marker_qld6geY$lambda$1$0;
                                                            }
                                                        };
                                                        startRestartGroup.updateRememberedValue(rememberedValue2);
                                                    }
                                                    function110 = (kotlin.jvm.functions.Function1) rememberedValue2;
                                                } else {
                                                    function110 = function12;
                                                }
                                                if (i22 != 0) {
                                                    java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                                                    if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                        rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda43
                                                            @Override // kotlin.jvm.functions.Function1
                                                            public final java.lang.Object invoke(java.lang.Object obj6) {
                                                                kotlin.Unit Marker_qld6geY$lambda$2$0;
                                                                Marker_qld6geY$lambda$2$0 = com.google.maps.android.compose.MarkerKt.Marker_qld6geY$lambda$2$0((com.google.android.gms.maps.model.Marker) obj6);
                                                                return Marker_qld6geY$lambda$2$0;
                                                            }
                                                        };
                                                        startRestartGroup.updateRememberedValue(rememberedValue3);
                                                    }
                                                    function111 = (kotlin.jvm.functions.Function1) rememberedValue3;
                                                } else {
                                                    function111 = function13;
                                                }
                                                if (i23 != 0) {
                                                    java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                                                    f8 = f11;
                                                    if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                        rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda45
                                                            @Override // kotlin.jvm.functions.Function1
                                                            public final java.lang.Object invoke(java.lang.Object obj6) {
                                                                kotlin.Unit Marker_qld6geY$lambda$3$0;
                                                                Marker_qld6geY$lambda$3$0 = com.google.maps.android.compose.MarkerKt.Marker_qld6geY$lambda$3$0((com.google.android.gms.maps.model.Marker) obj6);
                                                                return Marker_qld6geY$lambda$3$0;
                                                            }
                                                        };
                                                        startRestartGroup.updateRememberedValue(rememberedValue4);
                                                    }
                                                    function112 = (kotlin.jvm.functions.Function1) rememberedValue4;
                                                } else {
                                                    f8 = f11;
                                                    function112 = function14;
                                                }
                                                i25 = i24;
                                                function113 = function112;
                                                z8 = z11;
                                                f9 = f12;
                                                function114 = function19;
                                                function115 = function110;
                                                function116 = function111;
                                                markerState2 = markerState3;
                                                str8 = str12;
                                                f10 = f8;
                                                str9 = str11;
                                                obj3 = obj5;
                                                j7 = j6;
                                                z9 = z10;
                                                str4 = str7;
                                                j8 = j5;
                                            }
                                            startRestartGroup.endDefaults();
                                            composer2 = startRestartGroup;
                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                obj4 = obj3;
                                                androidx.compose.runtime.ComposerKt.traceEventStart(122922304, i25, i16, "com.google.maps.android.compose.Marker (Marker.kt:266)");
                                            } else {
                                                obj4 = obj3;
                                            }
                                            m10528MarkerImplkhPtz74(markerState2, str4, f7, j8, z7, z9, bitmapDescriptor3, j7, f10, str9, obj4, str8, z8, f9, function114, function115, function116, function113, null, null, composer2, i25 & 2147483646, i16 & 33554430, 786432);
                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                                            }
                                            str5 = str9;
                                            bitmapDescriptor2 = bitmapDescriptor3;
                                            z6 = z8;
                                            f6 = f9;
                                            function15 = function114;
                                            function16 = function115;
                                            function17 = function116;
                                            function18 = function113;
                                            str6 = str8;
                                            f5 = f10;
                                            boolean z12 = z7;
                                            obj2 = obj4;
                                            long j9 = j7;
                                            z5 = z9;
                                            j3 = j8;
                                            f4 = f7;
                                            z4 = z12;
                                            j4 = j9;
                                        } else {
                                            composer2 = startRestartGroup;
                                            composer2.skipToGroupEnd();
                                            markerState2 = markerState;
                                            str4 = str;
                                            f4 = f;
                                            j3 = j;
                                            z4 = z;
                                            z5 = z2;
                                            bitmapDescriptor2 = bitmapDescriptor;
                                            j4 = j2;
                                            f5 = f2;
                                            str5 = str2;
                                            obj2 = obj;
                                            str6 = str3;
                                            z6 = z3;
                                            f6 = f3;
                                            function15 = function1;
                                            function16 = function12;
                                            function17 = function13;
                                            function18 = function14;
                                        }
                                        endRestartGroup = composer2.endRestartGroup();
                                        if (endRestartGroup == null) {
                                            final boolean z13 = z6;
                                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda46
                                                @Override // kotlin.jvm.functions.Function2
                                                public final java.lang.Object invoke(java.lang.Object obj6, java.lang.Object obj7) {
                                                    kotlin.Unit Marker_qld6geY$lambda$4;
                                                    Marker_qld6geY$lambda$4 = com.google.maps.android.compose.MarkerKt.Marker_qld6geY$lambda$4(com.google.maps.android.compose.MarkerState.this, str4, f4, j3, z4, z5, bitmapDescriptor2, j4, f5, str5, obj2, str6, z13, f6, function15, function16, function17, function18, i, i2, i3, (androidx.compose.runtime.Composer) obj6, ((java.lang.Integer) obj7).intValue());
                                                    return Marker_qld6geY$lambda$4;
                                                }
                                            });
                                            return;
                                        }
                                        return;
                                    }
                                }
                                i21 = i3 & 32768;
                                if (i21 == 0) {
                                }
                                i22 = i3 & 65536;
                                if (i22 == 0) {
                                }
                                i23 = i3 & 131072;
                                if (i23 == 0) {
                                }
                                if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (4793491 & i16) != 4793490, i4 & 1)) {
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup == null) {
                                }
                            }
                            i19 = i3 & 16384;
                            if (i19 != 0) {
                            }
                            i21 = i3 & 32768;
                            if (i21 == 0) {
                            }
                            i22 = i3 & 65536;
                            if (i22 == 0) {
                            }
                            i23 = i3 & 131072;
                            if (i23 == 0) {
                            }
                            if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (4793491 & i16) != 4793490, i4 & 1)) {
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                            }
                        }
                        i18 = i3 & 8192;
                        if (i18 == 0) {
                        }
                        i19 = i3 & 16384;
                        if (i19 != 0) {
                        }
                        i21 = i3 & 32768;
                        if (i21 == 0) {
                        }
                        i22 = i3 & 65536;
                        if (i22 == 0) {
                        }
                        i23 = i3 & 131072;
                        if (i23 == 0) {
                        }
                        if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (4793491 & i16) != 4793490, i4 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i12 = i3 & 512;
                    if (i12 != 0) {
                    }
                    i13 = i3 & 1024;
                    if (i13 != 0) {
                    }
                    i15 = i3 & 2048;
                    if (i15 != 0) {
                    }
                    i16 = i14;
                    i17 = i3 & 4096;
                    if (i17 != 0) {
                    }
                    i18 = i3 & 8192;
                    if (i18 == 0) {
                    }
                    i19 = i3 & 16384;
                    if (i19 != 0) {
                    }
                    i21 = i3 & 32768;
                    if (i21 == 0) {
                    }
                    i22 = i3 & 65536;
                    if (i22 == 0) {
                    }
                    i23 = i3 & 131072;
                    if (i23 == 0) {
                    }
                    if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (4793491 & i16) != 4793490, i4 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i8 = i3 & 32;
                if (i8 == 0) {
                }
                i9 = i3 & 64;
                if (i9 == 0) {
                }
                i10 = i3 & 128;
                if (i10 == 0) {
                }
                i11 = i3 & 256;
                if (i11 == 0) {
                }
                i12 = i3 & 512;
                if (i12 != 0) {
                }
                i13 = i3 & 1024;
                if (i13 != 0) {
                }
                i15 = i3 & 2048;
                if (i15 != 0) {
                }
                i16 = i14;
                i17 = i3 & 4096;
                if (i17 != 0) {
                }
                i18 = i3 & 8192;
                if (i18 == 0) {
                }
                i19 = i3 & 16384;
                if (i19 != 0) {
                }
                i21 = i3 & 32768;
                if (i21 == 0) {
                }
                i22 = i3 & 65536;
                if (i22 == 0) {
                }
                i23 = i3 & 131072;
                if (i23 == 0) {
                }
                if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (4793491 & i16) != 4793490, i4 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            i7 = i3 & 16;
            if (i7 != 0) {
            }
            i8 = i3 & 32;
            if (i8 == 0) {
            }
            i9 = i3 & 64;
            if (i9 == 0) {
            }
            i10 = i3 & 128;
            if (i10 == 0) {
            }
            i11 = i3 & 256;
            if (i11 == 0) {
            }
            i12 = i3 & 512;
            if (i12 != 0) {
            }
            i13 = i3 & 1024;
            if (i13 != 0) {
            }
            i15 = i3 & 2048;
            if (i15 != 0) {
            }
            i16 = i14;
            i17 = i3 & 4096;
            if (i17 != 0) {
            }
            i18 = i3 & 8192;
            if (i18 == 0) {
            }
            i19 = i3 & 16384;
            if (i19 != 0) {
            }
            i21 = i3 & 32768;
            if (i21 == 0) {
            }
            i22 = i3 & 65536;
            if (i22 == 0) {
            }
            i23 = i3 & 131072;
            if (i23 == 0) {
            }
            if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (4793491 & i16) != 4793490, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        i7 = i3 & 16;
        if (i7 != 0) {
        }
        i8 = i3 & 32;
        if (i8 == 0) {
        }
        i9 = i3 & 64;
        if (i9 == 0) {
        }
        i10 = i3 & 128;
        if (i10 == 0) {
        }
        i11 = i3 & 256;
        if (i11 == 0) {
        }
        i12 = i3 & 512;
        if (i12 != 0) {
        }
        i13 = i3 & 1024;
        if (i13 != 0) {
        }
        i15 = i3 & 2048;
        if (i15 != 0) {
        }
        i16 = i14;
        i17 = i3 & 4096;
        if (i17 != 0) {
        }
        i18 = i3 & 8192;
        if (i18 == 0) {
        }
        i19 = i3 & 16384;
        if (i19 != 0) {
        }
        i21 = i3 & 32768;
        if (i21 == 0) {
        }
        i22 = i3 & 65536;
        if (i22 == 0) {
        }
        i23 = i3 & 131072;
        if (i23 == 0) {
        }
        if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (4793491 & i16) != 4793490, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit MarkerComposable_Khg_OnI$lambda$1$0(com.google.android.gms.maps.model.Marker marker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(marker, "");
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit MarkerComposable_Khg_OnI$lambda$2$0(com.google.android.gms.maps.model.Marker marker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(marker, "");
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit MarkerComposable_Khg_OnI$lambda$3$0(com.google.android.gms.maps.model.Marker marker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(marker, "");
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x028d  */
    /* renamed from: MarkerComposable-Khg_OnI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m10527MarkerComposableKhg_OnI(final java.lang.Object[] objArr, com.google.maps.android.compose.MarkerState markerState, java.lang.String str, float f, long j, boolean z, boolean z2, long j2, float f2, java.lang.String str2, java.lang.Object obj, java.lang.String str3, boolean z3, float f3, kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, java.lang.Boolean> function1, kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function12, kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function13, kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function14, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int length;
        int i26;
        com.google.maps.android.compose.MarkerState markerState2;
        java.lang.String str4;
        float f4;
        long j3;
        final boolean z4;
        final boolean z5;
        long j4;
        float f5;
        java.lang.String str5;
        java.lang.Object obj2;
        java.lang.String str6;
        boolean z6;
        float f6;
        final kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, java.lang.Boolean> function15;
        final kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function16;
        final kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function17;
        final kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function18;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        com.google.maps.android.compose.MarkerState markerState3;
        int i27;
        boolean z7;
        int i28;
        float f7;
        long j5;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, java.lang.Boolean> function19;
        float f8;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function110;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function111;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function112;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function113;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function114;
        int i29;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function115;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function116;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function117;
        java.lang.String str7;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, java.lang.Boolean> function118;
        com.google.maps.android.compose.MarkerState markerState4;
        boolean z8;
        float f9;
        java.lang.String str8;
        java.lang.Object obj3;
        java.lang.String str9;
        float f10;
        java.lang.String str10;
        java.lang.Object obj4;
        java.lang.String str11;
        int i30;
        int i31;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1649920301);
        if ((i & 48) == 0) {
            if ((i3 & 2) == 0 && startRestartGroup.changed(markerState)) {
                i31 = 32;
                i4 = i31 | i;
            }
            i31 = 16;
            i4 = i31 | i;
        } else {
            i4 = i;
        }
        int i32 = i3 & 4;
        if (i32 != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= startRestartGroup.changed(str) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                i4 |= startRestartGroup.changed(f) ? 2048 : 1024;
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((i & 24576) == 0) {
                    i4 |= startRestartGroup.changed(j) ? 16384 : 8192;
                }
                i7 = i3 & 32;
                if (i7 != 0) {
                    i4 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i4 |= startRestartGroup.changed(z) ? 131072 : 65536;
                }
                i8 = i3 & 64;
                if (i8 != 0) {
                    i4 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i4 |= startRestartGroup.changed(z2) ? 1048576 : 524288;
                }
                i9 = i3 & 128;
                if (i9 != 0) {
                    i4 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i4 |= startRestartGroup.changed(j2) ? 8388608 : 4194304;
                }
                i10 = i3 & 256;
                if (i10 != 0) {
                    i4 |= 100663296;
                } else if ((100663296 & i) == 0) {
                    i4 |= startRestartGroup.changed(f2) ? 67108864 : 33554432;
                    i11 = i3 & 512;
                    if (i11 == 0) {
                        i4 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        i4 |= startRestartGroup.changed(str2) ? 536870912 : 268435456;
                    }
                    i12 = i3 & 1024;
                    if (i12 == 0) {
                        i13 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        i13 = i2 | (startRestartGroup.changedInstance(obj) ? 4 : 2);
                    } else {
                        i13 = i2;
                    }
                    i14 = i3 & 2048;
                    if (i14 == 0) {
                        i13 |= 48;
                    } else if ((i2 & 48) == 0) {
                        i13 |= startRestartGroup.changed(str3) ? 32 : 16;
                    }
                    i15 = i13;
                    i16 = i3 & 4096;
                    if (i16 == 0) {
                        i15 |= 384;
                        i17 = i16;
                    } else {
                        i17 = i16;
                        if ((i2 & 384) == 0) {
                            i15 |= startRestartGroup.changed(z3) ? 256 : 128;
                            i18 = i3 & 8192;
                            if (i18 != 0) {
                                i15 |= 3072;
                                i19 = i18;
                            } else {
                                i19 = i18;
                                if ((i2 & 3072) == 0) {
                                    i15 |= startRestartGroup.changed(f3) ? 2048 : 1024;
                                    i20 = i3 & 16384;
                                    if (i20 == 0) {
                                        i15 |= 24576;
                                        i21 = i20;
                                    } else {
                                        i21 = i20;
                                        if ((i2 & 24576) == 0) {
                                            i15 |= startRestartGroup.changedInstance(function1) ? 16384 : 8192;
                                            i22 = i3 & 32768;
                                            if (i22 != 0) {
                                                i15 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                                            } else if ((i2 & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                                i15 |= startRestartGroup.changedInstance(function12) ? 131072 : 65536;
                                            }
                                            i23 = i3 & 65536;
                                            if (i23 != 0) {
                                                i15 |= 1572864;
                                            } else if ((i2 & 1572864) == 0) {
                                                i15 |= startRestartGroup.changedInstance(function13) ? 1048576 : 524288;
                                            }
                                            i24 = i3 & 131072;
                                            if (i24 != 0) {
                                                i15 |= 12582912;
                                            } else if ((i2 & 12582912) == 0) {
                                                i15 |= startRestartGroup.changedInstance(function14) ? 8388608 : 4194304;
                                            }
                                            if ((i2 & 100663296) == 0) {
                                                i15 |= startRestartGroup.changedInstance(function2) ? 67108864 : 33554432;
                                            }
                                            startRestartGroup.startMovableGroup(730477885, java.lang.Integer.valueOf(objArr.length));
                                            i25 = i4 | (startRestartGroup.changed(objArr.length) ? 4 : 0);
                                            length = objArr.length;
                                            i26 = 0;
                                            while (i26 < length) {
                                                int i33 = length;
                                                i25 |= startRestartGroup.changedInstance(objArr[i26]) ? 4 : 0;
                                                i26++;
                                                length = i33;
                                            }
                                            startRestartGroup.endMovableGroup();
                                            if ((i25 & 14) == 0) {
                                                i25 |= 2;
                                            }
                                            if (!startRestartGroup.shouldExecute((306783379 & i25) == 306783378 || (38347923 & i15) != 38347922, i25 & 1)) {
                                                startRestartGroup.skipToGroupEnd();
                                                markerState2 = markerState;
                                                str4 = str;
                                                f4 = f;
                                                j3 = j;
                                                z4 = z;
                                                z5 = z2;
                                                j4 = j2;
                                                f5 = f2;
                                                str5 = str2;
                                                obj2 = obj;
                                                str6 = str3;
                                                z6 = z3;
                                                f6 = f3;
                                                function15 = function1;
                                                function16 = function12;
                                                function17 = function13;
                                                function18 = function14;
                                            } else {
                                                startRestartGroup.startDefaults();
                                                if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                                    if ((i3 & 2) != 0) {
                                                        markerState3 = rememberUpdatedMarkerState(null, startRestartGroup, 0, 1);
                                                        i25 &= -113;
                                                    } else {
                                                        markerState3 = markerState;
                                                    }
                                                    java.lang.String str12 = i32 == 0 ? str : "";
                                                    float f11 = i5 != 0 ? 1.0f : f;
                                                    if (i6 != 0) {
                                                        i27 = i15;
                                                        j3 = androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(1.0f) & 4294967295L) | (java.lang.Float.floatToRawIntBits(0.5f) << 32));
                                                    } else {
                                                        i27 = i15;
                                                        j3 = j;
                                                    }
                                                    z7 = i7 != 0 ? false : z;
                                                    boolean z9 = i8 != 0 ? false : z2;
                                                    if (i9 != 0) {
                                                        i28 = i25;
                                                        f7 = f11;
                                                        j5 = androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(0.0f) & 4294967295L) | (java.lang.Float.floatToRawIntBits(0.5f) << 32));
                                                    } else {
                                                        i28 = i25;
                                                        f7 = f11;
                                                        j5 = j2;
                                                    }
                                                    float f12 = i10 != 0 ? 0.0f : f2;
                                                    java.lang.String str13 = i11 != 0 ? null : str2;
                                                    java.lang.Object obj5 = i12 != 0 ? null : obj;
                                                    java.lang.String str14 = i14 != 0 ? null : str3;
                                                    boolean z10 = i17 != 0 ? true : z3;
                                                    float f13 = i19 != 0 ? 0.0f : f3;
                                                    if (i21 != 0) {
                                                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                                                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda29
                                                                @Override // kotlin.jvm.functions.Function1
                                                                public final java.lang.Object invoke(java.lang.Object obj6) {
                                                                    boolean MarkerComposable_Khg_OnI$lambda$0$0;
                                                                    MarkerComposable_Khg_OnI$lambda$0$0 = com.google.maps.android.compose.MarkerKt.MarkerComposable_Khg_OnI$lambda$0$0((com.google.android.gms.maps.model.Marker) obj6);
                                                                    return java.lang.Boolean.valueOf(MarkerComposable_Khg_OnI$lambda$0$0);
                                                                }
                                                            };
                                                            startRestartGroup.updateRememberedValue(rememberedValue);
                                                        }
                                                        function19 = (kotlin.jvm.functions.Function1) rememberedValue;
                                                    } else {
                                                        function19 = function1;
                                                    }
                                                    if (i22 != 0) {
                                                        java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                                                        f8 = f12;
                                                        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                            rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda30
                                                                @Override // kotlin.jvm.functions.Function1
                                                                public final java.lang.Object invoke(java.lang.Object obj6) {
                                                                    kotlin.Unit MarkerComposable_Khg_OnI$lambda$1$0;
                                                                    MarkerComposable_Khg_OnI$lambda$1$0 = com.google.maps.android.compose.MarkerKt.MarkerComposable_Khg_OnI$lambda$1$0((com.google.android.gms.maps.model.Marker) obj6);
                                                                    return MarkerComposable_Khg_OnI$lambda$1$0;
                                                                }
                                                            };
                                                            startRestartGroup.updateRememberedValue(rememberedValue2);
                                                        }
                                                        function110 = (kotlin.jvm.functions.Function1) rememberedValue2;
                                                    } else {
                                                        f8 = f12;
                                                        function110 = function12;
                                                    }
                                                    if (i23 != 0) {
                                                        java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                                                        function111 = function110;
                                                        if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                            rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda31
                                                                @Override // kotlin.jvm.functions.Function1
                                                                public final java.lang.Object invoke(java.lang.Object obj6) {
                                                                    kotlin.Unit MarkerComposable_Khg_OnI$lambda$2$0;
                                                                    MarkerComposable_Khg_OnI$lambda$2$0 = com.google.maps.android.compose.MarkerKt.MarkerComposable_Khg_OnI$lambda$2$0((com.google.android.gms.maps.model.Marker) obj6);
                                                                    return MarkerComposable_Khg_OnI$lambda$2$0;
                                                                }
                                                            };
                                                            startRestartGroup.updateRememberedValue(rememberedValue3);
                                                        }
                                                        function112 = (kotlin.jvm.functions.Function1) rememberedValue3;
                                                    } else {
                                                        function111 = function110;
                                                        function112 = function13;
                                                    }
                                                    if (i24 != 0) {
                                                        java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                                                        function113 = function112;
                                                        if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                            rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda32
                                                                @Override // kotlin.jvm.functions.Function1
                                                                public final java.lang.Object invoke(java.lang.Object obj6) {
                                                                    kotlin.Unit MarkerComposable_Khg_OnI$lambda$3$0;
                                                                    MarkerComposable_Khg_OnI$lambda$3$0 = com.google.maps.android.compose.MarkerKt.MarkerComposable_Khg_OnI$lambda$3$0((com.google.android.gms.maps.model.Marker) obj6);
                                                                    return MarkerComposable_Khg_OnI$lambda$3$0;
                                                                }
                                                            };
                                                            startRestartGroup.updateRememberedValue(rememberedValue4);
                                                        }
                                                        function114 = (kotlin.jvm.functions.Function1) rememberedValue4;
                                                    } else {
                                                        function113 = function112;
                                                        function114 = function14;
                                                    }
                                                    i29 = i28;
                                                    function115 = function111;
                                                    function116 = function113;
                                                    function117 = function114;
                                                    str7 = str14;
                                                    z6 = z10;
                                                    f6 = f13;
                                                    function118 = function19;
                                                    markerState4 = markerState3;
                                                    z8 = z9;
                                                    f9 = f8;
                                                    str8 = str13;
                                                    obj3 = obj5;
                                                    str9 = str12;
                                                    f10 = f7;
                                                } else {
                                                    startRestartGroup.skipToGroupEnd();
                                                    if ((i3 & 2) != 0) {
                                                        i25 &= -113;
                                                    }
                                                    markerState4 = markerState;
                                                    str9 = str;
                                                    f10 = f;
                                                    z7 = z;
                                                    z8 = z2;
                                                    f9 = f2;
                                                    str8 = str2;
                                                    obj3 = obj;
                                                    str7 = str3;
                                                    z6 = z3;
                                                    f6 = f3;
                                                    function118 = function1;
                                                    function115 = function12;
                                                    function116 = function13;
                                                    function117 = function14;
                                                    i29 = i25;
                                                    i27 = i15;
                                                    j3 = j;
                                                    j5 = j2;
                                                }
                                                startRestartGroup.endDefaults();
                                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                    str11 = str7;
                                                    obj4 = obj3;
                                                    str10 = str8;
                                                    i30 = i27;
                                                    androidx.compose.runtime.ComposerKt.traceEventStart(1649920301, i29, i30, "com.google.maps.android.compose.MarkerComposable (Marker.kt:341)");
                                                } else {
                                                    str10 = str8;
                                                    obj4 = obj3;
                                                    str11 = str7;
                                                    i30 = i27;
                                                }
                                                float f14 = f9;
                                                long j6 = j5;
                                                m10528MarkerImplkhPtz74(markerState4, str9, f10, j3, z7, z8, com.google.maps.android.compose.RememberComposeBitmapDescriptorKt.rememberComposeBitmapDescriptor(java.util.Arrays.copyOf(objArr, objArr.length), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1211332052, true, new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda34
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final java.lang.Object invoke(java.lang.Object obj6, java.lang.Object obj7) {
                                                        kotlin.Unit MarkerComposable_Khg_OnI$lambda$4;
                                                        MarkerComposable_Khg_OnI$lambda$4 = com.google.maps.android.compose.MarkerKt.MarkerComposable_Khg_OnI$lambda$4(kotlin.jvm.functions.Function2.this, (androidx.compose.runtime.Composer) obj6, ((java.lang.Integer) obj7).intValue());
                                                        return MarkerComposable_Khg_OnI$lambda$4;
                                                    }
                                                }, startRestartGroup, 54), startRestartGroup, 48), j6, f14, str10, obj4, str11, z6, f6, function118, function115, function116, function117, null, null, startRestartGroup, ((i29 >> 3) & 524286) | (29360128 & i29) | (234881024 & i29) | (1879048192 & i29), i30 & 33554430, 786432);
                                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                                }
                                                str6 = str11;
                                                obj2 = obj4;
                                                str5 = str10;
                                                f5 = f14;
                                                z5 = z8;
                                                z4 = z7;
                                                function15 = function118;
                                                function16 = function115;
                                                function17 = function116;
                                                function18 = function117;
                                                j4 = j6;
                                                f4 = f10;
                                                str4 = str9;
                                                markerState2 = markerState4;
                                            }
                                            endRestartGroup = startRestartGroup.endRestartGroup();
                                            if (endRestartGroup != null) {
                                                final com.google.maps.android.compose.MarkerState markerState5 = markerState2;
                                                final java.lang.String str15 = str4;
                                                final float f15 = f4;
                                                final long j7 = j3;
                                                final long j8 = j4;
                                                final float f16 = f5;
                                                final java.lang.String str16 = str5;
                                                final java.lang.Object obj6 = obj2;
                                                final java.lang.String str17 = str6;
                                                final boolean z11 = z6;
                                                final float f17 = f6;
                                                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda35
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final java.lang.Object invoke(java.lang.Object obj7, java.lang.Object obj8) {
                                                        kotlin.Unit MarkerComposable_Khg_OnI$lambda$5;
                                                        MarkerComposable_Khg_OnI$lambda$5 = com.google.maps.android.compose.MarkerKt.MarkerComposable_Khg_OnI$lambda$5(objArr, markerState5, str15, f15, j7, z4, z5, j8, f16, str16, obj6, str17, z11, f17, function15, function16, function17, function18, function2, i, i2, i3, (androidx.compose.runtime.Composer) obj7, ((java.lang.Integer) obj8).intValue());
                                                        return MarkerComposable_Khg_OnI$lambda$5;
                                                    }
                                                });
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                    i22 = i3 & 32768;
                                    if (i22 != 0) {
                                    }
                                    i23 = i3 & 65536;
                                    if (i23 != 0) {
                                    }
                                    i24 = i3 & 131072;
                                    if (i24 != 0) {
                                    }
                                    if ((i2 & 100663296) == 0) {
                                    }
                                    startRestartGroup.startMovableGroup(730477885, java.lang.Integer.valueOf(objArr.length));
                                    i25 = i4 | (startRestartGroup.changed(objArr.length) ? 4 : 0);
                                    length = objArr.length;
                                    i26 = 0;
                                    while (i26 < length) {
                                    }
                                    startRestartGroup.endMovableGroup();
                                    if ((i25 & 14) == 0) {
                                    }
                                    if (!startRestartGroup.shouldExecute((306783379 & i25) == 306783378 || (38347923 & i15) != 38347922, i25 & 1)) {
                                    }
                                    endRestartGroup = startRestartGroup.endRestartGroup();
                                    if (endRestartGroup != null) {
                                    }
                                }
                            }
                            i20 = i3 & 16384;
                            if (i20 == 0) {
                            }
                            i22 = i3 & 32768;
                            if (i22 != 0) {
                            }
                            i23 = i3 & 65536;
                            if (i23 != 0) {
                            }
                            i24 = i3 & 131072;
                            if (i24 != 0) {
                            }
                            if ((i2 & 100663296) == 0) {
                            }
                            startRestartGroup.startMovableGroup(730477885, java.lang.Integer.valueOf(objArr.length));
                            i25 = i4 | (startRestartGroup.changed(objArr.length) ? 4 : 0);
                            length = objArr.length;
                            i26 = 0;
                            while (i26 < length) {
                            }
                            startRestartGroup.endMovableGroup();
                            if ((i25 & 14) == 0) {
                            }
                            if (!startRestartGroup.shouldExecute((306783379 & i25) == 306783378 || (38347923 & i15) != 38347922, i25 & 1)) {
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                    }
                    i18 = i3 & 8192;
                    if (i18 != 0) {
                    }
                    i20 = i3 & 16384;
                    if (i20 == 0) {
                    }
                    i22 = i3 & 32768;
                    if (i22 != 0) {
                    }
                    i23 = i3 & 65536;
                    if (i23 != 0) {
                    }
                    i24 = i3 & 131072;
                    if (i24 != 0) {
                    }
                    if ((i2 & 100663296) == 0) {
                    }
                    startRestartGroup.startMovableGroup(730477885, java.lang.Integer.valueOf(objArr.length));
                    i25 = i4 | (startRestartGroup.changed(objArr.length) ? 4 : 0);
                    length = objArr.length;
                    i26 = 0;
                    while (i26 < length) {
                    }
                    startRestartGroup.endMovableGroup();
                    if ((i25 & 14) == 0) {
                    }
                    if (!startRestartGroup.shouldExecute((306783379 & i25) == 306783378 || (38347923 & i15) != 38347922, i25 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i11 = i3 & 512;
                if (i11 == 0) {
                }
                i12 = i3 & 1024;
                if (i12 == 0) {
                }
                i14 = i3 & 2048;
                if (i14 == 0) {
                }
                i15 = i13;
                i16 = i3 & 4096;
                if (i16 == 0) {
                }
                i18 = i3 & 8192;
                if (i18 != 0) {
                }
                i20 = i3 & 16384;
                if (i20 == 0) {
                }
                i22 = i3 & 32768;
                if (i22 != 0) {
                }
                i23 = i3 & 65536;
                if (i23 != 0) {
                }
                i24 = i3 & 131072;
                if (i24 != 0) {
                }
                if ((i2 & 100663296) == 0) {
                }
                startRestartGroup.startMovableGroup(730477885, java.lang.Integer.valueOf(objArr.length));
                i25 = i4 | (startRestartGroup.changed(objArr.length) ? 4 : 0);
                length = objArr.length;
                i26 = 0;
                while (i26 < length) {
                }
                startRestartGroup.endMovableGroup();
                if ((i25 & 14) == 0) {
                }
                if (!startRestartGroup.shouldExecute((306783379 & i25) == 306783378 || (38347923 & i15) != 38347922, i25 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            i7 = i3 & 32;
            if (i7 != 0) {
            }
            i8 = i3 & 64;
            if (i8 != 0) {
            }
            i9 = i3 & 128;
            if (i9 != 0) {
            }
            i10 = i3 & 256;
            if (i10 != 0) {
            }
            i11 = i3 & 512;
            if (i11 == 0) {
            }
            i12 = i3 & 1024;
            if (i12 == 0) {
            }
            i14 = i3 & 2048;
            if (i14 == 0) {
            }
            i15 = i13;
            i16 = i3 & 4096;
            if (i16 == 0) {
            }
            i18 = i3 & 8192;
            if (i18 != 0) {
            }
            i20 = i3 & 16384;
            if (i20 == 0) {
            }
            i22 = i3 & 32768;
            if (i22 != 0) {
            }
            i23 = i3 & 65536;
            if (i23 != 0) {
            }
            i24 = i3 & 131072;
            if (i24 != 0) {
            }
            if ((i2 & 100663296) == 0) {
            }
            startRestartGroup.startMovableGroup(730477885, java.lang.Integer.valueOf(objArr.length));
            i25 = i4 | (startRestartGroup.changed(objArr.length) ? 4 : 0);
            length = objArr.length;
            i26 = 0;
            while (i26 < length) {
            }
            startRestartGroup.endMovableGroup();
            if ((i25 & 14) == 0) {
            }
            if (!startRestartGroup.shouldExecute((306783379 & i25) == 306783378 || (38347923 & i15) != 38347922, i25 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        i7 = i3 & 32;
        if (i7 != 0) {
        }
        i8 = i3 & 64;
        if (i8 != 0) {
        }
        i9 = i3 & 128;
        if (i9 != 0) {
        }
        i10 = i3 & 256;
        if (i10 != 0) {
        }
        i11 = i3 & 512;
        if (i11 == 0) {
        }
        i12 = i3 & 1024;
        if (i12 == 0) {
        }
        i14 = i3 & 2048;
        if (i14 == 0) {
        }
        i15 = i13;
        i16 = i3 & 4096;
        if (i16 == 0) {
        }
        i18 = i3 & 8192;
        if (i18 != 0) {
        }
        i20 = i3 & 16384;
        if (i20 == 0) {
        }
        i22 = i3 & 32768;
        if (i22 != 0) {
        }
        i23 = i3 & 65536;
        if (i23 != 0) {
        }
        i24 = i3 & 131072;
        if (i24 != 0) {
        }
        if ((i2 & 100663296) == 0) {
        }
        startRestartGroup.startMovableGroup(730477885, java.lang.Integer.valueOf(objArr.length));
        i25 = i4 | (startRestartGroup.changed(objArr.length) ? 4 : 0);
        length = objArr.length;
        i26 = 0;
        while (i26 < length) {
        }
        startRestartGroup.endMovableGroup();
        if ((i25 & 14) == 0) {
        }
        if (!startRestartGroup.shouldExecute((306783379 & i25) == 306783378 || (38347923 & i15) != 38347922, i25 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit MarkerComposable_Khg_OnI$lambda$4(kotlin.jvm.functions.Function2 function2, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1211332052, i, -1, "com.google.maps.android.compose.MarkerComposable.<anonymous> (Marker.kt:342)");
            }
            function2.invoke(composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit MarkerInfoWindow_jYtn1XM$lambda$1$0(com.google.android.gms.maps.model.Marker marker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(marker, "");
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit MarkerInfoWindow_jYtn1XM$lambda$2$0(com.google.android.gms.maps.model.Marker marker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(marker, "");
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit MarkerInfoWindow_jYtn1XM$lambda$3$0(com.google.android.gms.maps.model.Marker marker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(marker, "");
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /* renamed from: MarkerInfoWindow-jYtn1XM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m10529MarkerInfoWindowjYtn1XM(com.google.maps.android.compose.MarkerState markerState, float f, long j, boolean z, java.lang.String str, boolean z2, com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptor, long j2, float f2, java.lang.String str2, java.lang.Object obj, java.lang.String str3, boolean z3, float f3, kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, java.lang.Boolean> function1, kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function12, kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function13, kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function14, kotlin.jvm.functions.Function3<? super com.google.android.gms.maps.model.Marker, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, androidx.compose.runtime.Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        androidx.compose.runtime.Composer composer2;
        final com.google.maps.android.compose.MarkerState markerState2;
        final float f4;
        final long j3;
        final boolean z4;
        final java.lang.String str4;
        final boolean z5;
        final com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptor2;
        final long j4;
        final float f5;
        final java.lang.String str5;
        final java.lang.Object obj2;
        final java.lang.String str6;
        boolean z6;
        final float f6;
        final kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, java.lang.Boolean> function15;
        final kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function16;
        final kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function17;
        final kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function18;
        final kotlin.jvm.functions.Function3<? super com.google.android.gms.maps.model.Marker, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function32;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        com.google.maps.android.compose.MarkerState markerState3;
        boolean z7;
        java.lang.String str7;
        com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptor3;
        int i25;
        float f7;
        long j5;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, java.lang.Boolean> function19;
        java.lang.Object obj3;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function110;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function111;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function112;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function113;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function114;
        int i26;
        java.lang.Object obj4;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function115;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function116;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function117;
        java.lang.String str8;
        boolean z8;
        float f8;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, java.lang.Boolean> function118;
        kotlin.jvm.functions.Function3<? super com.google.android.gms.maps.model.Marker, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function33;
        java.lang.String str9;
        float f9;
        long j6;
        boolean z9;
        java.lang.Object obj5;
        int i27;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1121562626);
        if ((i & 6) == 0) {
            if ((i3 & 1) == 0 && startRestartGroup.changed(markerState)) {
                i27 = 4;
                i4 = i27 | i;
            }
            i27 = 2;
            i4 = i27 | i;
        } else {
            i4 = i;
        }
        int i28 = i3 & 2;
        if (i28 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= startRestartGroup.changed(f) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i & 384) == 0) {
                i4 |= startRestartGroup.changed(j) ? 256 : 128;
            }
            i6 = i3 & 8;
            if (i6 == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                i4 |= startRestartGroup.changed(z) ? 2048 : 1024;
                i7 = i3 & 16;
                if (i7 != 0) {
                    i4 |= 24576;
                } else if ((i & 24576) == 0) {
                    i4 |= startRestartGroup.changed(str) ? 16384 : 8192;
                    i8 = i3 & 32;
                    if (i8 == 0) {
                        i4 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i4 |= startRestartGroup.changed(z2) ? 131072 : 65536;
                    }
                    i9 = i3 & 64;
                    if (i9 == 0) {
                        i4 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i4 |= startRestartGroup.changed(bitmapDescriptor) ? 1048576 : 524288;
                    }
                    i10 = i3 & 128;
                    if (i10 == 0) {
                        i4 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i4 |= startRestartGroup.changed(j2) ? 8388608 : 4194304;
                    }
                    i11 = i3 & 256;
                    if (i11 == 0) {
                        i4 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i4 |= startRestartGroup.changed(f2) ? 67108864 : 33554432;
                    }
                    i12 = i3 & 512;
                    if (i12 == 0) {
                        i4 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        i4 |= startRestartGroup.changed(str2) ? 536870912 : 268435456;
                    }
                    i13 = i3 & 1024;
                    if (i13 == 0) {
                        i14 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        i14 = i2 | (startRestartGroup.changedInstance(obj) ? 4 : 2);
                    } else {
                        i14 = i2;
                    }
                    i15 = i3 & 2048;
                    if (i15 == 0) {
                        i14 |= 48;
                    } else if ((i2 & 48) == 0) {
                        i14 |= startRestartGroup.changed(str3) ? 32 : 16;
                    }
                    i16 = i14;
                    i17 = i3 & 4096;
                    if (i17 == 0) {
                        i16 |= 384;
                    } else if ((i2 & 384) == 0) {
                        i16 |= startRestartGroup.changed(z3) ? 256 : 128;
                        i18 = i3 & 8192;
                        if (i18 != 0) {
                            i16 |= 3072;
                        } else if ((i2 & 3072) == 0) {
                            i16 |= startRestartGroup.changed(f3) ? 2048 : 1024;
                            i19 = i3 & 16384;
                            if (i19 == 0) {
                                i16 |= 24576;
                                i20 = i19;
                            } else {
                                i20 = i19;
                                if ((i2 & 24576) == 0) {
                                    i16 |= startRestartGroup.changedInstance(function1) ? 16384 : 8192;
                                    i21 = i3 & 32768;
                                    if (i21 != 0) {
                                        i16 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                                    } else if ((i2 & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                        i16 |= startRestartGroup.changedInstance(function12) ? 131072 : 65536;
                                    }
                                    i22 = i3 & 65536;
                                    if (i22 != 0) {
                                        i16 |= 1572864;
                                    } else if ((i2 & 1572864) == 0) {
                                        i16 |= startRestartGroup.changedInstance(function13) ? 1048576 : 524288;
                                    }
                                    i23 = i3 & 131072;
                                    if (i23 != 0) {
                                        i16 |= 12582912;
                                    } else if ((i2 & 12582912) == 0) {
                                        i16 |= startRestartGroup.changedInstance(function14) ? 8388608 : 4194304;
                                    }
                                    i24 = i3 & 262144;
                                    if (i24 != 0) {
                                        i16 |= 100663296;
                                    } else if ((i2 & 100663296) == 0) {
                                        i16 |= startRestartGroup.changedInstance(function3) ? 67108864 : 33554432;
                                    }
                                    if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (38347923 & i16) != 38347922, i4 & 1)) {
                                        startRestartGroup.startDefaults();
                                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                            startRestartGroup.skipToGroupEnd();
                                            if ((i3 & 1) != 0) {
                                                i4 &= -15;
                                            }
                                            markerState2 = markerState;
                                            f4 = f;
                                            z7 = z;
                                            str7 = str;
                                            z9 = z2;
                                            bitmapDescriptor3 = bitmapDescriptor;
                                            j6 = j2;
                                            f9 = f2;
                                            str9 = str2;
                                            obj4 = obj;
                                            str8 = str3;
                                            z8 = z3;
                                            f8 = f3;
                                            function118 = function1;
                                            function115 = function12;
                                            function116 = function13;
                                            function117 = function14;
                                            function33 = function3;
                                            i26 = i4;
                                        } else {
                                            if ((i3 & 1) != 0) {
                                                markerState3 = rememberUpdatedMarkerState(null, startRestartGroup, 0, 1);
                                                i4 &= -15;
                                            } else {
                                                markerState3 = markerState;
                                            }
                                            float f10 = i28 != 0 ? 1.0f : f;
                                            long m5744constructorimpl = i5 != 0 ? androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(0.5f) << 32) | (java.lang.Float.floatToRawIntBits(1.0f) & 4294967295L)) : j;
                                            z7 = i6 != 0 ? false : z;
                                            str7 = i7 != 0 ? "" : str;
                                            boolean z10 = i8 != 0 ? false : z2;
                                            bitmapDescriptor3 = i9 != 0 ? null : bitmapDescriptor;
                                            if (i10 != 0) {
                                                i25 = i4;
                                                f7 = f10;
                                                j = m5744constructorimpl;
                                                j5 = androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(0.5f) << 32) | (java.lang.Float.floatToRawIntBits(0.0f) & 4294967295L));
                                            } else {
                                                i25 = i4;
                                                f7 = f10;
                                                j = m5744constructorimpl;
                                                j5 = j2;
                                            }
                                            float f11 = i11 != 0 ? 0.0f : f2;
                                            java.lang.String str10 = i12 != 0 ? null : str2;
                                            java.lang.Object obj6 = i13 != 0 ? null : obj;
                                            java.lang.String str11 = i15 != 0 ? null : str3;
                                            boolean z11 = i17 != 0 ? true : z3;
                                            float f12 = i18 != 0 ? 0.0f : f3;
                                            if (i20 != 0) {
                                                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                                                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda36
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final java.lang.Object invoke(java.lang.Object obj7) {
                                                            boolean MarkerInfoWindow_jYtn1XM$lambda$0$0;
                                                            MarkerInfoWindow_jYtn1XM$lambda$0$0 = com.google.maps.android.compose.MarkerKt.MarkerInfoWindow_jYtn1XM$lambda$0$0((com.google.android.gms.maps.model.Marker) obj7);
                                                            return java.lang.Boolean.valueOf(MarkerInfoWindow_jYtn1XM$lambda$0$0);
                                                        }
                                                    };
                                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                                }
                                                function19 = (kotlin.jvm.functions.Function1) rememberedValue;
                                            } else {
                                                function19 = function1;
                                            }
                                            if (i21 != 0) {
                                                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                                                obj3 = obj6;
                                                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                    rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda37
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final java.lang.Object invoke(java.lang.Object obj7) {
                                                            kotlin.Unit MarkerInfoWindow_jYtn1XM$lambda$1$0;
                                                            MarkerInfoWindow_jYtn1XM$lambda$1$0 = com.google.maps.android.compose.MarkerKt.MarkerInfoWindow_jYtn1XM$lambda$1$0((com.google.android.gms.maps.model.Marker) obj7);
                                                            return MarkerInfoWindow_jYtn1XM$lambda$1$0;
                                                        }
                                                    };
                                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                                }
                                                function110 = (kotlin.jvm.functions.Function1) rememberedValue2;
                                            } else {
                                                obj3 = obj6;
                                                function110 = function12;
                                            }
                                            if (i22 != 0) {
                                                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                                                function111 = function110;
                                                if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                    rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda38
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final java.lang.Object invoke(java.lang.Object obj7) {
                                                            kotlin.Unit MarkerInfoWindow_jYtn1XM$lambda$2$0;
                                                            MarkerInfoWindow_jYtn1XM$lambda$2$0 = com.google.maps.android.compose.MarkerKt.MarkerInfoWindow_jYtn1XM$lambda$2$0((com.google.android.gms.maps.model.Marker) obj7);
                                                            return MarkerInfoWindow_jYtn1XM$lambda$2$0;
                                                        }
                                                    };
                                                    startRestartGroup.updateRememberedValue(rememberedValue3);
                                                }
                                                function112 = (kotlin.jvm.functions.Function1) rememberedValue3;
                                            } else {
                                                function111 = function110;
                                                function112 = function13;
                                            }
                                            if (i23 != 0) {
                                                java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                                                function113 = function112;
                                                if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                    rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda39
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final java.lang.Object invoke(java.lang.Object obj7) {
                                                            kotlin.Unit MarkerInfoWindow_jYtn1XM$lambda$3$0;
                                                            MarkerInfoWindow_jYtn1XM$lambda$3$0 = com.google.maps.android.compose.MarkerKt.MarkerInfoWindow_jYtn1XM$lambda$3$0((com.google.android.gms.maps.model.Marker) obj7);
                                                            return MarkerInfoWindow_jYtn1XM$lambda$3$0;
                                                        }
                                                    };
                                                    startRestartGroup.updateRememberedValue(rememberedValue4);
                                                }
                                                function114 = (kotlin.jvm.functions.Function1) rememberedValue4;
                                            } else {
                                                function113 = function112;
                                                function114 = function14;
                                            }
                                            i26 = i25;
                                            obj4 = obj3;
                                            function115 = function111;
                                            function116 = function113;
                                            function117 = function114;
                                            str8 = str11;
                                            z8 = z11;
                                            f8 = f12;
                                            function118 = function19;
                                            markerState2 = markerState3;
                                            function33 = i24 != 0 ? null : function3;
                                            str9 = str10;
                                            f9 = f11;
                                            j6 = j5;
                                            z9 = z10;
                                            f4 = f7;
                                        }
                                        j3 = j;
                                        startRestartGroup.endDefaults();
                                        composer2 = startRestartGroup;
                                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                            obj5 = obj4;
                                            androidx.compose.runtime.ComposerKt.traceEventStart(1121562626, i26, i16, "com.google.maps.android.compose.MarkerInfoWindow (Marker.kt:415)");
                                        } else {
                                            obj5 = obj4;
                                        }
                                        int i29 = i26 << 3;
                                        java.lang.String str12 = str9;
                                        m10528MarkerImplkhPtz74(markerState2, str7, f4, j3, z7, z9, bitmapDescriptor3, j6, f9, str12, obj5, str8, z8, f8, function118, function115, function116, function117, function33, null, composer2, (i29 & 57344) | (i29 & 7168) | (i29 & 896) | (i26 & 14) | ((i26 >> 9) & 112) | (458752 & i26) | (3670016 & i26) | (29360128 & i26) | (234881024 & i26) | (1879048192 & i26), i16 & 268435454, 524288);
                                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                                        }
                                        obj2 = obj5;
                                        str5 = str12;
                                        f5 = f9;
                                        bitmapDescriptor2 = bitmapDescriptor3;
                                        z6 = z8;
                                        f6 = f8;
                                        function15 = function118;
                                        function16 = function115;
                                        function17 = function116;
                                        function18 = function117;
                                        function32 = function33;
                                        long j7 = j6;
                                        z5 = z9;
                                        z4 = z7;
                                        str4 = str7;
                                        str6 = str8;
                                        j4 = j7;
                                    } else {
                                        composer2 = startRestartGroup;
                                        composer2.skipToGroupEnd();
                                        markerState2 = markerState;
                                        f4 = f;
                                        j3 = j;
                                        z4 = z;
                                        str4 = str;
                                        z5 = z2;
                                        bitmapDescriptor2 = bitmapDescriptor;
                                        j4 = j2;
                                        f5 = f2;
                                        str5 = str2;
                                        obj2 = obj;
                                        str6 = str3;
                                        z6 = z3;
                                        f6 = f3;
                                        function15 = function1;
                                        function16 = function12;
                                        function17 = function13;
                                        function18 = function14;
                                        function32 = function3;
                                    }
                                    endRestartGroup = composer2.endRestartGroup();
                                    if (endRestartGroup != null) {
                                        final boolean z12 = z6;
                                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda40
                                            @Override // kotlin.jvm.functions.Function2
                                            public final java.lang.Object invoke(java.lang.Object obj7, java.lang.Object obj8) {
                                                kotlin.Unit MarkerInfoWindow_jYtn1XM$lambda$4;
                                                MarkerInfoWindow_jYtn1XM$lambda$4 = com.google.maps.android.compose.MarkerKt.MarkerInfoWindow_jYtn1XM$lambda$4(com.google.maps.android.compose.MarkerState.this, f4, j3, z4, str4, z5, bitmapDescriptor2, j4, f5, str5, obj2, str6, z12, f6, function15, function16, function17, function18, function32, i, i2, i3, (androidx.compose.runtime.Composer) obj7, ((java.lang.Integer) obj8).intValue());
                                                return MarkerInfoWindow_jYtn1XM$lambda$4;
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                            }
                            i21 = i3 & 32768;
                            if (i21 != 0) {
                            }
                            i22 = i3 & 65536;
                            if (i22 != 0) {
                            }
                            i23 = i3 & 131072;
                            if (i23 != 0) {
                            }
                            i24 = i3 & 262144;
                            if (i24 != 0) {
                            }
                            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (38347923 & i16) != 38347922, i4 & 1)) {
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        i19 = i3 & 16384;
                        if (i19 == 0) {
                        }
                        i21 = i3 & 32768;
                        if (i21 != 0) {
                        }
                        i22 = i3 & 65536;
                        if (i22 != 0) {
                        }
                        i23 = i3 & 131072;
                        if (i23 != 0) {
                        }
                        i24 = i3 & 262144;
                        if (i24 != 0) {
                        }
                        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (38347923 & i16) != 38347922, i4 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i18 = i3 & 8192;
                    if (i18 != 0) {
                    }
                    i19 = i3 & 16384;
                    if (i19 == 0) {
                    }
                    i21 = i3 & 32768;
                    if (i21 != 0) {
                    }
                    i22 = i3 & 65536;
                    if (i22 != 0) {
                    }
                    i23 = i3 & 131072;
                    if (i23 != 0) {
                    }
                    i24 = i3 & 262144;
                    if (i24 != 0) {
                    }
                    if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (38347923 & i16) != 38347922, i4 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i8 = i3 & 32;
                if (i8 == 0) {
                }
                i9 = i3 & 64;
                if (i9 == 0) {
                }
                i10 = i3 & 128;
                if (i10 == 0) {
                }
                i11 = i3 & 256;
                if (i11 == 0) {
                }
                i12 = i3 & 512;
                if (i12 == 0) {
                }
                i13 = i3 & 1024;
                if (i13 == 0) {
                }
                i15 = i3 & 2048;
                if (i15 == 0) {
                }
                i16 = i14;
                i17 = i3 & 4096;
                if (i17 == 0) {
                }
                i18 = i3 & 8192;
                if (i18 != 0) {
                }
                i19 = i3 & 16384;
                if (i19 == 0) {
                }
                i21 = i3 & 32768;
                if (i21 != 0) {
                }
                i22 = i3 & 65536;
                if (i22 != 0) {
                }
                i23 = i3 & 131072;
                if (i23 != 0) {
                }
                i24 = i3 & 262144;
                if (i24 != 0) {
                }
                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (38347923 & i16) != 38347922, i4 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i7 = i3 & 16;
            if (i7 != 0) {
            }
            i8 = i3 & 32;
            if (i8 == 0) {
            }
            i9 = i3 & 64;
            if (i9 == 0) {
            }
            i10 = i3 & 128;
            if (i10 == 0) {
            }
            i11 = i3 & 256;
            if (i11 == 0) {
            }
            i12 = i3 & 512;
            if (i12 == 0) {
            }
            i13 = i3 & 1024;
            if (i13 == 0) {
            }
            i15 = i3 & 2048;
            if (i15 == 0) {
            }
            i16 = i14;
            i17 = i3 & 4096;
            if (i17 == 0) {
            }
            i18 = i3 & 8192;
            if (i18 != 0) {
            }
            i19 = i3 & 16384;
            if (i19 == 0) {
            }
            i21 = i3 & 32768;
            if (i21 != 0) {
            }
            i22 = i3 & 65536;
            if (i22 != 0) {
            }
            i23 = i3 & 131072;
            if (i23 != 0) {
            }
            i24 = i3 & 262144;
            if (i24 != 0) {
            }
            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (38347923 & i16) != 38347922, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        i6 = i3 & 8;
        if (i6 == 0) {
        }
        i7 = i3 & 16;
        if (i7 != 0) {
        }
        i8 = i3 & 32;
        if (i8 == 0) {
        }
        i9 = i3 & 64;
        if (i9 == 0) {
        }
        i10 = i3 & 128;
        if (i10 == 0) {
        }
        i11 = i3 & 256;
        if (i11 == 0) {
        }
        i12 = i3 & 512;
        if (i12 == 0) {
        }
        i13 = i3 & 1024;
        if (i13 == 0) {
        }
        i15 = i3 & 2048;
        if (i15 == 0) {
        }
        i16 = i14;
        i17 = i3 & 4096;
        if (i17 == 0) {
        }
        i18 = i3 & 8192;
        if (i18 != 0) {
        }
        i19 = i3 & 16384;
        if (i19 == 0) {
        }
        i21 = i3 & 32768;
        if (i21 != 0) {
        }
        i22 = i3 & 65536;
        if (i22 != 0) {
        }
        i23 = i3 & 131072;
        if (i23 != 0) {
        }
        i24 = i3 & 262144;
        if (i24 != 0) {
        }
        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (38347923 & i16) != 38347922, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit MarkerInfoWindowComposable_LZmgDss$lambda$1$0(com.google.android.gms.maps.model.Marker marker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(marker, "");
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit MarkerInfoWindowComposable_LZmgDss$lambda$2$0(com.google.android.gms.maps.model.Marker marker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(marker, "");
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit MarkerInfoWindowComposable_LZmgDss$lambda$3$0(com.google.android.gms.maps.model.Marker marker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(marker, "");
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0292  */
    /* renamed from: MarkerInfoWindowComposable-LZmgDss, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m10530MarkerInfoWindowComposableLZmgDss(final java.lang.Object[] objArr, com.google.maps.android.compose.MarkerState markerState, float f, long j, boolean z, boolean z2, long j2, float f2, java.lang.String str, java.lang.Object obj, java.lang.String str2, boolean z3, float f3, kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, java.lang.Boolean> function1, kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function12, kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function13, kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function14, kotlin.jvm.functions.Function3<? super com.google.android.gms.maps.model.Marker, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int length;
        int i27;
        int i28;
        final com.google.maps.android.compose.MarkerState markerState2;
        final float f4;
        final long j3;
        final boolean z4;
        final boolean z5;
        final long j4;
        final float f5;
        final java.lang.String str3;
        final java.lang.Object obj2;
        final java.lang.String str4;
        final boolean z6;
        final float f6;
        final kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, java.lang.Boolean> function15;
        final kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function16;
        final kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function17;
        final kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function18;
        final kotlin.jvm.functions.Function3<? super com.google.android.gms.maps.model.Marker, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function32;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        com.google.maps.android.compose.MarkerState markerState3;
        boolean z7;
        boolean z8;
        int i29;
        float f7;
        long j5;
        long j6;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, java.lang.Boolean> function19;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function110;
        float f8;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function111;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function112;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function113;
        int i30;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function114;
        kotlin.jvm.functions.Function3<? super com.google.android.gms.maps.model.Marker, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function33;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function115;
        boolean z9;
        float f9;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, java.lang.Boolean> function116;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function117;
        java.lang.String str5;
        java.lang.Object obj3;
        long j7;
        java.lang.String str6;
        float f10;
        java.lang.Object obj4;
        java.lang.String str7;
        int i31;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(828699568);
        if ((i & 48) == 0) {
            if ((i3 & 2) == 0 && startRestartGroup.changed(markerState)) {
                i31 = 32;
                i4 = i31 | i;
            }
            i31 = 16;
            i4 = i31 | i;
        } else {
            i4 = i;
        }
        int i32 = i3 & 4;
        if (i32 != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= startRestartGroup.changed(f) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                i4 |= startRestartGroup.changed(j) ? 2048 : 1024;
            }
            i6 = i3 & 16;
            if (i6 == 0) {
                i4 |= 24576;
            } else if ((i & 24576) == 0) {
                i4 |= startRestartGroup.changed(z) ? 16384 : 8192;
                i7 = i3 & 32;
                if (i7 != 0) {
                    i4 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i4 |= startRestartGroup.changed(z2) ? 131072 : 65536;
                }
                i8 = i3 & 64;
                if (i8 != 0) {
                    i9 = i4 | 1572864;
                } else {
                    i9 = i4;
                    if ((i & 1572864) == 0) {
                        i9 |= startRestartGroup.changed(j2) ? 1048576 : 524288;
                    }
                }
                i10 = i3 & 128;
                if (i10 != 0) {
                    i9 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i9 |= startRestartGroup.changed(f2) ? 8388608 : 4194304;
                }
                i11 = i3 & 256;
                if (i11 != 0) {
                    i9 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i12 = i9 | (startRestartGroup.changed(str) ? 67108864 : 33554432);
                    i13 = i3 & 512;
                    if (i13 == 0) {
                        i12 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        i12 |= startRestartGroup.changedInstance(obj) ? 536870912 : 268435456;
                    }
                    i14 = i3 & 1024;
                    if (i14 == 0) {
                        i15 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        i15 = i2 | (startRestartGroup.changed(str2) ? 4 : 2);
                    } else {
                        i15 = i2;
                    }
                    i16 = i3 & 2048;
                    if (i16 == 0) {
                        i15 |= 48;
                    } else if ((i2 & 48) == 0) {
                        i15 |= startRestartGroup.changed(z3) ? 32 : 16;
                    }
                    i17 = i15;
                    i18 = i3 & 4096;
                    if (i18 == 0) {
                        i17 |= 384;
                        i19 = i18;
                    } else {
                        i19 = i18;
                        if ((i2 & 384) == 0) {
                            i17 |= startRestartGroup.changed(f3) ? 256 : 128;
                            i20 = i3 & 8192;
                            if (i20 != 0) {
                                i17 |= 3072;
                                i21 = i20;
                            } else {
                                i21 = i20;
                                if ((i2 & 3072) == 0) {
                                    i17 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
                                    i22 = i3 & 16384;
                                    if (i22 == 0) {
                                        i17 |= 24576;
                                        i23 = i22;
                                    } else {
                                        i23 = i22;
                                        if ((i2 & 24576) == 0) {
                                            i17 |= startRestartGroup.changedInstance(function12) ? 16384 : 8192;
                                            i24 = i3 & 32768;
                                            if (i24 != 0) {
                                                i17 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                                            } else if ((i2 & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                                i17 |= startRestartGroup.changedInstance(function13) ? 131072 : 65536;
                                            }
                                            i25 = i3 & 65536;
                                            if (i25 != 0) {
                                                i17 |= 1572864;
                                            } else if ((i2 & 1572864) == 0) {
                                                i17 |= startRestartGroup.changedInstance(function14) ? 1048576 : 524288;
                                            }
                                            i26 = i3 & 131072;
                                            if (i26 != 0) {
                                                i17 |= 12582912;
                                            } else if ((i2 & 12582912) == 0) {
                                                i17 |= startRestartGroup.changedInstance(function3) ? 8388608 : 4194304;
                                            }
                                            if ((i2 & 100663296) == 0) {
                                                i17 |= startRestartGroup.changedInstance(function2) ? 67108864 : 33554432;
                                            }
                                            startRestartGroup.startMovableGroup(1811336256, java.lang.Integer.valueOf(objArr.length));
                                            int i33 = startRestartGroup.changed(objArr.length) ? 4 : 0;
                                            length = objArr.length;
                                            i27 = i12 | i33;
                                            i28 = 0;
                                            while (i28 < length) {
                                                int i34 = length;
                                                i27 |= startRestartGroup.changedInstance(objArr[i28]) ? 4 : 0;
                                                i28++;
                                                length = i34;
                                            }
                                            startRestartGroup.endMovableGroup();
                                            if ((i27 & 14) == 0) {
                                                i27 |= 2;
                                            }
                                            if (!startRestartGroup.shouldExecute((306783379 & i27) == 306783378 || (38347923 & i17) != 38347922, i27 & 1)) {
                                                startRestartGroup.skipToGroupEnd();
                                                markerState2 = markerState;
                                                f4 = f;
                                                j3 = j;
                                                z4 = z;
                                                z5 = z2;
                                                j4 = j2;
                                                f5 = f2;
                                                str3 = str;
                                                obj2 = obj;
                                                str4 = str2;
                                                z6 = z3;
                                                f6 = f3;
                                                function15 = function1;
                                                function16 = function12;
                                                function17 = function13;
                                                function18 = function14;
                                                function32 = function3;
                                            } else {
                                                startRestartGroup.startDefaults();
                                                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                                    startRestartGroup.skipToGroupEnd();
                                                    if ((i3 & 2) != 0) {
                                                        i27 &= -113;
                                                    }
                                                    markerState2 = markerState;
                                                    f4 = f;
                                                    z7 = z;
                                                    z8 = z2;
                                                    j7 = j2;
                                                    f10 = f2;
                                                    str5 = str;
                                                    obj3 = obj;
                                                    str6 = str2;
                                                    z9 = z3;
                                                    f9 = f3;
                                                    function116 = function1;
                                                    function117 = function12;
                                                    function114 = function13;
                                                    function115 = function14;
                                                    function33 = function3;
                                                    i30 = i27;
                                                    j3 = j;
                                                } else {
                                                    if ((i3 & 2) != 0) {
                                                        markerState3 = rememberUpdatedMarkerState(null, startRestartGroup, 0, 1);
                                                        i27 &= -113;
                                                    } else {
                                                        markerState3 = markerState;
                                                    }
                                                    float f11 = i32 != 0 ? 1.0f : f;
                                                    long m5744constructorimpl = i5 != 0 ? androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(0.5f) << 32) | (java.lang.Float.floatToRawIntBits(1.0f) & 4294967295L)) : j;
                                                    z7 = i6 != 0 ? false : z;
                                                    z8 = i7 != 0 ? false : z2;
                                                    if (i8 != 0) {
                                                        i29 = i27;
                                                        f7 = f11;
                                                        j5 = m5744constructorimpl;
                                                        j6 = androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(0.5f) << 32) | (java.lang.Float.floatToRawIntBits(0.0f) & 4294967295L));
                                                    } else {
                                                        i29 = i27;
                                                        f7 = f11;
                                                        j5 = m5744constructorimpl;
                                                        j6 = j2;
                                                    }
                                                    float f12 = i10 != 0 ? 0.0f : f2;
                                                    java.lang.String str8 = i11 != 0 ? null : str;
                                                    java.lang.Object obj5 = i13 != 0 ? null : obj;
                                                    java.lang.String str9 = i14 != 0 ? null : str2;
                                                    boolean z10 = i16 != 0 ? true : z3;
                                                    float f13 = i19 != 0 ? 0.0f : f3;
                                                    if (i21 != 0) {
                                                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                                                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda0
                                                                @Override // kotlin.jvm.functions.Function1
                                                                public final java.lang.Object invoke(java.lang.Object obj6) {
                                                                    boolean MarkerInfoWindowComposable_LZmgDss$lambda$0$0;
                                                                    MarkerInfoWindowComposable_LZmgDss$lambda$0$0 = com.google.maps.android.compose.MarkerKt.MarkerInfoWindowComposable_LZmgDss$lambda$0$0((com.google.android.gms.maps.model.Marker) obj6);
                                                                    return java.lang.Boolean.valueOf(MarkerInfoWindowComposable_LZmgDss$lambda$0$0);
                                                                }
                                                            };
                                                            startRestartGroup.updateRememberedValue(rememberedValue);
                                                        }
                                                        function19 = (kotlin.jvm.functions.Function1) rememberedValue;
                                                    } else {
                                                        function19 = function1;
                                                    }
                                                    if (i23 != 0) {
                                                        java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                                                        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                            rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda11
                                                                @Override // kotlin.jvm.functions.Function1
                                                                public final java.lang.Object invoke(java.lang.Object obj6) {
                                                                    kotlin.Unit MarkerInfoWindowComposable_LZmgDss$lambda$1$0;
                                                                    MarkerInfoWindowComposable_LZmgDss$lambda$1$0 = com.google.maps.android.compose.MarkerKt.MarkerInfoWindowComposable_LZmgDss$lambda$1$0((com.google.android.gms.maps.model.Marker) obj6);
                                                                    return MarkerInfoWindowComposable_LZmgDss$lambda$1$0;
                                                                }
                                                            };
                                                            startRestartGroup.updateRememberedValue(rememberedValue2);
                                                        }
                                                        function110 = (kotlin.jvm.functions.Function1) rememberedValue2;
                                                    } else {
                                                        function110 = function12;
                                                    }
                                                    if (i24 != 0) {
                                                        java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                                                        f8 = f12;
                                                        if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                            rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda22
                                                                @Override // kotlin.jvm.functions.Function1
                                                                public final java.lang.Object invoke(java.lang.Object obj6) {
                                                                    kotlin.Unit MarkerInfoWindowComposable_LZmgDss$lambda$2$0;
                                                                    MarkerInfoWindowComposable_LZmgDss$lambda$2$0 = com.google.maps.android.compose.MarkerKt.MarkerInfoWindowComposable_LZmgDss$lambda$2$0((com.google.android.gms.maps.model.Marker) obj6);
                                                                    return MarkerInfoWindowComposable_LZmgDss$lambda$2$0;
                                                                }
                                                            };
                                                            startRestartGroup.updateRememberedValue(rememberedValue3);
                                                        }
                                                        function111 = (kotlin.jvm.functions.Function1) rememberedValue3;
                                                    } else {
                                                        f8 = f12;
                                                        function111 = function13;
                                                    }
                                                    if (i25 != 0) {
                                                        java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                                                        function112 = function111;
                                                        if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                            rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda33
                                                                @Override // kotlin.jvm.functions.Function1
                                                                public final java.lang.Object invoke(java.lang.Object obj6) {
                                                                    kotlin.Unit MarkerInfoWindowComposable_LZmgDss$lambda$3$0;
                                                                    MarkerInfoWindowComposable_LZmgDss$lambda$3$0 = com.google.maps.android.compose.MarkerKt.MarkerInfoWindowComposable_LZmgDss$lambda$3$0((com.google.android.gms.maps.model.Marker) obj6);
                                                                    return MarkerInfoWindowComposable_LZmgDss$lambda$3$0;
                                                                }
                                                            };
                                                            startRestartGroup.updateRememberedValue(rememberedValue4);
                                                        }
                                                        function113 = (kotlin.jvm.functions.Function1) rememberedValue4;
                                                    } else {
                                                        function112 = function111;
                                                        function113 = function14;
                                                    }
                                                    i30 = i29;
                                                    function114 = function112;
                                                    if (i26 != 0) {
                                                        function115 = function113;
                                                        z9 = z10;
                                                        f9 = f13;
                                                        function116 = function19;
                                                        function117 = function110;
                                                        markerState2 = markerState3;
                                                        function33 = null;
                                                    } else {
                                                        function33 = function3;
                                                        function115 = function113;
                                                        z9 = z10;
                                                        f9 = f13;
                                                        function116 = function19;
                                                        function117 = function110;
                                                        markerState2 = markerState3;
                                                    }
                                                    str5 = str8;
                                                    obj3 = obj5;
                                                    j7 = j6;
                                                    str6 = str9;
                                                    f4 = f7;
                                                    j3 = j5;
                                                    f10 = f8;
                                                }
                                                startRestartGroup.endDefaults();
                                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                    str7 = str6;
                                                    obj4 = obj3;
                                                    androidx.compose.runtime.ComposerKt.traceEventStart(828699568, i30, i17, "com.google.maps.android.compose.MarkerInfoWindowComposable (Marker.kt:489)");
                                                } else {
                                                    obj4 = obj3;
                                                    str7 = str6;
                                                }
                                                java.lang.String str10 = str5;
                                                float f14 = f10;
                                                int i35 = i30 << 3;
                                                int i36 = i17 << 3;
                                                m10528MarkerImplkhPtz74(markerState2, null, f4, j3, z7, z8, com.google.maps.android.compose.RememberComposeBitmapDescriptorKt.rememberComposeBitmapDescriptor(java.util.Arrays.copyOf(objArr, objArr.length), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(707101649, true, new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda44
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final java.lang.Object invoke(java.lang.Object obj6, java.lang.Object obj7) {
                                                        kotlin.Unit MarkerInfoWindowComposable_LZmgDss$lambda$4;
                                                        MarkerInfoWindowComposable_LZmgDss$lambda$4 = com.google.maps.android.compose.MarkerKt.MarkerInfoWindowComposable_LZmgDss$lambda$4(kotlin.jvm.functions.Function2.this, (androidx.compose.runtime.Composer) obj6, ((java.lang.Integer) obj7).intValue());
                                                        return MarkerInfoWindowComposable_LZmgDss$lambda$4;
                                                    }
                                                }, startRestartGroup, 54), startRestartGroup, 48), j7, f14, str10, obj4, str7, z9, f9, function116, function117, function114, function115, function33, null, startRestartGroup, ((i30 >> 3) & 14) | (i30 & 896) | (i30 & 7168) | (57344 & i30) | (458752 & i30) | (29360128 & i35) | (234881024 & i35) | (i35 & 1879048192), ((i30 >> 27) & 14) | (i36 & 112) | (i36 & 896) | (i36 & 7168) | (57344 & i36) | (458752 & i36) | (3670016 & i36) | (29360128 & i36) | (i36 & 234881024), 524290);
                                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                                }
                                                z6 = z9;
                                                str3 = str10;
                                                f5 = f14;
                                                j4 = j7;
                                                z4 = z7;
                                                z5 = z8;
                                                f6 = f9;
                                                function15 = function116;
                                                function16 = function117;
                                                function17 = function114;
                                                function18 = function115;
                                                function32 = function33;
                                                str4 = str7;
                                                obj2 = obj4;
                                            }
                                            endRestartGroup = startRestartGroup.endRestartGroup();
                                            if (endRestartGroup != null) {
                                                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda55
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final java.lang.Object invoke(java.lang.Object obj6, java.lang.Object obj7) {
                                                        kotlin.Unit MarkerInfoWindowComposable_LZmgDss$lambda$5;
                                                        MarkerInfoWindowComposable_LZmgDss$lambda$5 = com.google.maps.android.compose.MarkerKt.MarkerInfoWindowComposable_LZmgDss$lambda$5(objArr, markerState2, f4, j3, z4, z5, j4, f5, str3, obj2, str4, z6, f6, function15, function16, function17, function18, function32, function2, i, i2, i3, (androidx.compose.runtime.Composer) obj6, ((java.lang.Integer) obj7).intValue());
                                                        return MarkerInfoWindowComposable_LZmgDss$lambda$5;
                                                    }
                                                });
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                    i24 = i3 & 32768;
                                    if (i24 != 0) {
                                    }
                                    i25 = i3 & 65536;
                                    if (i25 != 0) {
                                    }
                                    i26 = i3 & 131072;
                                    if (i26 != 0) {
                                    }
                                    if ((i2 & 100663296) == 0) {
                                    }
                                    startRestartGroup.startMovableGroup(1811336256, java.lang.Integer.valueOf(objArr.length));
                                    if (startRestartGroup.changed(objArr.length)) {
                                    }
                                    length = objArr.length;
                                    i27 = i12 | i33;
                                    i28 = 0;
                                    while (i28 < length) {
                                    }
                                    startRestartGroup.endMovableGroup();
                                    if ((i27 & 14) == 0) {
                                    }
                                    if (!startRestartGroup.shouldExecute((306783379 & i27) == 306783378 || (38347923 & i17) != 38347922, i27 & 1)) {
                                    }
                                    endRestartGroup = startRestartGroup.endRestartGroup();
                                    if (endRestartGroup != null) {
                                    }
                                }
                            }
                            i22 = i3 & 16384;
                            if (i22 == 0) {
                            }
                            i24 = i3 & 32768;
                            if (i24 != 0) {
                            }
                            i25 = i3 & 65536;
                            if (i25 != 0) {
                            }
                            i26 = i3 & 131072;
                            if (i26 != 0) {
                            }
                            if ((i2 & 100663296) == 0) {
                            }
                            startRestartGroup.startMovableGroup(1811336256, java.lang.Integer.valueOf(objArr.length));
                            if (startRestartGroup.changed(objArr.length)) {
                            }
                            length = objArr.length;
                            i27 = i12 | i33;
                            i28 = 0;
                            while (i28 < length) {
                            }
                            startRestartGroup.endMovableGroup();
                            if ((i27 & 14) == 0) {
                            }
                            if (!startRestartGroup.shouldExecute((306783379 & i27) == 306783378 || (38347923 & i17) != 38347922, i27 & 1)) {
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                    }
                    i20 = i3 & 8192;
                    if (i20 != 0) {
                    }
                    i22 = i3 & 16384;
                    if (i22 == 0) {
                    }
                    i24 = i3 & 32768;
                    if (i24 != 0) {
                    }
                    i25 = i3 & 65536;
                    if (i25 != 0) {
                    }
                    i26 = i3 & 131072;
                    if (i26 != 0) {
                    }
                    if ((i2 & 100663296) == 0) {
                    }
                    startRestartGroup.startMovableGroup(1811336256, java.lang.Integer.valueOf(objArr.length));
                    if (startRestartGroup.changed(objArr.length)) {
                    }
                    length = objArr.length;
                    i27 = i12 | i33;
                    i28 = 0;
                    while (i28 < length) {
                    }
                    startRestartGroup.endMovableGroup();
                    if ((i27 & 14) == 0) {
                    }
                    if (!startRestartGroup.shouldExecute((306783379 & i27) == 306783378 || (38347923 & i17) != 38347922, i27 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i12 = i9;
                i13 = i3 & 512;
                if (i13 == 0) {
                }
                i14 = i3 & 1024;
                if (i14 == 0) {
                }
                i16 = i3 & 2048;
                if (i16 == 0) {
                }
                i17 = i15;
                i18 = i3 & 4096;
                if (i18 == 0) {
                }
                i20 = i3 & 8192;
                if (i20 != 0) {
                }
                i22 = i3 & 16384;
                if (i22 == 0) {
                }
                i24 = i3 & 32768;
                if (i24 != 0) {
                }
                i25 = i3 & 65536;
                if (i25 != 0) {
                }
                i26 = i3 & 131072;
                if (i26 != 0) {
                }
                if ((i2 & 100663296) == 0) {
                }
                startRestartGroup.startMovableGroup(1811336256, java.lang.Integer.valueOf(objArr.length));
                if (startRestartGroup.changed(objArr.length)) {
                }
                length = objArr.length;
                i27 = i12 | i33;
                i28 = 0;
                while (i28 < length) {
                }
                startRestartGroup.endMovableGroup();
                if ((i27 & 14) == 0) {
                }
                if (!startRestartGroup.shouldExecute((306783379 & i27) == 306783378 || (38347923 & i17) != 38347922, i27 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i7 = i3 & 32;
            if (i7 != 0) {
            }
            i8 = i3 & 64;
            if (i8 != 0) {
            }
            i10 = i3 & 128;
            if (i10 != 0) {
            }
            i11 = i3 & 256;
            if (i11 != 0) {
            }
            i12 = i9;
            i13 = i3 & 512;
            if (i13 == 0) {
            }
            i14 = i3 & 1024;
            if (i14 == 0) {
            }
            i16 = i3 & 2048;
            if (i16 == 0) {
            }
            i17 = i15;
            i18 = i3 & 4096;
            if (i18 == 0) {
            }
            i20 = i3 & 8192;
            if (i20 != 0) {
            }
            i22 = i3 & 16384;
            if (i22 == 0) {
            }
            i24 = i3 & 32768;
            if (i24 != 0) {
            }
            i25 = i3 & 65536;
            if (i25 != 0) {
            }
            i26 = i3 & 131072;
            if (i26 != 0) {
            }
            if ((i2 & 100663296) == 0) {
            }
            startRestartGroup.startMovableGroup(1811336256, java.lang.Integer.valueOf(objArr.length));
            if (startRestartGroup.changed(objArr.length)) {
            }
            length = objArr.length;
            i27 = i12 | i33;
            i28 = 0;
            while (i28 < length) {
            }
            startRestartGroup.endMovableGroup();
            if ((i27 & 14) == 0) {
            }
            if (!startRestartGroup.shouldExecute((306783379 & i27) == 306783378 || (38347923 & i17) != 38347922, i27 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        i6 = i3 & 16;
        if (i6 == 0) {
        }
        i7 = i3 & 32;
        if (i7 != 0) {
        }
        i8 = i3 & 64;
        if (i8 != 0) {
        }
        i10 = i3 & 128;
        if (i10 != 0) {
        }
        i11 = i3 & 256;
        if (i11 != 0) {
        }
        i12 = i9;
        i13 = i3 & 512;
        if (i13 == 0) {
        }
        i14 = i3 & 1024;
        if (i14 == 0) {
        }
        i16 = i3 & 2048;
        if (i16 == 0) {
        }
        i17 = i15;
        i18 = i3 & 4096;
        if (i18 == 0) {
        }
        i20 = i3 & 8192;
        if (i20 != 0) {
        }
        i22 = i3 & 16384;
        if (i22 == 0) {
        }
        i24 = i3 & 32768;
        if (i24 != 0) {
        }
        i25 = i3 & 65536;
        if (i25 != 0) {
        }
        i26 = i3 & 131072;
        if (i26 != 0) {
        }
        if ((i2 & 100663296) == 0) {
        }
        startRestartGroup.startMovableGroup(1811336256, java.lang.Integer.valueOf(objArr.length));
        if (startRestartGroup.changed(objArr.length)) {
        }
        length = objArr.length;
        i27 = i12 | i33;
        i28 = 0;
        while (i28 < length) {
        }
        startRestartGroup.endMovableGroup();
        if ((i27 & 14) == 0) {
        }
        if (!startRestartGroup.shouldExecute((306783379 & i27) == 306783378 || (38347923 & i17) != 38347922, i27 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit MarkerInfoWindowComposable_LZmgDss$lambda$4(kotlin.jvm.functions.Function2 function2, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(707101649, i, -1, "com.google.maps.android.compose.MarkerInfoWindowComposable.<anonymous> (Marker.kt:490)");
            }
            function2.invoke(composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit MarkerInfoWindowContent_dVEpkwM$lambda$1$0(com.google.android.gms.maps.model.Marker marker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(marker, "");
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit MarkerInfoWindowContent_dVEpkwM$lambda$2$0(com.google.android.gms.maps.model.Marker marker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(marker, "");
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit MarkerInfoWindowContent_dVEpkwM$lambda$3$0(com.google.android.gms.maps.model.Marker marker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(marker, "");
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* renamed from: MarkerInfoWindowContent-dVEpkwM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m10531MarkerInfoWindowContentdVEpkwM(com.google.maps.android.compose.MarkerState markerState, float f, long j, boolean z, boolean z2, com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptor, long j2, float f2, java.lang.String str, java.lang.Object obj, java.lang.String str2, boolean z3, float f3, kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, java.lang.Boolean> function1, kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function12, kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function13, kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function14, kotlin.jvm.functions.Function3<? super com.google.android.gms.maps.model.Marker, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, androidx.compose.runtime.Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        androidx.compose.runtime.Composer composer2;
        final com.google.maps.android.compose.MarkerState markerState2;
        final float f4;
        final long j3;
        final boolean z4;
        final boolean z5;
        final com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptor2;
        final long j4;
        final float f5;
        final java.lang.String str3;
        final java.lang.Object obj2;
        final java.lang.String str4;
        final boolean z6;
        float f6;
        final kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, java.lang.Boolean> function15;
        final kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function16;
        final kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function17;
        final kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function18;
        final kotlin.jvm.functions.Function3<? super com.google.android.gms.maps.model.Marker, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function32;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        com.google.maps.android.compose.MarkerState markerState3;
        float f7;
        boolean z7;
        long j5;
        com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptor3;
        long j6;
        float f8;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, java.lang.Boolean> function19;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function110;
        java.lang.String str5;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function111;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function112;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function113;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function114;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function115;
        int i25;
        float f9;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, java.lang.Boolean> function116;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function117;
        kotlin.jvm.functions.Function3<? super com.google.android.gms.maps.model.Marker, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function33;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.Object obj3;
        boolean z8;
        long j7;
        boolean z9;
        com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptor4;
        java.lang.String str8;
        int i26;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(432328740);
        if ((i & 6) == 0) {
            if ((i3 & 1) == 0 && startRestartGroup.changed(markerState)) {
                i26 = 4;
                i4 = i26 | i;
            }
            i26 = 2;
            i4 = i26 | i;
        } else {
            i4 = i;
        }
        int i27 = i3 & 2;
        if (i27 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= startRestartGroup.changed(f) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i & 384) == 0) {
                i4 |= startRestartGroup.changed(j) ? 256 : 128;
            }
            i6 = i3 & 8;
            if (i6 == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                i4 |= startRestartGroup.changed(z) ? 2048 : 1024;
                i7 = i3 & 16;
                if (i7 != 0) {
                    i4 |= 24576;
                } else if ((i & 24576) == 0) {
                    i4 |= startRestartGroup.changed(z2) ? 16384 : 8192;
                    i8 = i3 & 32;
                    if (i8 == 0) {
                        i4 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i4 |= startRestartGroup.changed(bitmapDescriptor) ? 131072 : 65536;
                    }
                    i9 = i3 & 64;
                    if (i9 == 0) {
                        i4 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i4 |= startRestartGroup.changed(j2) ? 1048576 : 524288;
                    }
                    i10 = i3 & 128;
                    if (i10 == 0) {
                        i4 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i4 |= startRestartGroup.changed(f2) ? 8388608 : 4194304;
                    }
                    i11 = i3 & 256;
                    if (i11 == 0) {
                        i4 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i12 = (startRestartGroup.changed(str) ? 67108864 : 33554432) | i4;
                        i13 = i3 & 512;
                        if (i13 != 0) {
                            i12 |= 805306368;
                        } else if ((i & 805306368) == 0) {
                            i12 |= startRestartGroup.changedInstance(obj) ? 536870912 : 268435456;
                        }
                        i14 = i3 & 1024;
                        if (i14 != 0) {
                            i15 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            i15 = i2 | (startRestartGroup.changed(str2) ? 4 : 2);
                        } else {
                            i15 = i2;
                        }
                        i16 = i3 & 2048;
                        if (i16 != 0) {
                            i15 |= 48;
                        } else if ((i2 & 48) == 0) {
                            i15 |= startRestartGroup.changed(z3) ? 32 : 16;
                        }
                        i17 = i15;
                        i18 = i3 & 4096;
                        if (i18 != 0) {
                            i17 |= 384;
                        } else if ((i2 & 384) == 0) {
                            i17 |= startRestartGroup.changed(f3) ? 256 : 128;
                            i19 = i3 & 8192;
                            if (i19 == 0) {
                                i17 |= 3072;
                            } else if ((i2 & 3072) == 0) {
                                i17 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
                                i20 = i3 & 16384;
                                if (i20 != 0) {
                                    i17 |= 24576;
                                    i21 = i20;
                                } else {
                                    i21 = i20;
                                    if ((i2 & 24576) == 0) {
                                        i17 |= startRestartGroup.changedInstance(function12) ? 16384 : 8192;
                                        i22 = i3 & 32768;
                                        if (i22 == 0) {
                                            i17 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                                        } else if ((i2 & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                            i17 |= startRestartGroup.changedInstance(function13) ? 131072 : 65536;
                                        }
                                        i23 = i3 & 65536;
                                        if (i23 == 0) {
                                            i17 |= 1572864;
                                        } else if ((i2 & 1572864) == 0) {
                                            i17 |= startRestartGroup.changedInstance(function14) ? 1048576 : 524288;
                                        }
                                        i24 = i3 & 131072;
                                        if (i24 == 0) {
                                            i17 |= 12582912;
                                        } else if ((i2 & 12582912) == 0) {
                                            i17 |= startRestartGroup.changedInstance(function3) ? 8388608 : 4194304;
                                        }
                                        if (!startRestartGroup.shouldExecute((i12 & 306783379) == 306783378 || (4793491 & i17) != 4793490, i12 & 1)) {
                                            startRestartGroup.startDefaults();
                                            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                                startRestartGroup.skipToGroupEnd();
                                                if ((i3 & 1) != 0) {
                                                    i12 &= -15;
                                                }
                                                markerState2 = markerState;
                                                f7 = f;
                                                z7 = z;
                                                z8 = z2;
                                                bitmapDescriptor4 = bitmapDescriptor;
                                                j6 = j2;
                                                f8 = f2;
                                                str6 = str;
                                                obj3 = obj;
                                                str7 = str2;
                                                z9 = z3;
                                                f9 = f3;
                                                function116 = function1;
                                                function117 = function12;
                                                function114 = function13;
                                                function115 = function14;
                                                function33 = function3;
                                                i25 = i12;
                                                j7 = j;
                                            } else {
                                                if ((i3 & 1) != 0) {
                                                    markerState3 = rememberUpdatedMarkerState(null, startRestartGroup, 0, 1);
                                                    i12 &= -15;
                                                } else {
                                                    markerState3 = markerState;
                                                }
                                                f7 = i27 != 0 ? 1.0f : f;
                                                long m5744constructorimpl = i5 != 0 ? androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(0.5f) << 32) | (java.lang.Float.floatToRawIntBits(1.0f) & 4294967295L)) : j;
                                                z7 = i6 != 0 ? false : z;
                                                boolean z10 = i7 != 0 ? false : z2;
                                                com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptor5 = i8 != 0 ? null : bitmapDescriptor;
                                                if (i9 != 0) {
                                                    j5 = m5744constructorimpl;
                                                    bitmapDescriptor3 = bitmapDescriptor5;
                                                    j6 = androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(0.5f) << 32) | (java.lang.Float.floatToRawIntBits(0.0f) & 4294967295L));
                                                } else {
                                                    j5 = m5744constructorimpl;
                                                    bitmapDescriptor3 = bitmapDescriptor5;
                                                    j6 = j2;
                                                }
                                                f8 = i10 != 0 ? 0.0f : f2;
                                                java.lang.String str9 = i11 != 0 ? null : str;
                                                java.lang.Object obj4 = i13 != 0 ? null : obj;
                                                java.lang.String str10 = i14 != 0 ? null : str2;
                                                boolean z11 = i16 != 0 ? true : z3;
                                                float f10 = i18 != 0 ? 0.0f : f3;
                                                if (i19 != 0) {
                                                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                                                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                        rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda66
                                                            @Override // kotlin.jvm.functions.Function1
                                                            public final java.lang.Object invoke(java.lang.Object obj5) {
                                                                boolean MarkerInfoWindowContent_dVEpkwM$lambda$0$0;
                                                                MarkerInfoWindowContent_dVEpkwM$lambda$0$0 = com.google.maps.android.compose.MarkerKt.MarkerInfoWindowContent_dVEpkwM$lambda$0$0((com.google.android.gms.maps.model.Marker) obj5);
                                                                return java.lang.Boolean.valueOf(MarkerInfoWindowContent_dVEpkwM$lambda$0$0);
                                                            }
                                                        };
                                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                                    }
                                                    function19 = (kotlin.jvm.functions.Function1) rememberedValue;
                                                } else {
                                                    function19 = function1;
                                                }
                                                if (i21 != 0) {
                                                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                                                    if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                        rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda77
                                                            @Override // kotlin.jvm.functions.Function1
                                                            public final java.lang.Object invoke(java.lang.Object obj5) {
                                                                kotlin.Unit MarkerInfoWindowContent_dVEpkwM$lambda$1$0;
                                                                MarkerInfoWindowContent_dVEpkwM$lambda$1$0 = com.google.maps.android.compose.MarkerKt.MarkerInfoWindowContent_dVEpkwM$lambda$1$0((com.google.android.gms.maps.model.Marker) obj5);
                                                                return MarkerInfoWindowContent_dVEpkwM$lambda$1$0;
                                                            }
                                                        };
                                                        startRestartGroup.updateRememberedValue(rememberedValue2);
                                                    }
                                                    function110 = (kotlin.jvm.functions.Function1) rememberedValue2;
                                                } else {
                                                    function110 = function12;
                                                }
                                                if (i22 != 0) {
                                                    java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                                                    str5 = str9;
                                                    if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                        rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda82
                                                            @Override // kotlin.jvm.functions.Function1
                                                            public final java.lang.Object invoke(java.lang.Object obj5) {
                                                                kotlin.Unit MarkerInfoWindowContent_dVEpkwM$lambda$2$0;
                                                                MarkerInfoWindowContent_dVEpkwM$lambda$2$0 = com.google.maps.android.compose.MarkerKt.MarkerInfoWindowContent_dVEpkwM$lambda$2$0((com.google.android.gms.maps.model.Marker) obj5);
                                                                return MarkerInfoWindowContent_dVEpkwM$lambda$2$0;
                                                            }
                                                        };
                                                        startRestartGroup.updateRememberedValue(rememberedValue3);
                                                    }
                                                    function111 = (kotlin.jvm.functions.Function1) rememberedValue3;
                                                } else {
                                                    str5 = str9;
                                                    function111 = function13;
                                                }
                                                if (i23 != 0) {
                                                    java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                                                    function112 = function111;
                                                    if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                        rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda83
                                                            @Override // kotlin.jvm.functions.Function1
                                                            public final java.lang.Object invoke(java.lang.Object obj5) {
                                                                kotlin.Unit MarkerInfoWindowContent_dVEpkwM$lambda$3$0;
                                                                MarkerInfoWindowContent_dVEpkwM$lambda$3$0 = com.google.maps.android.compose.MarkerKt.MarkerInfoWindowContent_dVEpkwM$lambda$3$0((com.google.android.gms.maps.model.Marker) obj5);
                                                                return MarkerInfoWindowContent_dVEpkwM$lambda$3$0;
                                                            }
                                                        };
                                                        startRestartGroup.updateRememberedValue(rememberedValue4);
                                                    }
                                                    function113 = (kotlin.jvm.functions.Function1) rememberedValue4;
                                                } else {
                                                    function112 = function111;
                                                    function113 = function14;
                                                }
                                                function114 = function112;
                                                function115 = function113;
                                                i25 = i12;
                                                f9 = f10;
                                                function116 = function19;
                                                function117 = function110;
                                                markerState2 = markerState3;
                                                function33 = i24 != 0 ? null : function3;
                                                str6 = str5;
                                                str7 = str10;
                                                obj3 = obj4;
                                                z8 = z10;
                                                j7 = j5;
                                                z9 = z11;
                                                bitmapDescriptor4 = bitmapDescriptor3;
                                            }
                                            startRestartGroup.endDefaults();
                                            composer2 = startRestartGroup;
                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                str8 = str7;
                                                androidx.compose.runtime.ComposerKt.traceEventStart(432328740, i25, i17, "com.google.maps.android.compose.MarkerInfoWindowContent (Marker.kt:561)");
                                            } else {
                                                str8 = str7;
                                            }
                                            int i28 = i25 << 3;
                                            int i29 = i17 << 3;
                                            java.lang.Object obj5 = obj3;
                                            java.lang.String str11 = str6;
                                            m10528MarkerImplkhPtz74(markerState2, null, f7, j7, z7, z8, bitmapDescriptor4, j6, f8, str11, obj5, str8, z9, f9, function116, function117, function114, function115, null, function33, composer2, (i28 & 7168) | (i28 & 896) | (i25 & 14) | (57344 & i28) | (458752 & i28) | (3670016 & i28) | (29360128 & i28) | (234881024 & i28) | (i28 & 1879048192), ((i25 >> 27) & 14) | (i29 & 112) | (i29 & 896) | (i29 & 7168) | (57344 & i29) | (458752 & i29) | (3670016 & i29) | (29360128 & i29) | (1879048192 & (i17 << 6)), 262146);
                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                                            }
                                            z6 = z9;
                                            str4 = str8;
                                            bitmapDescriptor2 = bitmapDescriptor4;
                                            j4 = j6;
                                            f5 = f8;
                                            f6 = f9;
                                            function15 = function116;
                                            function16 = function117;
                                            function17 = function114;
                                            function18 = function115;
                                            function32 = function33;
                                            obj2 = obj5;
                                            z5 = z8;
                                            j3 = j7;
                                            f4 = f7;
                                            z4 = z7;
                                            str3 = str11;
                                        } else {
                                            composer2 = startRestartGroup;
                                            composer2.skipToGroupEnd();
                                            markerState2 = markerState;
                                            f4 = f;
                                            j3 = j;
                                            z4 = z;
                                            z5 = z2;
                                            bitmapDescriptor2 = bitmapDescriptor;
                                            j4 = j2;
                                            f5 = f2;
                                            str3 = str;
                                            obj2 = obj;
                                            str4 = str2;
                                            z6 = z3;
                                            f6 = f3;
                                            function15 = function1;
                                            function16 = function12;
                                            function17 = function13;
                                            function18 = function14;
                                            function32 = function3;
                                        }
                                        endRestartGroup = composer2.endRestartGroup();
                                        if (endRestartGroup == null) {
                                            final float f11 = f6;
                                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda1
                                                @Override // kotlin.jvm.functions.Function2
                                                public final java.lang.Object invoke(java.lang.Object obj6, java.lang.Object obj7) {
                                                    kotlin.Unit MarkerInfoWindowContent_dVEpkwM$lambda$4;
                                                    MarkerInfoWindowContent_dVEpkwM$lambda$4 = com.google.maps.android.compose.MarkerKt.MarkerInfoWindowContent_dVEpkwM$lambda$4(com.google.maps.android.compose.MarkerState.this, f4, j3, z4, z5, bitmapDescriptor2, j4, f5, str3, obj2, str4, z6, f11, function15, function16, function17, function18, function32, i, i2, i3, (androidx.compose.runtime.Composer) obj6, ((java.lang.Integer) obj7).intValue());
                                                    return MarkerInfoWindowContent_dVEpkwM$lambda$4;
                                                }
                                            });
                                            return;
                                        }
                                        return;
                                    }
                                }
                                i22 = i3 & 32768;
                                if (i22 == 0) {
                                }
                                i23 = i3 & 65536;
                                if (i23 == 0) {
                                }
                                i24 = i3 & 131072;
                                if (i24 == 0) {
                                }
                                if (!startRestartGroup.shouldExecute((i12 & 306783379) == 306783378 || (4793491 & i17) != 4793490, i12 & 1)) {
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup == null) {
                                }
                            }
                            i20 = i3 & 16384;
                            if (i20 != 0) {
                            }
                            i22 = i3 & 32768;
                            if (i22 == 0) {
                            }
                            i23 = i3 & 65536;
                            if (i23 == 0) {
                            }
                            i24 = i3 & 131072;
                            if (i24 == 0) {
                            }
                            if (!startRestartGroup.shouldExecute((i12 & 306783379) == 306783378 || (4793491 & i17) != 4793490, i12 & 1)) {
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                            }
                        }
                        i19 = i3 & 8192;
                        if (i19 == 0) {
                        }
                        i20 = i3 & 16384;
                        if (i20 != 0) {
                        }
                        i22 = i3 & 32768;
                        if (i22 == 0) {
                        }
                        i23 = i3 & 65536;
                        if (i23 == 0) {
                        }
                        i24 = i3 & 131072;
                        if (i24 == 0) {
                        }
                        if (!startRestartGroup.shouldExecute((i12 & 306783379) == 306783378 || (4793491 & i17) != 4793490, i12 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i12 = i4;
                    i13 = i3 & 512;
                    if (i13 != 0) {
                    }
                    i14 = i3 & 1024;
                    if (i14 != 0) {
                    }
                    i16 = i3 & 2048;
                    if (i16 != 0) {
                    }
                    i17 = i15;
                    i18 = i3 & 4096;
                    if (i18 != 0) {
                    }
                    i19 = i3 & 8192;
                    if (i19 == 0) {
                    }
                    i20 = i3 & 16384;
                    if (i20 != 0) {
                    }
                    i22 = i3 & 32768;
                    if (i22 == 0) {
                    }
                    i23 = i3 & 65536;
                    if (i23 == 0) {
                    }
                    i24 = i3 & 131072;
                    if (i24 == 0) {
                    }
                    if (!startRestartGroup.shouldExecute((i12 & 306783379) == 306783378 || (4793491 & i17) != 4793490, i12 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i8 = i3 & 32;
                if (i8 == 0) {
                }
                i9 = i3 & 64;
                if (i9 == 0) {
                }
                i10 = i3 & 128;
                if (i10 == 0) {
                }
                i11 = i3 & 256;
                if (i11 == 0) {
                }
                i12 = i4;
                i13 = i3 & 512;
                if (i13 != 0) {
                }
                i14 = i3 & 1024;
                if (i14 != 0) {
                }
                i16 = i3 & 2048;
                if (i16 != 0) {
                }
                i17 = i15;
                i18 = i3 & 4096;
                if (i18 != 0) {
                }
                i19 = i3 & 8192;
                if (i19 == 0) {
                }
                i20 = i3 & 16384;
                if (i20 != 0) {
                }
                i22 = i3 & 32768;
                if (i22 == 0) {
                }
                i23 = i3 & 65536;
                if (i23 == 0) {
                }
                i24 = i3 & 131072;
                if (i24 == 0) {
                }
                if (!startRestartGroup.shouldExecute((i12 & 306783379) == 306783378 || (4793491 & i17) != 4793490, i12 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i7 = i3 & 16;
            if (i7 != 0) {
            }
            i8 = i3 & 32;
            if (i8 == 0) {
            }
            i9 = i3 & 64;
            if (i9 == 0) {
            }
            i10 = i3 & 128;
            if (i10 == 0) {
            }
            i11 = i3 & 256;
            if (i11 == 0) {
            }
            i12 = i4;
            i13 = i3 & 512;
            if (i13 != 0) {
            }
            i14 = i3 & 1024;
            if (i14 != 0) {
            }
            i16 = i3 & 2048;
            if (i16 != 0) {
            }
            i17 = i15;
            i18 = i3 & 4096;
            if (i18 != 0) {
            }
            i19 = i3 & 8192;
            if (i19 == 0) {
            }
            i20 = i3 & 16384;
            if (i20 != 0) {
            }
            i22 = i3 & 32768;
            if (i22 == 0) {
            }
            i23 = i3 & 65536;
            if (i23 == 0) {
            }
            i24 = i3 & 131072;
            if (i24 == 0) {
            }
            if (!startRestartGroup.shouldExecute((i12 & 306783379) == 306783378 || (4793491 & i17) != 4793490, i12 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        i6 = i3 & 8;
        if (i6 == 0) {
        }
        i7 = i3 & 16;
        if (i7 != 0) {
        }
        i8 = i3 & 32;
        if (i8 == 0) {
        }
        i9 = i3 & 64;
        if (i9 == 0) {
        }
        i10 = i3 & 128;
        if (i10 == 0) {
        }
        i11 = i3 & 256;
        if (i11 == 0) {
        }
        i12 = i4;
        i13 = i3 & 512;
        if (i13 != 0) {
        }
        i14 = i3 & 1024;
        if (i14 != 0) {
        }
        i16 = i3 & 2048;
        if (i16 != 0) {
        }
        i17 = i15;
        i18 = i3 & 4096;
        if (i18 != 0) {
        }
        i19 = i3 & 8192;
        if (i19 == 0) {
        }
        i20 = i3 & 16384;
        if (i20 != 0) {
        }
        i22 = i3 & 32768;
        if (i22 == 0) {
        }
        i23 = i3 & 65536;
        if (i23 == 0) {
        }
        i24 = i3 & 131072;
        if (i24 == 0) {
        }
        if (!startRestartGroup.shouldExecute((i12 & 306783379) == 306783378 || (4793491 & i17) != 4793490, i12 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit MarkerImpl_khPtz74$lambda$1$0(com.google.android.gms.maps.model.Marker marker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(marker, "");
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit MarkerImpl_khPtz74$lambda$2$0(com.google.android.gms.maps.model.Marker marker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(marker, "");
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit MarkerImpl_khPtz74$lambda$3$0(com.google.android.gms.maps.model.Marker marker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(marker, "");
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x06e3  */
    /* JADX WARN: Removed duplicated region for block: B:173:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x06b2  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0280  */
    /* renamed from: MarkerImpl-khPtz74, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m10528MarkerImplkhPtz74(com.google.maps.android.compose.MarkerState markerState, java.lang.String str, float f, long j, boolean z, boolean z2, com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptor, long j2, float f2, java.lang.String str2, java.lang.Object obj, java.lang.String str3, boolean z3, float f3, kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, java.lang.Boolean> function1, kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function12, kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function13, kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function14, kotlin.jvm.functions.Function3<? super com.google.android.gms.maps.model.Marker, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, kotlin.jvm.functions.Function3<? super com.google.android.gms.maps.model.Marker, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function32, androidx.compose.runtime.Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        final com.google.maps.android.compose.MarkerState markerState2;
        final java.lang.String str4;
        final float f4;
        final long j3;
        final boolean z4;
        final boolean z5;
        final com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptor2;
        final long j4;
        final float f5;
        final java.lang.String str5;
        final java.lang.Object obj2;
        final java.lang.String str6;
        boolean z6;
        final float f6;
        final kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, java.lang.Boolean> function15;
        final kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function16;
        final kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function17;
        final kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function18;
        final kotlin.jvm.functions.Function3<? super com.google.android.gms.maps.model.Marker, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function33;
        final kotlin.jvm.functions.Function3<? super com.google.android.gms.maps.model.Marker, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function34;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        com.google.maps.android.compose.MarkerState markerState3;
        java.lang.String str7;
        float f7;
        boolean z7;
        com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptor3;
        long j5;
        boolean z8;
        long j6;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, java.lang.Boolean> function19;
        float f8;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function110;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function111;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function112;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function113;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function114;
        java.lang.String str8;
        boolean z9;
        float f9;
        boolean z10;
        float f10;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function115;
        kotlin.jvm.functions.Function3<? super com.google.android.gms.maps.model.Marker, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function35;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function116;
        java.lang.String str9;
        com.google.maps.android.compose.MarkerState markerState4;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function117;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, java.lang.Boolean> function118;
        kotlin.jvm.functions.Function3<? super com.google.android.gms.maps.model.Marker, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function36;
        int i27;
        java.lang.Object obj3;
        long j7;
        float f11;
        java.lang.String str10;
        long j8;
        int i28;
        com.google.maps.android.compose.MapApplier mapApplier;
        int i29;
        int i30;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1052021632);
        if ((i & 6) == 0) {
            if ((i3 & 1) == 0 && startRestartGroup.changed(markerState)) {
                i30 = 4;
                i4 = i30 | i;
            }
            i30 = 2;
            i4 = i30 | i;
        } else {
            i4 = i;
        }
        int i31 = i3 & 2;
        if (i31 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= startRestartGroup.changed(str) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i & 384) == 0) {
                i4 |= startRestartGroup.changed(f) ? 256 : 128;
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else if ((i & 3072) == 0) {
                    i4 |= startRestartGroup.changed(j) ? 2048 : 1024;
                    i7 = i3 & 16;
                    if (i7 == 0) {
                        i4 |= 24576;
                    } else if ((i & 24576) == 0) {
                        i4 |= startRestartGroup.changed(z) ? 16384 : 8192;
                        i8 = i3 & 32;
                        if (i8 != 0) {
                            i4 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i4 |= startRestartGroup.changed(z2) ? 131072 : 65536;
                        }
                        i9 = i3 & 64;
                        if (i9 != 0) {
                            i4 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            i4 |= startRestartGroup.changed(bitmapDescriptor) ? 1048576 : 524288;
                        }
                        i10 = i3 & 128;
                        if (i10 != 0) {
                            i11 = i4 | 12582912;
                        } else {
                            i11 = i4;
                            if ((i & 12582912) == 0) {
                                i11 |= startRestartGroup.changed(j2) ? 8388608 : 4194304;
                            }
                        }
                        i12 = i3 & 256;
                        if (i12 != 0) {
                            i11 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            i11 |= startRestartGroup.changed(f2) ? 67108864 : 33554432;
                        }
                        i13 = i3 & 512;
                        if (i13 != 0) {
                            i11 |= 805306368;
                        } else if ((i & 805306368) == 0) {
                            i11 |= startRestartGroup.changed(str2) ? 536870912 : 268435456;
                        }
                        i14 = i3 & 1024;
                        if (i14 != 0) {
                            i15 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            i15 = i2 | (startRestartGroup.changedInstance(obj) ? 4 : 2);
                        } else {
                            i15 = i2;
                        }
                        i16 = i3 & 2048;
                        if (i16 != 0) {
                            i15 |= 48;
                        } else if ((i2 & 48) == 0) {
                            i15 |= startRestartGroup.changed(str3) ? 32 : 16;
                        }
                        i17 = i15;
                        i18 = i3 & 4096;
                        if (i18 != 0) {
                            i17 |= 384;
                        } else if ((i2 & 384) == 0) {
                            i17 |= startRestartGroup.changed(z3) ? 256 : 128;
                            i19 = i3 & 8192;
                            if (i19 == 0) {
                                i17 |= 3072;
                            } else if ((i2 & 3072) == 0) {
                                i17 |= startRestartGroup.changed(f3) ? 2048 : 1024;
                                i20 = i3 & 16384;
                                if (i20 != 0) {
                                    i17 |= 24576;
                                    i21 = i20;
                                } else {
                                    i21 = i20;
                                    if ((i2 & 24576) == 0) {
                                        i17 |= startRestartGroup.changedInstance(function1) ? 16384 : 8192;
                                        i22 = i3 & 32768;
                                        if (i22 == 0) {
                                            i17 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                                        } else if ((i2 & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                            i17 |= startRestartGroup.changedInstance(function12) ? 131072 : 65536;
                                        }
                                        i23 = i3 & 65536;
                                        if (i23 == 0) {
                                            i17 |= 1572864;
                                        } else if ((i2 & 1572864) == 0) {
                                            i17 |= startRestartGroup.changedInstance(function13) ? 1048576 : 524288;
                                        }
                                        i24 = i3 & 131072;
                                        if (i24 == 0) {
                                            i17 |= 12582912;
                                        } else if ((i2 & 12582912) == 0) {
                                            i17 |= startRestartGroup.changedInstance(function14) ? 8388608 : 4194304;
                                        }
                                        i25 = i3 & 262144;
                                        if (i25 == 0) {
                                            i17 |= 100663296;
                                        } else if ((i2 & 100663296) == 0) {
                                            i17 |= startRestartGroup.changedInstance(function3) ? 67108864 : 33554432;
                                        }
                                        i26 = i3 & 524288;
                                        if (i26 == 0) {
                                            i29 = (i2 & 805306368) == 0 ? startRestartGroup.changedInstance(function32) ? 536870912 : 268435456 : 805306368;
                                            if (startRestartGroup.shouldExecute((i11 & 306783379) == 306783378 || (306783379 & i17) != 306783378, i11 & 1)) {
                                                startRestartGroup.startDefaults();
                                                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                                    startRestartGroup.skipToGroupEnd();
                                                    if ((i3 & 1) != 0) {
                                                        i11 &= -15;
                                                    }
                                                    markerState4 = markerState;
                                                    str7 = str;
                                                    f7 = f;
                                                    j7 = j;
                                                    z10 = z;
                                                    z7 = z2;
                                                    bitmapDescriptor3 = bitmapDescriptor;
                                                    j6 = j2;
                                                    f10 = f2;
                                                    str9 = str2;
                                                    obj3 = obj;
                                                    str8 = str3;
                                                    z9 = z3;
                                                    f9 = f3;
                                                    function118 = function1;
                                                    function117 = function12;
                                                    function115 = function13;
                                                    function116 = function14;
                                                    function36 = function3;
                                                    function35 = function32;
                                                    i27 = i11;
                                                } else {
                                                    if ((i3 & 1) != 0) {
                                                        markerState3 = rememberUpdatedMarkerState(null, startRestartGroup, 0, 1);
                                                        i11 &= -15;
                                                    } else {
                                                        markerState3 = markerState;
                                                    }
                                                    str7 = i31 != 0 ? "" : str;
                                                    f7 = i5 != 0 ? 1.0f : f;
                                                    long m5744constructorimpl = i6 != 0 ? androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(0.5f) << 32) | (java.lang.Float.floatToRawIntBits(1.0f) & 4294967295L)) : j;
                                                    boolean z11 = i7 != 0 ? false : z;
                                                    z7 = i8 != 0 ? false : z2;
                                                    bitmapDescriptor3 = i9 != 0 ? null : bitmapDescriptor;
                                                    if (i10 != 0) {
                                                        j5 = m5744constructorimpl;
                                                        z8 = z11;
                                                        j6 = androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(0.5f) << 32) | (java.lang.Float.floatToRawIntBits(0.0f) & 4294967295L));
                                                    } else {
                                                        j5 = m5744constructorimpl;
                                                        z8 = z11;
                                                        j6 = j2;
                                                    }
                                                    float f12 = i12 != 0 ? 0.0f : f2;
                                                    java.lang.String str11 = i13 != 0 ? null : str2;
                                                    java.lang.Object obj4 = i14 != 0 ? null : obj;
                                                    java.lang.String str12 = i16 != 0 ? null : str3;
                                                    boolean z12 = i18 != 0 ? true : z3;
                                                    float f13 = i19 != 0 ? 0.0f : f3;
                                                    if (i21 != 0) {
                                                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                                                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda2
                                                                @Override // kotlin.jvm.functions.Function1
                                                                public final java.lang.Object invoke(java.lang.Object obj5) {
                                                                    boolean MarkerImpl_khPtz74$lambda$0$0;
                                                                    MarkerImpl_khPtz74$lambda$0$0 = com.google.maps.android.compose.MarkerKt.MarkerImpl_khPtz74$lambda$0$0((com.google.android.gms.maps.model.Marker) obj5);
                                                                    return java.lang.Boolean.valueOf(MarkerImpl_khPtz74$lambda$0$0);
                                                                }
                                                            };
                                                            startRestartGroup.updateRememberedValue(rememberedValue);
                                                        }
                                                        function19 = (kotlin.jvm.functions.Function1) rememberedValue;
                                                    } else {
                                                        function19 = function1;
                                                    }
                                                    if (i22 != 0) {
                                                        java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                                                        f8 = f12;
                                                        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                            rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda14
                                                                @Override // kotlin.jvm.functions.Function1
                                                                public final java.lang.Object invoke(java.lang.Object obj5) {
                                                                    kotlin.Unit MarkerImpl_khPtz74$lambda$1$0;
                                                                    MarkerImpl_khPtz74$lambda$1$0 = com.google.maps.android.compose.MarkerKt.MarkerImpl_khPtz74$lambda$1$0((com.google.android.gms.maps.model.Marker) obj5);
                                                                    return MarkerImpl_khPtz74$lambda$1$0;
                                                                }
                                                            };
                                                            startRestartGroup.updateRememberedValue(rememberedValue2);
                                                        }
                                                        function110 = (kotlin.jvm.functions.Function1) rememberedValue2;
                                                    } else {
                                                        f8 = f12;
                                                        function110 = function12;
                                                    }
                                                    if (i23 != 0) {
                                                        java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                                                        function111 = function110;
                                                        if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                            rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda20
                                                                @Override // kotlin.jvm.functions.Function1
                                                                public final java.lang.Object invoke(java.lang.Object obj5) {
                                                                    kotlin.Unit MarkerImpl_khPtz74$lambda$2$0;
                                                                    MarkerImpl_khPtz74$lambda$2$0 = com.google.maps.android.compose.MarkerKt.MarkerImpl_khPtz74$lambda$2$0((com.google.android.gms.maps.model.Marker) obj5);
                                                                    return MarkerImpl_khPtz74$lambda$2$0;
                                                                }
                                                            };
                                                            startRestartGroup.updateRememberedValue(rememberedValue3);
                                                        }
                                                        function112 = (kotlin.jvm.functions.Function1) rememberedValue3;
                                                    } else {
                                                        function111 = function110;
                                                        function112 = function13;
                                                    }
                                                    if (i24 != 0) {
                                                        java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                                                        function113 = function112;
                                                        if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                            rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda21
                                                                @Override // kotlin.jvm.functions.Function1
                                                                public final java.lang.Object invoke(java.lang.Object obj5) {
                                                                    kotlin.Unit MarkerImpl_khPtz74$lambda$3$0;
                                                                    MarkerImpl_khPtz74$lambda$3$0 = com.google.maps.android.compose.MarkerKt.MarkerImpl_khPtz74$lambda$3$0((com.google.android.gms.maps.model.Marker) obj5);
                                                                    return MarkerImpl_khPtz74$lambda$3$0;
                                                                }
                                                            };
                                                            startRestartGroup.updateRememberedValue(rememberedValue4);
                                                        }
                                                        function114 = (kotlin.jvm.functions.Function1) rememberedValue4;
                                                    } else {
                                                        function113 = function112;
                                                        function114 = function14;
                                                    }
                                                    kotlin.jvm.functions.Function3<? super com.google.android.gms.maps.model.Marker, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function37 = i25 != 0 ? null : function3;
                                                    str8 = str12;
                                                    z9 = z12;
                                                    f9 = f13;
                                                    z10 = z8;
                                                    f10 = f8;
                                                    function115 = function113;
                                                    if (i26 != 0) {
                                                        function116 = function114;
                                                        str9 = str11;
                                                        markerState4 = markerState3;
                                                        function35 = null;
                                                    } else {
                                                        function35 = function32;
                                                        function116 = function114;
                                                        str9 = str11;
                                                        markerState4 = markerState3;
                                                    }
                                                    long j9 = j5;
                                                    function117 = function111;
                                                    function118 = function19;
                                                    function36 = function37;
                                                    i27 = i11;
                                                    obj3 = obj4;
                                                    j7 = j9;
                                                }
                                                startRestartGroup.endDefaults();
                                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                    str10 = str9;
                                                    f11 = f10;
                                                    androidx.compose.runtime.ComposerKt.traceEventStart(1052021632, i27, i17, "com.google.maps.android.compose.MarkerImpl (Marker.kt:635)");
                                                } else {
                                                    f11 = f10;
                                                    str10 = str9;
                                                }
                                                androidx.compose.runtime.Applier<?> applier = startRestartGroup.getApplier();
                                                if (applier instanceof com.google.maps.android.compose.MapApplier) {
                                                    mapApplier = (com.google.maps.android.compose.MapApplier) applier;
                                                    j8 = j6;
                                                    i28 = 0;
                                                } else {
                                                    j8 = j6;
                                                    i28 = 0;
                                                    mapApplier = null;
                                                }
                                                final androidx.compose.runtime.CompositionContext rememberCompositionContext = androidx.compose.runtime.ComposablesKt.rememberCompositionContext(startRestartGroup, i28);
                                                boolean changedInstance = startRestartGroup.changedInstance(mapApplier);
                                                final com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptor4 = bitmapDescriptor3;
                                                boolean z13 = (i27 & 112) == 32;
                                                final boolean z14 = z7;
                                                boolean z15 = (i27 & 896) == 256;
                                                final boolean z16 = z10;
                                                boolean z17 = (i27 & 7168) == 2048;
                                                final long j10 = j7;
                                                boolean z18 = (57344 & i27) == 16384;
                                                boolean z19 = (458752 & i27) == 131072;
                                                final float f14 = f7;
                                                boolean z20 = (3670016 & i27) == 1048576;
                                                final java.lang.String str13 = str7;
                                                boolean z21 = (29360128 & i27) == 8388608;
                                                final com.google.maps.android.compose.MapApplier mapApplier2 = mapApplier;
                                                boolean z22 = (((i27 & 14) ^ 6) > 4 && startRestartGroup.changed(markerState4)) || (i27 & 6) == 4;
                                                final com.google.maps.android.compose.MarkerState markerState5 = markerState4;
                                                boolean z23 = (234881024 & i27) == 67108864;
                                                boolean z24 = (i27 & 1879048192) == 536870912;
                                                boolean z25 = (i17 & 112) == 32;
                                                boolean z26 = (i17 & 896) == 256;
                                                boolean z27 = (i17 & 7168) == 2048;
                                                boolean changedInstance2 = startRestartGroup.changedInstance(obj3);
                                                boolean changedInstance3 = startRestartGroup.changedInstance(rememberCompositionContext);
                                                final java.lang.Object obj5 = obj3;
                                                boolean z28 = (i17 & 57344) == 16384;
                                                boolean z29 = (458752 & i17) == 131072;
                                                boolean z30 = (3670016 & i17) == 1048576;
                                                boolean z31 = (29360128 & i17) == 8388608;
                                                boolean z32 = (234881024 & i17) == 67108864;
                                                boolean z33 = (i17 & 1879048192) == 536870912;
                                                java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                                                if ((z23 | z18 | z17 | z13 | changedInstance | z15 | z19 | z20 | z21 | z22 | z24 | z25 | z26 | z27 | changedInstance2 | changedInstance3 | z28 | z29 | z30 | z31 | z32 | z33) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                    final kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, java.lang.Boolean> function119 = function118;
                                                    final kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function120 = function117;
                                                    final kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function121 = function115;
                                                    final kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function122 = function116;
                                                    final kotlin.jvm.functions.Function3<? super com.google.android.gms.maps.model.Marker, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function38 = function36;
                                                    final kotlin.jvm.functions.Function3<? super com.google.android.gms.maps.model.Marker, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function39 = function35;
                                                    final long j11 = j8;
                                                    final float f15 = f11;
                                                    final java.lang.String str14 = str10;
                                                    final java.lang.String str15 = str8;
                                                    final boolean z34 = z9;
                                                    final float f16 = f9;
                                                    rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda23
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final java.lang.Object invoke() {
                                                            com.google.maps.android.compose.MarkerNode MarkerImpl_khPtz74$lambda$4$0;
                                                            MarkerImpl_khPtz74$lambda$4$0 = com.google.maps.android.compose.MarkerKt.MarkerImpl_khPtz74$lambda$4$0(com.google.maps.android.compose.MapApplier.this, obj5, rememberCompositionContext, markerState5, function119, function120, function121, function122, function38, function39, str13, f14, j10, z16, z14, bitmapDescriptor4, j11, f15, str14, str15, z34, f16);
                                                            return MarkerImpl_khPtz74$lambda$4$0;
                                                        }
                                                    };
                                                    startRestartGroup.updateRememberedValue(rememberedValue5);
                                                }
                                                kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue5;
                                                if (!(startRestartGroup.getApplier() instanceof com.google.maps.android.compose.MapApplier)) {
                                                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                                                }
                                                startRestartGroup.startNode();
                                                if (startRestartGroup.getInserting()) {
                                                    startRestartGroup.createNode(function0);
                                                } else {
                                                    startRestartGroup.useNode();
                                                }
                                                androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                                                kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, java.lang.Boolean> function123 = function118;
                                                androidx.compose.runtime.Updater.m5310updateimpl(m5299constructorimpl, function123, (kotlin.jvm.functions.Function2<? super T, ? super kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, java.lang.Boolean>, kotlin.Unit>) new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda24
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final java.lang.Object invoke(java.lang.Object obj6, java.lang.Object obj7) {
                                                        kotlin.Unit MarkerImpl_khPtz74$lambda$5$0;
                                                        MarkerImpl_khPtz74$lambda$5$0 = com.google.maps.android.compose.MarkerKt.MarkerImpl_khPtz74$lambda$5$0((com.google.maps.android.compose.MarkerNode) obj6, (kotlin.jvm.functions.Function1) obj7);
                                                        return MarkerImpl_khPtz74$lambda$5$0;
                                                    }
                                                });
                                                kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function124 = function117;
                                                androidx.compose.runtime.Updater.m5310updateimpl(m5299constructorimpl, function124, (kotlin.jvm.functions.Function2<? super T, ? super kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit>, kotlin.Unit>) new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda25
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final java.lang.Object invoke(java.lang.Object obj6, java.lang.Object obj7) {
                                                        kotlin.Unit MarkerImpl_khPtz74$lambda$5$1;
                                                        MarkerImpl_khPtz74$lambda$5$1 = com.google.maps.android.compose.MarkerKt.MarkerImpl_khPtz74$lambda$5$1((com.google.maps.android.compose.MarkerNode) obj6, (kotlin.jvm.functions.Function1) obj7);
                                                        return MarkerImpl_khPtz74$lambda$5$1;
                                                    }
                                                });
                                                kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function125 = function115;
                                                androidx.compose.runtime.Updater.m5310updateimpl(m5299constructorimpl, function125, (kotlin.jvm.functions.Function2<? super T, ? super kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit>, kotlin.Unit>) new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda26
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final java.lang.Object invoke(java.lang.Object obj6, java.lang.Object obj7) {
                                                        kotlin.Unit MarkerImpl_khPtz74$lambda$5$2;
                                                        MarkerImpl_khPtz74$lambda$5$2 = com.google.maps.android.compose.MarkerKt.MarkerImpl_khPtz74$lambda$5$2((com.google.maps.android.compose.MarkerNode) obj6, (kotlin.jvm.functions.Function1) obj7);
                                                        return MarkerImpl_khPtz74$lambda$5$2;
                                                    }
                                                });
                                                kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function126 = function116;
                                                androidx.compose.runtime.Updater.m5310updateimpl(m5299constructorimpl, function126, (kotlin.jvm.functions.Function2<? super T, ? super kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit>, kotlin.Unit>) new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda27
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final java.lang.Object invoke(java.lang.Object obj6, java.lang.Object obj7) {
                                                        kotlin.Unit MarkerImpl_khPtz74$lambda$5$3;
                                                        MarkerImpl_khPtz74$lambda$5$3 = com.google.maps.android.compose.MarkerKt.MarkerImpl_khPtz74$lambda$5$3((com.google.maps.android.compose.MarkerNode) obj6, (kotlin.jvm.functions.Function1) obj7);
                                                        return MarkerImpl_khPtz74$lambda$5$3;
                                                    }
                                                });
                                                kotlin.jvm.functions.Function3<? super com.google.android.gms.maps.model.Marker, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function310 = function35;
                                                androidx.compose.runtime.Updater.m5310updateimpl(m5299constructorimpl, function310, (kotlin.jvm.functions.Function2<? super T, ? super kotlin.jvm.functions.Function3<? super com.google.android.gms.maps.model.Marker, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, kotlin.Unit>) new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda28
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final java.lang.Object invoke(java.lang.Object obj6, java.lang.Object obj7) {
                                                        kotlin.Unit MarkerImpl_khPtz74$lambda$5$4;
                                                        MarkerImpl_khPtz74$lambda$5$4 = com.google.maps.android.compose.MarkerKt.MarkerImpl_khPtz74$lambda$5$4((com.google.maps.android.compose.MarkerNode) obj6, (kotlin.jvm.functions.Function3) obj7);
                                                        return MarkerImpl_khPtz74$lambda$5$4;
                                                    }
                                                });
                                                kotlin.jvm.functions.Function3<? super com.google.android.gms.maps.model.Marker, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function311 = function36;
                                                androidx.compose.runtime.Updater.m5310updateimpl(m5299constructorimpl, function311, (kotlin.jvm.functions.Function2<? super T, ? super kotlin.jvm.functions.Function3<? super com.google.android.gms.maps.model.Marker, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, kotlin.Unit>) new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda3
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final java.lang.Object invoke(java.lang.Object obj6, java.lang.Object obj7) {
                                                        kotlin.Unit MarkerImpl_khPtz74$lambda$5$5;
                                                        MarkerImpl_khPtz74$lambda$5$5 = com.google.maps.android.compose.MarkerKt.MarkerImpl_khPtz74$lambda$5$5((com.google.maps.android.compose.MarkerNode) obj6, (kotlin.jvm.functions.Function3) obj7);
                                                        return MarkerImpl_khPtz74$lambda$5$5;
                                                    }
                                                });
                                                androidx.compose.runtime.Updater.m5310updateimpl(m5299constructorimpl, java.lang.Float.valueOf(f14), (kotlin.jvm.functions.Function2<? super T, ? super java.lang.Float, kotlin.Unit>) new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda4
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final java.lang.Object invoke(java.lang.Object obj6, java.lang.Object obj7) {
                                                        kotlin.Unit MarkerImpl_khPtz74$lambda$5$6;
                                                        MarkerImpl_khPtz74$lambda$5$6 = com.google.maps.android.compose.MarkerKt.MarkerImpl_khPtz74$lambda$5$6((com.google.maps.android.compose.MarkerNode) obj6, ((java.lang.Float) obj7).floatValue());
                                                        return MarkerImpl_khPtz74$lambda$5$6;
                                                    }
                                                });
                                                androidx.compose.runtime.Updater.m5310updateimpl(m5299constructorimpl, androidx.compose.ui.geometry.Offset.m5741boximpl(j10), (kotlin.jvm.functions.Function2<? super T, ? super androidx.compose.ui.geometry.Offset, kotlin.Unit>) new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda5
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final java.lang.Object invoke(java.lang.Object obj6, java.lang.Object obj7) {
                                                        kotlin.Unit MarkerImpl_khPtz74$lambda$5$7;
                                                        MarkerImpl_khPtz74$lambda$5$7 = com.google.maps.android.compose.MarkerKt.MarkerImpl_khPtz74$lambda$5$7((com.google.maps.android.compose.MarkerNode) obj6, (androidx.compose.ui.geometry.Offset) obj7);
                                                        return MarkerImpl_khPtz74$lambda$5$7;
                                                    }
                                                });
                                                androidx.compose.runtime.Updater.m5310updateimpl(m5299constructorimpl, java.lang.Boolean.valueOf(z16), (kotlin.jvm.functions.Function2<? super T, ? super java.lang.Boolean, kotlin.Unit>) new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda6
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final java.lang.Object invoke(java.lang.Object obj6, java.lang.Object obj7) {
                                                        kotlin.Unit MarkerImpl_khPtz74$lambda$5$8;
                                                        MarkerImpl_khPtz74$lambda$5$8 = com.google.maps.android.compose.MarkerKt.MarkerImpl_khPtz74$lambda$5$8((com.google.maps.android.compose.MarkerNode) obj6, ((java.lang.Boolean) obj7).booleanValue());
                                                        return MarkerImpl_khPtz74$lambda$5$8;
                                                    }
                                                });
                                                androidx.compose.runtime.Updater.m5310updateimpl(m5299constructorimpl, java.lang.Boolean.valueOf(z14), (kotlin.jvm.functions.Function2<? super T, ? super java.lang.Boolean, kotlin.Unit>) new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda7
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final java.lang.Object invoke(java.lang.Object obj6, java.lang.Object obj7) {
                                                        kotlin.Unit MarkerImpl_khPtz74$lambda$5$9;
                                                        MarkerImpl_khPtz74$lambda$5$9 = com.google.maps.android.compose.MarkerKt.MarkerImpl_khPtz74$lambda$5$9((com.google.maps.android.compose.MarkerNode) obj6, ((java.lang.Boolean) obj7).booleanValue());
                                                        return MarkerImpl_khPtz74$lambda$5$9;
                                                    }
                                                });
                                                androidx.compose.runtime.Updater.m5310updateimpl(m5299constructorimpl, bitmapDescriptor4, (kotlin.jvm.functions.Function2<? super T, ? super com.google.android.gms.maps.model.BitmapDescriptor, kotlin.Unit>) new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda8
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final java.lang.Object invoke(java.lang.Object obj6, java.lang.Object obj7) {
                                                        kotlin.Unit MarkerImpl_khPtz74$lambda$5$10;
                                                        MarkerImpl_khPtz74$lambda$5$10 = com.google.maps.android.compose.MarkerKt.MarkerImpl_khPtz74$lambda$5$10((com.google.maps.android.compose.MarkerNode) obj6, (com.google.android.gms.maps.model.BitmapDescriptor) obj7);
                                                        return MarkerImpl_khPtz74$lambda$5$10;
                                                    }
                                                });
                                                androidx.compose.runtime.Updater.m5310updateimpl(m5299constructorimpl, androidx.compose.ui.geometry.Offset.m5741boximpl(j8), (kotlin.jvm.functions.Function2<? super T, ? super androidx.compose.ui.geometry.Offset, kotlin.Unit>) new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda9
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final java.lang.Object invoke(java.lang.Object obj6, java.lang.Object obj7) {
                                                        kotlin.Unit MarkerImpl_khPtz74$lambda$5$11;
                                                        MarkerImpl_khPtz74$lambda$5$11 = com.google.maps.android.compose.MarkerKt.MarkerImpl_khPtz74$lambda$5$11((com.google.maps.android.compose.MarkerNode) obj6, (androidx.compose.ui.geometry.Offset) obj7);
                                                        return MarkerImpl_khPtz74$lambda$5$11;
                                                    }
                                                });
                                                androidx.compose.runtime.Updater.m5310updateimpl(m5299constructorimpl, markerState5.getPosition(), (kotlin.jvm.functions.Function2<? super T, ? super com.google.android.gms.maps.model.LatLng, kotlin.Unit>) new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda10
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final java.lang.Object invoke(java.lang.Object obj6, java.lang.Object obj7) {
                                                        kotlin.Unit MarkerImpl_khPtz74$lambda$5$12;
                                                        MarkerImpl_khPtz74$lambda$5$12 = com.google.maps.android.compose.MarkerKt.MarkerImpl_khPtz74$lambda$5$12((com.google.maps.android.compose.MarkerNode) obj6, (com.google.android.gms.maps.model.LatLng) obj7);
                                                        return MarkerImpl_khPtz74$lambda$5$12;
                                                    }
                                                });
                                                androidx.compose.runtime.Updater.m5310updateimpl(m5299constructorimpl, java.lang.Float.valueOf(f11), (kotlin.jvm.functions.Function2<? super T, ? super java.lang.Float, kotlin.Unit>) new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda12
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final java.lang.Object invoke(java.lang.Object obj6, java.lang.Object obj7) {
                                                        kotlin.Unit MarkerImpl_khPtz74$lambda$5$13;
                                                        MarkerImpl_khPtz74$lambda$5$13 = com.google.maps.android.compose.MarkerKt.MarkerImpl_khPtz74$lambda$5$13((com.google.maps.android.compose.MarkerNode) obj6, ((java.lang.Float) obj7).floatValue());
                                                        return MarkerImpl_khPtz74$lambda$5$13;
                                                    }
                                                });
                                                java.lang.String str16 = str10;
                                                androidx.compose.runtime.Updater.m5310updateimpl(m5299constructorimpl, str16, (kotlin.jvm.functions.Function2<? super T, ? super java.lang.String, kotlin.Unit>) new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda13
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final java.lang.Object invoke(java.lang.Object obj6, java.lang.Object obj7) {
                                                        kotlin.Unit MarkerImpl_khPtz74$lambda$5$14;
                                                        MarkerImpl_khPtz74$lambda$5$14 = com.google.maps.android.compose.MarkerKt.MarkerImpl_khPtz74$lambda$5$14((com.google.maps.android.compose.MarkerNode) obj6, (java.lang.String) obj7);
                                                        return MarkerImpl_khPtz74$lambda$5$14;
                                                    }
                                                });
                                                androidx.compose.runtime.Updater.m5310updateimpl(m5299constructorimpl, obj5, (kotlin.jvm.functions.Function2<? super T, ? super java.lang.Object, kotlin.Unit>) new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda15
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final java.lang.Object invoke(java.lang.Object obj6, java.lang.Object obj7) {
                                                        kotlin.Unit MarkerImpl_khPtz74$lambda$5$15;
                                                        MarkerImpl_khPtz74$lambda$5$15 = com.google.maps.android.compose.MarkerKt.MarkerImpl_khPtz74$lambda$5$15((com.google.maps.android.compose.MarkerNode) obj6, obj7);
                                                        return MarkerImpl_khPtz74$lambda$5$15;
                                                    }
                                                });
                                                java.lang.String str17 = str8;
                                                androidx.compose.runtime.Updater.m5310updateimpl(m5299constructorimpl, str17, (kotlin.jvm.functions.Function2<? super T, ? super java.lang.String, kotlin.Unit>) new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda16
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final java.lang.Object invoke(java.lang.Object obj6, java.lang.Object obj7) {
                                                        kotlin.Unit MarkerImpl_khPtz74$lambda$5$16;
                                                        MarkerImpl_khPtz74$lambda$5$16 = com.google.maps.android.compose.MarkerKt.MarkerImpl_khPtz74$lambda$5$16((com.google.maps.android.compose.MarkerNode) obj6, (java.lang.String) obj7);
                                                        return MarkerImpl_khPtz74$lambda$5$16;
                                                    }
                                                });
                                                androidx.compose.runtime.Updater.m5310updateimpl(m5299constructorimpl, java.lang.Boolean.valueOf(z9), (kotlin.jvm.functions.Function2<? super T, ? super java.lang.Boolean, kotlin.Unit>) new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda17
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final java.lang.Object invoke(java.lang.Object obj6, java.lang.Object obj7) {
                                                        kotlin.Unit MarkerImpl_khPtz74$lambda$5$17;
                                                        MarkerImpl_khPtz74$lambda$5$17 = com.google.maps.android.compose.MarkerKt.MarkerImpl_khPtz74$lambda$5$17((com.google.maps.android.compose.MarkerNode) obj6, ((java.lang.Boolean) obj7).booleanValue());
                                                        return MarkerImpl_khPtz74$lambda$5$17;
                                                    }
                                                });
                                                androidx.compose.runtime.Updater.m5310updateimpl(m5299constructorimpl, java.lang.Float.valueOf(f9), (kotlin.jvm.functions.Function2<? super T, ? super java.lang.Float, kotlin.Unit>) new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda18
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final java.lang.Object invoke(java.lang.Object obj6, java.lang.Object obj7) {
                                                        kotlin.Unit MarkerImpl_khPtz74$lambda$5$18;
                                                        MarkerImpl_khPtz74$lambda$5$18 = com.google.maps.android.compose.MarkerKt.MarkerImpl_khPtz74$lambda$5$18((com.google.maps.android.compose.MarkerNode) obj6, ((java.lang.Float) obj7).floatValue());
                                                        return MarkerImpl_khPtz74$lambda$5$18;
                                                    }
                                                });
                                                startRestartGroup.endNode();
                                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                                }
                                                f5 = f11;
                                                str4 = str13;
                                                function16 = function124;
                                                function18 = function126;
                                                function34 = function310;
                                                str6 = str17;
                                                function33 = function311;
                                                markerState2 = markerState5;
                                                j4 = j8;
                                                z4 = z16;
                                                f4 = f14;
                                                obj2 = obj5;
                                                function15 = function123;
                                                bitmapDescriptor2 = bitmapDescriptor4;
                                                z6 = z9;
                                                f6 = f9;
                                                function17 = function125;
                                                str5 = str16;
                                                z5 = z14;
                                                j3 = j10;
                                            } else {
                                                startRestartGroup.skipToGroupEnd();
                                                markerState2 = markerState;
                                                str4 = str;
                                                f4 = f;
                                                j3 = j;
                                                z4 = z;
                                                z5 = z2;
                                                bitmapDescriptor2 = bitmapDescriptor;
                                                j4 = j2;
                                                f5 = f2;
                                                str5 = str2;
                                                obj2 = obj;
                                                str6 = str3;
                                                z6 = z3;
                                                f6 = f3;
                                                function15 = function1;
                                                function16 = function12;
                                                function17 = function13;
                                                function18 = function14;
                                                function33 = function3;
                                                function34 = function32;
                                            }
                                            endRestartGroup = startRestartGroup.endRestartGroup();
                                            if (endRestartGroup != null) {
                                                final boolean z35 = z6;
                                                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda19
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final java.lang.Object invoke(java.lang.Object obj6, java.lang.Object obj7) {
                                                        kotlin.Unit MarkerImpl_khPtz74$lambda$6;
                                                        MarkerImpl_khPtz74$lambda$6 = com.google.maps.android.compose.MarkerKt.MarkerImpl_khPtz74$lambda$6(com.google.maps.android.compose.MarkerState.this, str4, f4, j3, z4, z5, bitmapDescriptor2, j4, f5, str5, obj2, str6, z35, f6, function15, function16, function17, function18, function33, function34, i, i2, i3, (androidx.compose.runtime.Composer) obj6, ((java.lang.Integer) obj7).intValue());
                                                        return MarkerImpl_khPtz74$lambda$6;
                                                    }
                                                });
                                                return;
                                            }
                                            return;
                                        }
                                        i17 |= i29;
                                        if (startRestartGroup.shouldExecute((i11 & 306783379) == 306783378 || (306783379 & i17) != 306783378, i11 & 1)) {
                                        }
                                        endRestartGroup = startRestartGroup.endRestartGroup();
                                        if (endRestartGroup != null) {
                                        }
                                    }
                                }
                                i22 = i3 & 32768;
                                if (i22 == 0) {
                                }
                                i23 = i3 & 65536;
                                if (i23 == 0) {
                                }
                                i24 = i3 & 131072;
                                if (i24 == 0) {
                                }
                                i25 = i3 & 262144;
                                if (i25 == 0) {
                                }
                                i26 = i3 & 524288;
                                if (i26 == 0) {
                                }
                                i17 |= i29;
                                if (startRestartGroup.shouldExecute((i11 & 306783379) == 306783378 || (306783379 & i17) != 306783378, i11 & 1)) {
                                }
                                endRestartGroup = startRestartGroup.endRestartGroup();
                                if (endRestartGroup != null) {
                                }
                            }
                            i20 = i3 & 16384;
                            if (i20 != 0) {
                            }
                            i22 = i3 & 32768;
                            if (i22 == 0) {
                            }
                            i23 = i3 & 65536;
                            if (i23 == 0) {
                            }
                            i24 = i3 & 131072;
                            if (i24 == 0) {
                            }
                            i25 = i3 & 262144;
                            if (i25 == 0) {
                            }
                            i26 = i3 & 524288;
                            if (i26 == 0) {
                            }
                            i17 |= i29;
                            if (startRestartGroup.shouldExecute((i11 & 306783379) == 306783378 || (306783379 & i17) != 306783378, i11 & 1)) {
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        i19 = i3 & 8192;
                        if (i19 == 0) {
                        }
                        i20 = i3 & 16384;
                        if (i20 != 0) {
                        }
                        i22 = i3 & 32768;
                        if (i22 == 0) {
                        }
                        i23 = i3 & 65536;
                        if (i23 == 0) {
                        }
                        i24 = i3 & 131072;
                        if (i24 == 0) {
                        }
                        i25 = i3 & 262144;
                        if (i25 == 0) {
                        }
                        i26 = i3 & 524288;
                        if (i26 == 0) {
                        }
                        i17 |= i29;
                        if (startRestartGroup.shouldExecute((i11 & 306783379) == 306783378 || (306783379 & i17) != 306783378, i11 & 1)) {
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i8 = i3 & 32;
                    if (i8 != 0) {
                    }
                    i9 = i3 & 64;
                    if (i9 != 0) {
                    }
                    i10 = i3 & 128;
                    if (i10 != 0) {
                    }
                    i12 = i3 & 256;
                    if (i12 != 0) {
                    }
                    i13 = i3 & 512;
                    if (i13 != 0) {
                    }
                    i14 = i3 & 1024;
                    if (i14 != 0) {
                    }
                    i16 = i3 & 2048;
                    if (i16 != 0) {
                    }
                    i17 = i15;
                    i18 = i3 & 4096;
                    if (i18 != 0) {
                    }
                    i19 = i3 & 8192;
                    if (i19 == 0) {
                    }
                    i20 = i3 & 16384;
                    if (i20 != 0) {
                    }
                    i22 = i3 & 32768;
                    if (i22 == 0) {
                    }
                    i23 = i3 & 65536;
                    if (i23 == 0) {
                    }
                    i24 = i3 & 131072;
                    if (i24 == 0) {
                    }
                    i25 = i3 & 262144;
                    if (i25 == 0) {
                    }
                    i26 = i3 & 524288;
                    if (i26 == 0) {
                    }
                    i17 |= i29;
                    if (startRestartGroup.shouldExecute((i11 & 306783379) == 306783378 || (306783379 & i17) != 306783378, i11 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i7 = i3 & 16;
                if (i7 == 0) {
                }
                i8 = i3 & 32;
                if (i8 != 0) {
                }
                i9 = i3 & 64;
                if (i9 != 0) {
                }
                i10 = i3 & 128;
                if (i10 != 0) {
                }
                i12 = i3 & 256;
                if (i12 != 0) {
                }
                i13 = i3 & 512;
                if (i13 != 0) {
                }
                i14 = i3 & 1024;
                if (i14 != 0) {
                }
                i16 = i3 & 2048;
                if (i16 != 0) {
                }
                i17 = i15;
                i18 = i3 & 4096;
                if (i18 != 0) {
                }
                i19 = i3 & 8192;
                if (i19 == 0) {
                }
                i20 = i3 & 16384;
                if (i20 != 0) {
                }
                i22 = i3 & 32768;
                if (i22 == 0) {
                }
                i23 = i3 & 65536;
                if (i23 == 0) {
                }
                i24 = i3 & 131072;
                if (i24 == 0) {
                }
                i25 = i3 & 262144;
                if (i25 == 0) {
                }
                i26 = i3 & 524288;
                if (i26 == 0) {
                }
                i17 |= i29;
                if (startRestartGroup.shouldExecute((i11 & 306783379) == 306783378 || (306783379 & i17) != 306783378, i11 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            i7 = i3 & 16;
            if (i7 == 0) {
            }
            i8 = i3 & 32;
            if (i8 != 0) {
            }
            i9 = i3 & 64;
            if (i9 != 0) {
            }
            i10 = i3 & 128;
            if (i10 != 0) {
            }
            i12 = i3 & 256;
            if (i12 != 0) {
            }
            i13 = i3 & 512;
            if (i13 != 0) {
            }
            i14 = i3 & 1024;
            if (i14 != 0) {
            }
            i16 = i3 & 2048;
            if (i16 != 0) {
            }
            i17 = i15;
            i18 = i3 & 4096;
            if (i18 != 0) {
            }
            i19 = i3 & 8192;
            if (i19 == 0) {
            }
            i20 = i3 & 16384;
            if (i20 != 0) {
            }
            i22 = i3 & 32768;
            if (i22 == 0) {
            }
            i23 = i3 & 65536;
            if (i23 == 0) {
            }
            i24 = i3 & 131072;
            if (i24 == 0) {
            }
            i25 = i3 & 262144;
            if (i25 == 0) {
            }
            i26 = i3 & 524288;
            if (i26 == 0) {
            }
            i17 |= i29;
            if (startRestartGroup.shouldExecute((i11 & 306783379) == 306783378 || (306783379 & i17) != 306783378, i11 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        i8 = i3 & 32;
        if (i8 != 0) {
        }
        i9 = i3 & 64;
        if (i9 != 0) {
        }
        i10 = i3 & 128;
        if (i10 != 0) {
        }
        i12 = i3 & 256;
        if (i12 != 0) {
        }
        i13 = i3 & 512;
        if (i13 != 0) {
        }
        i14 = i3 & 1024;
        if (i14 != 0) {
        }
        i16 = i3 & 2048;
        if (i16 != 0) {
        }
        i17 = i15;
        i18 = i3 & 4096;
        if (i18 != 0) {
        }
        i19 = i3 & 8192;
        if (i19 == 0) {
        }
        i20 = i3 & 16384;
        if (i20 != 0) {
        }
        i22 = i3 & 32768;
        if (i22 == 0) {
        }
        i23 = i3 & 65536;
        if (i23 == 0) {
        }
        i24 = i3 & 131072;
        if (i24 == 0) {
        }
        i25 = i3 & 262144;
        if (i25 == 0) {
        }
        i26 = i3 & 524288;
        if (i26 == 0) {
        }
        i17 |= i29;
        if (startRestartGroup.shouldExecute((i11 & 306783379) == 306783378 || (306783379 & i17) != 306783378, i11 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.google.maps.android.compose.MarkerNode MarkerImpl_khPtz74$lambda$4$0(com.google.maps.android.compose.MapApplier mapApplier, java.lang.Object obj, androidx.compose.runtime.CompositionContext compositionContext, com.google.maps.android.compose.MarkerState markerState, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function1 function13, kotlin.jvm.functions.Function1 function14, kotlin.jvm.functions.Function3 function3, kotlin.jvm.functions.Function3 function32, java.lang.String str, float f, long j, boolean z, boolean z2, com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptor, long j2, float f2, java.lang.String str2, java.lang.String str3, boolean z3, float f3) {
        com.google.android.gms.maps.GoogleMap map;
        if (mapApplier != null && (map = mapApplier.getMap()) != null) {
            com.google.android.gms.maps.model.MarkerOptions markerOptions = new com.google.android.gms.maps.model.MarkerOptions();
            markerOptions.contentDescription(str);
            markerOptions.alpha(f);
            markerOptions.anchor(java.lang.Float.intBitsToFloat((int) (j >> 32)), java.lang.Float.intBitsToFloat((int) (j & 4294967295L)));
            markerOptions.draggable(z);
            markerOptions.flat(z2);
            markerOptions.icon(bitmapDescriptor);
            markerOptions.infoWindowAnchor(java.lang.Float.intBitsToFloat((int) (j2 >> 32)), java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L)));
            markerOptions.position(markerState.getPosition());
            markerOptions.rotation(f2);
            markerOptions.snippet(str2);
            markerOptions.title(str3);
            markerOptions.visible(z3);
            markerOptions.zIndex(f3);
            com.google.android.gms.maps.model.Marker addMarker = map.addMarker(markerOptions);
            if (addMarker != null) {
                addMarker.setTag(obj);
                return new com.google.maps.android.compose.MarkerNode(compositionContext, addMarker, markerState, function1, function12, function13, function14, function3, function32);
            }
        }
        throw new java.lang.IllegalStateException("Error adding marker".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit MarkerImpl_khPtz74$lambda$5$0(com.google.maps.android.compose.MarkerNode markerNode, kotlin.jvm.functions.Function1 function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(markerNode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        markerNode.setOnMarkerClick(function1);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit MarkerImpl_khPtz74$lambda$5$1(com.google.maps.android.compose.MarkerNode markerNode, kotlin.jvm.functions.Function1 function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(markerNode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        markerNode.setOnInfoWindowClick(function1);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit MarkerImpl_khPtz74$lambda$5$2(com.google.maps.android.compose.MarkerNode markerNode, kotlin.jvm.functions.Function1 function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(markerNode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        markerNode.setOnInfoWindowClose(function1);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit MarkerImpl_khPtz74$lambda$5$3(com.google.maps.android.compose.MarkerNode markerNode, kotlin.jvm.functions.Function1 function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(markerNode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        markerNode.setOnInfoWindowLongClick(function1);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit MarkerImpl_khPtz74$lambda$5$4(com.google.maps.android.compose.MarkerNode markerNode, kotlin.jvm.functions.Function3 function3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(markerNode, "");
        markerNode.setInfoContent(function3);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit MarkerImpl_khPtz74$lambda$5$5(com.google.maps.android.compose.MarkerNode markerNode, kotlin.jvm.functions.Function3 function3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(markerNode, "");
        markerNode.setInfoWindow(function3);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit MarkerImpl_khPtz74$lambda$5$6(com.google.maps.android.compose.MarkerNode markerNode, float f) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(markerNode, "");
        markerNode.getMarker().setAlpha(f);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit MarkerImpl_khPtz74$lambda$5$7(com.google.maps.android.compose.MarkerNode markerNode, androidx.compose.ui.geometry.Offset offset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(markerNode, "");
        markerNode.getMarker().setAnchor(java.lang.Float.intBitsToFloat((int) (offset.m5762unboximpl() >> 32)), java.lang.Float.intBitsToFloat((int) (offset.m5762unboximpl() & 4294967295L)));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit MarkerImpl_khPtz74$lambda$5$8(com.google.maps.android.compose.MarkerNode markerNode, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(markerNode, "");
        markerNode.getMarker().setDraggable(z);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit MarkerImpl_khPtz74$lambda$5$9(com.google.maps.android.compose.MarkerNode markerNode, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(markerNode, "");
        markerNode.getMarker().setFlat(z);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit MarkerImpl_khPtz74$lambda$5$10(com.google.maps.android.compose.MarkerNode markerNode, com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(markerNode, "");
        markerNode.getMarker().setIcon(bitmapDescriptor);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit MarkerImpl_khPtz74$lambda$5$11(com.google.maps.android.compose.MarkerNode markerNode, androidx.compose.ui.geometry.Offset offset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(markerNode, "");
        markerNode.getMarker().setInfoWindowAnchor(java.lang.Float.intBitsToFloat((int) (offset.m5762unboximpl() >> 32)), java.lang.Float.intBitsToFloat((int) (offset.m5762unboximpl() & 4294967295L)));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit MarkerImpl_khPtz74$lambda$5$12(com.google.maps.android.compose.MarkerNode markerNode, com.google.android.gms.maps.model.LatLng latLng) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(markerNode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(latLng, "");
        markerNode.getMarker().setPosition(latLng);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit MarkerImpl_khPtz74$lambda$5$13(com.google.maps.android.compose.MarkerNode markerNode, float f) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(markerNode, "");
        markerNode.getMarker().setRotation(f);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit MarkerImpl_khPtz74$lambda$5$14(com.google.maps.android.compose.MarkerNode markerNode, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(markerNode, "");
        markerNode.getMarker().setSnippet(str);
        if (markerNode.getMarker().isInfoWindowShown()) {
            markerNode.getMarker().showInfoWindow();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit MarkerImpl_khPtz74$lambda$5$15(com.google.maps.android.compose.MarkerNode markerNode, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(markerNode, "");
        markerNode.getMarker().setTag(obj);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit MarkerImpl_khPtz74$lambda$5$16(com.google.maps.android.compose.MarkerNode markerNode, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(markerNode, "");
        markerNode.getMarker().setTitle(str);
        if (markerNode.getMarker().isInfoWindowShown()) {
            markerNode.getMarker().showInfoWindow();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit MarkerImpl_khPtz74$lambda$5$17(com.google.maps.android.compose.MarkerNode markerNode, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(markerNode, "");
        markerNode.getMarker().setVisible(z);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit MarkerImpl_khPtz74$lambda$5$18(com.google.maps.android.compose.MarkerNode markerNode, float f) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(markerNode, "");
        markerNode.getMarker().setZIndex(f);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit AdvancedMarker_3D_2zJA$lambda$1$0(com.google.android.gms.maps.model.Marker marker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(marker, "");
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit AdvancedMarker_3D_2zJA$lambda$2$0(com.google.android.gms.maps.model.Marker marker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(marker, "");
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit AdvancedMarker_3D_2zJA$lambda$3$0(com.google.android.gms.maps.model.Marker marker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(marker, "");
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02a4  */
    /* renamed from: AdvancedMarker-3D-2zJA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m10524AdvancedMarker3D2zJA(com.google.maps.android.compose.MarkerState markerState, java.lang.String str, float f, long j, boolean z, boolean z2, long j2, float f2, java.lang.String str2, java.lang.Object obj, java.lang.String str3, boolean z3, float f3, kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, java.lang.Boolean> function1, kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function12, kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function13, kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function14, com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptor, com.google.android.gms.maps.model.PinConfig pinConfig, android.view.View view, int i, androidx.compose.runtime.Composer composer, final int i2, final int i3, final int i4, final int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        androidx.compose.runtime.Composer composer2;
        final com.google.maps.android.compose.MarkerState markerState2;
        final java.lang.String str4;
        final float f4;
        final long j3;
        final boolean z4;
        final boolean z5;
        final long j4;
        final float f5;
        final java.lang.String str5;
        final java.lang.Object obj2;
        final java.lang.String str6;
        final boolean z6;
        float f6;
        final kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, java.lang.Boolean> function15;
        final kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function16;
        final kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function17;
        final kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function18;
        final com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptor2;
        final com.google.android.gms.maps.model.PinConfig pinConfig2;
        final android.view.View view2;
        final int i30;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        com.google.maps.android.compose.MarkerState markerState3;
        float f7;
        boolean z7;
        boolean z8;
        int i31;
        java.lang.String str7;
        long j5;
        long j6;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, java.lang.Boolean> function19;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function110;
        java.lang.String str8;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function111;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function112;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function113;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function114;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function115;
        float f8;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, java.lang.Boolean> function116;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function117;
        com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptor3;
        int i32;
        com.google.android.gms.maps.model.PinConfig pinConfig3;
        android.view.View view3;
        int i33;
        java.lang.String str9;
        java.lang.Object obj3;
        java.lang.String str10;
        boolean z9;
        float f9;
        long j7;
        long j8;
        java.lang.String str11;
        int i34;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1413763483);
        if ((i2 & 6) == 0) {
            if ((i5 & 1) == 0 && startRestartGroup.changed(markerState)) {
                i34 = 4;
                i6 = i34 | i2;
            }
            i34 = 2;
            i6 = i34 | i2;
        } else {
            i6 = i2;
        }
        int i35 = i5 & 2;
        if (i35 != 0) {
            i6 |= 48;
        } else if ((i2 & 48) == 0) {
            i6 |= startRestartGroup.changed(str) ? 32 : 16;
            i7 = i5 & 4;
            if (i7 == 0) {
                i6 |= 384;
            } else if ((i2 & 384) == 0) {
                i6 |= startRestartGroup.changed(f) ? 256 : 128;
                i8 = i5 & 8;
                if (i8 != 0) {
                    i6 |= 3072;
                } else if ((i2 & 3072) == 0) {
                    i6 |= startRestartGroup.changed(j) ? 2048 : 1024;
                }
                i9 = i5 & 16;
                if (i9 != 0) {
                    i6 |= 24576;
                } else if ((i2 & 24576) == 0) {
                    i6 |= startRestartGroup.changed(z) ? 16384 : 8192;
                    i10 = i5 & 32;
                    if (i10 == 0) {
                        i6 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i2 & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i6 |= startRestartGroup.changed(z2) ? 131072 : 65536;
                    }
                    i11 = i5 & 64;
                    if (i11 == 0) {
                        i6 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        i6 |= startRestartGroup.changed(j2) ? 1048576 : 524288;
                    }
                    i12 = i5 & 128;
                    if (i12 == 0) {
                        i6 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        i6 |= startRestartGroup.changed(f2) ? 8388608 : 4194304;
                    }
                    i13 = i5 & 256;
                    if (i13 == 0) {
                        i6 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        i6 |= startRestartGroup.changed(str2) ? 67108864 : 33554432;
                    }
                    i14 = i5 & 512;
                    if (i14 == 0) {
                        i6 |= 805306368;
                    } else if ((i2 & 805306368) == 0) {
                        i6 |= startRestartGroup.changedInstance(obj) ? 536870912 : 268435456;
                    }
                    i15 = i5 & 1024;
                    if (i15 == 0) {
                        i16 = i3 | 6;
                    } else if ((i3 & 6) == 0) {
                        i16 = i3 | (startRestartGroup.changed(str3) ? 4 : 2);
                    } else {
                        i16 = i3;
                    }
                    i17 = i5 & 2048;
                    if (i17 == 0) {
                        i16 |= 48;
                    } else if ((i3 & 48) == 0) {
                        i16 |= startRestartGroup.changed(z3) ? 32 : 16;
                    }
                    i18 = i16;
                    i19 = i5 & 4096;
                    if (i19 == 0) {
                        i18 |= 384;
                    } else if ((i3 & 384) == 0) {
                        i18 |= startRestartGroup.changed(f3) ? 256 : 128;
                        i20 = i5 & 8192;
                        if (i20 != 0) {
                            i18 |= 3072;
                        } else if ((i3 & 3072) == 0) {
                            i18 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
                            i21 = i5 & 16384;
                            if (i21 == 0) {
                                i18 |= 24576;
                                i22 = i21;
                            } else {
                                i22 = i21;
                                if ((i3 & 24576) == 0) {
                                    i18 |= startRestartGroup.changedInstance(function12) ? 16384 : 8192;
                                    i23 = i5 & 32768;
                                    if (i23 != 0) {
                                        i18 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                                    } else if ((i3 & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                        i18 |= startRestartGroup.changedInstance(function13) ? 131072 : 65536;
                                    }
                                    i24 = i5 & 65536;
                                    if (i24 != 0) {
                                        i18 |= 1572864;
                                    } else if ((i3 & 1572864) == 0) {
                                        i18 |= startRestartGroup.changedInstance(function14) ? 1048576 : 524288;
                                    }
                                    i25 = i5 & 131072;
                                    if (i25 != 0) {
                                        i18 |= 12582912;
                                    } else if ((i3 & 12582912) == 0) {
                                        i18 |= startRestartGroup.changed(bitmapDescriptor) ? 8388608 : 4194304;
                                    }
                                    i26 = i5 & 262144;
                                    if (i26 != 0) {
                                        i18 |= 100663296;
                                    } else if ((i3 & 100663296) == 0) {
                                        i18 |= startRestartGroup.changed(pinConfig) ? 67108864 : 33554432;
                                    }
                                    i27 = i5 & 524288;
                                    if (i27 != 0) {
                                        i18 |= 805306368;
                                    } else if ((i3 & 805306368) == 0) {
                                        i18 |= startRestartGroup.changedInstance(view) ? 536870912 : 268435456;
                                    }
                                    i28 = i5 & 1048576;
                                    if (i28 != 0) {
                                        i29 = i4 | 6;
                                    } else if ((i4 & 6) == 0) {
                                        i29 = i4 | (startRestartGroup.changed(i) ? 4 : 2);
                                    } else {
                                        i29 = i4;
                                    }
                                    if (startRestartGroup.shouldExecute(((i6 & 306783379) != 306783378 && (306783379 & i18) == 306783378 && (i29 & 3) == 2) ? false : true, i6 & 1)) {
                                        startRestartGroup.startDefaults();
                                        if ((i2 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                            startRestartGroup.skipToGroupEnd();
                                            if ((i5 & 1) != 0) {
                                                i6 &= -15;
                                            }
                                            markerState2 = markerState;
                                            str4 = str;
                                            f7 = f;
                                            z7 = z;
                                            z8 = z2;
                                            j7 = j2;
                                            f9 = f2;
                                            str9 = str2;
                                            obj3 = obj;
                                            str10 = str3;
                                            z9 = z3;
                                            f8 = f3;
                                            function116 = function1;
                                            function117 = function12;
                                            function114 = function13;
                                            function115 = function14;
                                            bitmapDescriptor3 = bitmapDescriptor;
                                            pinConfig3 = pinConfig;
                                            view3 = view;
                                            i32 = i;
                                            i33 = i6;
                                            j8 = j;
                                        } else {
                                            if ((i5 & 1) != 0) {
                                                markerState3 = rememberUpdatedMarkerState(null, startRestartGroup, 0, 1);
                                                i6 &= -15;
                                            } else {
                                                markerState3 = markerState;
                                            }
                                            java.lang.String str12 = i35 != 0 ? "" : str;
                                            f7 = i7 != 0 ? 1.0f : f;
                                            long m5744constructorimpl = i8 != 0 ? androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(1.0f) & 4294967295L) | (java.lang.Float.floatToRawIntBits(0.5f) << 32)) : j;
                                            z7 = i9 != 0 ? false : z;
                                            z8 = i10 != 0 ? false : z2;
                                            if (i11 != 0) {
                                                i31 = i6;
                                                str7 = str12;
                                                j5 = m5744constructorimpl;
                                                j6 = androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(0.5f) << 32) | (java.lang.Float.floatToRawIntBits(0.0f) & 4294967295L));
                                            } else {
                                                i31 = i6;
                                                str7 = str12;
                                                j5 = m5744constructorimpl;
                                                j6 = j2;
                                            }
                                            float f10 = i12 != 0 ? 0.0f : f2;
                                            java.lang.String str13 = i13 != 0 ? null : str2;
                                            java.lang.Object obj4 = i14 != 0 ? null : obj;
                                            java.lang.String str14 = i15 != 0 ? null : str3;
                                            boolean z10 = i17 != 0 ? true : z3;
                                            float f11 = i19 != 0 ? 0.0f : f3;
                                            if (i20 != 0) {
                                                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                                                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda47
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final java.lang.Object invoke(java.lang.Object obj5) {
                                                            boolean AdvancedMarker_3D_2zJA$lambda$0$0;
                                                            AdvancedMarker_3D_2zJA$lambda$0$0 = com.google.maps.android.compose.MarkerKt.AdvancedMarker_3D_2zJA$lambda$0$0((com.google.android.gms.maps.model.Marker) obj5);
                                                            return java.lang.Boolean.valueOf(AdvancedMarker_3D_2zJA$lambda$0$0);
                                                        }
                                                    };
                                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                                }
                                                function19 = (kotlin.jvm.functions.Function1) rememberedValue;
                                            } else {
                                                function19 = function1;
                                            }
                                            if (i22 != 0) {
                                                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                                                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                    rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda48
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final java.lang.Object invoke(java.lang.Object obj5) {
                                                            kotlin.Unit AdvancedMarker_3D_2zJA$lambda$1$0;
                                                            AdvancedMarker_3D_2zJA$lambda$1$0 = com.google.maps.android.compose.MarkerKt.AdvancedMarker_3D_2zJA$lambda$1$0((com.google.android.gms.maps.model.Marker) obj5);
                                                            return AdvancedMarker_3D_2zJA$lambda$1$0;
                                                        }
                                                    };
                                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                                }
                                                function110 = (kotlin.jvm.functions.Function1) rememberedValue2;
                                            } else {
                                                function110 = function12;
                                            }
                                            if (i23 != 0) {
                                                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                                                str8 = str13;
                                                if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                    rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda49
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final java.lang.Object invoke(java.lang.Object obj5) {
                                                            kotlin.Unit AdvancedMarker_3D_2zJA$lambda$2$0;
                                                            AdvancedMarker_3D_2zJA$lambda$2$0 = com.google.maps.android.compose.MarkerKt.AdvancedMarker_3D_2zJA$lambda$2$0((com.google.android.gms.maps.model.Marker) obj5);
                                                            return AdvancedMarker_3D_2zJA$lambda$2$0;
                                                        }
                                                    };
                                                    startRestartGroup.updateRememberedValue(rememberedValue3);
                                                }
                                                function111 = (kotlin.jvm.functions.Function1) rememberedValue3;
                                            } else {
                                                str8 = str13;
                                                function111 = function13;
                                            }
                                            if (i24 != 0) {
                                                java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                                                function112 = function111;
                                                if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                    rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda50
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final java.lang.Object invoke(java.lang.Object obj5) {
                                                            kotlin.Unit AdvancedMarker_3D_2zJA$lambda$3$0;
                                                            AdvancedMarker_3D_2zJA$lambda$3$0 = com.google.maps.android.compose.MarkerKt.AdvancedMarker_3D_2zJA$lambda$3$0((com.google.android.gms.maps.model.Marker) obj5);
                                                            return AdvancedMarker_3D_2zJA$lambda$3$0;
                                                        }
                                                    };
                                                    startRestartGroup.updateRememberedValue(rememberedValue4);
                                                }
                                                function113 = (kotlin.jvm.functions.Function1) rememberedValue4;
                                            } else {
                                                function112 = function111;
                                                function113 = function14;
                                            }
                                            com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptor4 = i25 != 0 ? null : bitmapDescriptor;
                                            com.google.android.gms.maps.model.PinConfig pinConfig4 = i26 != 0 ? null : pinConfig;
                                            android.view.View view4 = i27 != 0 ? null : view;
                                            function114 = function112;
                                            function115 = function113;
                                            f8 = f11;
                                            function116 = function19;
                                            function117 = function110;
                                            bitmapDescriptor3 = bitmapDescriptor4;
                                            i32 = i28 != 0 ? 0 : i;
                                            pinConfig3 = pinConfig4;
                                            markerState2 = markerState3;
                                            view3 = view4;
                                            i33 = i31;
                                            str9 = str8;
                                            obj3 = obj4;
                                            str10 = str14;
                                            z9 = z10;
                                            str4 = str7;
                                            f9 = f10;
                                            j7 = j6;
                                            j8 = j5;
                                        }
                                        startRestartGroup.endDefaults();
                                        composer2 = startRestartGroup;
                                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                            str11 = str10;
                                            androidx.compose.runtime.ComposerKt.traceEventStart(-1413763483, i33, i18, "com.google.maps.android.compose.AdvancedMarker (Marker.kt:754)");
                                        } else {
                                            str11 = str10;
                                        }
                                        m10525AdvancedMarkerImplmyiKm0s(markerState2, str4, f7, j8, z7, z8, j7, f9, str9, obj3, str11, z9, f8, function116, function117, function114, function115, null, null, bitmapDescriptor3, pinConfig3, view3, i32, composer2, i33 & 2147483646, (4194302 & i18) | ((i18 << 6) & 1879048192), ((i18 >> 24) & 126) | ((i29 << 6) & 896), 393216);
                                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                                        }
                                        obj2 = obj3;
                                        z5 = z8;
                                        f6 = f8;
                                        function15 = function116;
                                        function16 = function117;
                                        function17 = function114;
                                        function18 = function115;
                                        bitmapDescriptor2 = bitmapDescriptor3;
                                        pinConfig2 = pinConfig3;
                                        view2 = view3;
                                        i30 = i32;
                                        z6 = z9;
                                        str5 = str9;
                                        f5 = f9;
                                        boolean z11 = z7;
                                        str6 = str11;
                                        long j9 = j8;
                                        f4 = f7;
                                        j4 = j7;
                                        z4 = z11;
                                        j3 = j9;
                                    } else {
                                        composer2 = startRestartGroup;
                                        composer2.skipToGroupEnd();
                                        markerState2 = markerState;
                                        str4 = str;
                                        f4 = f;
                                        j3 = j;
                                        z4 = z;
                                        z5 = z2;
                                        j4 = j2;
                                        f5 = f2;
                                        str5 = str2;
                                        obj2 = obj;
                                        str6 = str3;
                                        z6 = z3;
                                        f6 = f3;
                                        function15 = function1;
                                        function16 = function12;
                                        function17 = function13;
                                        function18 = function14;
                                        bitmapDescriptor2 = bitmapDescriptor;
                                        pinConfig2 = pinConfig;
                                        view2 = view;
                                        i30 = i;
                                    }
                                    endRestartGroup = composer2.endRestartGroup();
                                    if (endRestartGroup != null) {
                                        final float f12 = f6;
                                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda51
                                            @Override // kotlin.jvm.functions.Function2
                                            public final java.lang.Object invoke(java.lang.Object obj5, java.lang.Object obj6) {
                                                kotlin.Unit AdvancedMarker_3D_2zJA$lambda$4;
                                                AdvancedMarker_3D_2zJA$lambda$4 = com.google.maps.android.compose.MarkerKt.AdvancedMarker_3D_2zJA$lambda$4(com.google.maps.android.compose.MarkerState.this, str4, f4, j3, z4, z5, j4, f5, str5, obj2, str6, z6, f12, function15, function16, function17, function18, bitmapDescriptor2, pinConfig2, view2, i30, i2, i3, i4, i5, (androidx.compose.runtime.Composer) obj5, ((java.lang.Integer) obj6).intValue());
                                                return AdvancedMarker_3D_2zJA$lambda$4;
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                            }
                            i23 = i5 & 32768;
                            if (i23 != 0) {
                            }
                            i24 = i5 & 65536;
                            if (i24 != 0) {
                            }
                            i25 = i5 & 131072;
                            if (i25 != 0) {
                            }
                            i26 = i5 & 262144;
                            if (i26 != 0) {
                            }
                            i27 = i5 & 524288;
                            if (i27 != 0) {
                            }
                            i28 = i5 & 1048576;
                            if (i28 != 0) {
                            }
                            if (startRestartGroup.shouldExecute(((i6 & 306783379) != 306783378 && (306783379 & i18) == 306783378 && (i29 & 3) == 2) ? false : true, i6 & 1)) {
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        i21 = i5 & 16384;
                        if (i21 == 0) {
                        }
                        i23 = i5 & 32768;
                        if (i23 != 0) {
                        }
                        i24 = i5 & 65536;
                        if (i24 != 0) {
                        }
                        i25 = i5 & 131072;
                        if (i25 != 0) {
                        }
                        i26 = i5 & 262144;
                        if (i26 != 0) {
                        }
                        i27 = i5 & 524288;
                        if (i27 != 0) {
                        }
                        i28 = i5 & 1048576;
                        if (i28 != 0) {
                        }
                        if (startRestartGroup.shouldExecute(((i6 & 306783379) != 306783378 && (306783379 & i18) == 306783378 && (i29 & 3) == 2) ? false : true, i6 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i20 = i5 & 8192;
                    if (i20 != 0) {
                    }
                    i21 = i5 & 16384;
                    if (i21 == 0) {
                    }
                    i23 = i5 & 32768;
                    if (i23 != 0) {
                    }
                    i24 = i5 & 65536;
                    if (i24 != 0) {
                    }
                    i25 = i5 & 131072;
                    if (i25 != 0) {
                    }
                    i26 = i5 & 262144;
                    if (i26 != 0) {
                    }
                    i27 = i5 & 524288;
                    if (i27 != 0) {
                    }
                    i28 = i5 & 1048576;
                    if (i28 != 0) {
                    }
                    if (startRestartGroup.shouldExecute(((i6 & 306783379) != 306783378 && (306783379 & i18) == 306783378 && (i29 & 3) == 2) ? false : true, i6 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i10 = i5 & 32;
                if (i10 == 0) {
                }
                i11 = i5 & 64;
                if (i11 == 0) {
                }
                i12 = i5 & 128;
                if (i12 == 0) {
                }
                i13 = i5 & 256;
                if (i13 == 0) {
                }
                i14 = i5 & 512;
                if (i14 == 0) {
                }
                i15 = i5 & 1024;
                if (i15 == 0) {
                }
                i17 = i5 & 2048;
                if (i17 == 0) {
                }
                i18 = i16;
                i19 = i5 & 4096;
                if (i19 == 0) {
                }
                i20 = i5 & 8192;
                if (i20 != 0) {
                }
                i21 = i5 & 16384;
                if (i21 == 0) {
                }
                i23 = i5 & 32768;
                if (i23 != 0) {
                }
                i24 = i5 & 65536;
                if (i24 != 0) {
                }
                i25 = i5 & 131072;
                if (i25 != 0) {
                }
                i26 = i5 & 262144;
                if (i26 != 0) {
                }
                i27 = i5 & 524288;
                if (i27 != 0) {
                }
                i28 = i5 & 1048576;
                if (i28 != 0) {
                }
                if (startRestartGroup.shouldExecute(((i6 & 306783379) != 306783378 && (306783379 & i18) == 306783378 && (i29 & 3) == 2) ? false : true, i6 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i8 = i5 & 8;
            if (i8 != 0) {
            }
            i9 = i5 & 16;
            if (i9 != 0) {
            }
            i10 = i5 & 32;
            if (i10 == 0) {
            }
            i11 = i5 & 64;
            if (i11 == 0) {
            }
            i12 = i5 & 128;
            if (i12 == 0) {
            }
            i13 = i5 & 256;
            if (i13 == 0) {
            }
            i14 = i5 & 512;
            if (i14 == 0) {
            }
            i15 = i5 & 1024;
            if (i15 == 0) {
            }
            i17 = i5 & 2048;
            if (i17 == 0) {
            }
            i18 = i16;
            i19 = i5 & 4096;
            if (i19 == 0) {
            }
            i20 = i5 & 8192;
            if (i20 != 0) {
            }
            i21 = i5 & 16384;
            if (i21 == 0) {
            }
            i23 = i5 & 32768;
            if (i23 != 0) {
            }
            i24 = i5 & 65536;
            if (i24 != 0) {
            }
            i25 = i5 & 131072;
            if (i25 != 0) {
            }
            i26 = i5 & 262144;
            if (i26 != 0) {
            }
            i27 = i5 & 524288;
            if (i27 != 0) {
            }
            i28 = i5 & 1048576;
            if (i28 != 0) {
            }
            if (startRestartGroup.shouldExecute(((i6 & 306783379) != 306783378 && (306783379 & i18) == 306783378 && (i29 & 3) == 2) ? false : true, i6 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        i8 = i5 & 8;
        if (i8 != 0) {
        }
        i9 = i5 & 16;
        if (i9 != 0) {
        }
        i10 = i5 & 32;
        if (i10 == 0) {
        }
        i11 = i5 & 64;
        if (i11 == 0) {
        }
        i12 = i5 & 128;
        if (i12 == 0) {
        }
        i13 = i5 & 256;
        if (i13 == 0) {
        }
        i14 = i5 & 512;
        if (i14 == 0) {
        }
        i15 = i5 & 1024;
        if (i15 == 0) {
        }
        i17 = i5 & 2048;
        if (i17 == 0) {
        }
        i18 = i16;
        i19 = i5 & 4096;
        if (i19 == 0) {
        }
        i20 = i5 & 8192;
        if (i20 != 0) {
        }
        i21 = i5 & 16384;
        if (i21 == 0) {
        }
        i23 = i5 & 32768;
        if (i23 != 0) {
        }
        i24 = i5 & 65536;
        if (i24 != 0) {
        }
        i25 = i5 & 131072;
        if (i25 != 0) {
        }
        i26 = i5 & 262144;
        if (i26 != 0) {
        }
        i27 = i5 & 524288;
        if (i27 != 0) {
        }
        i28 = i5 & 1048576;
        if (i28 != 0) {
        }
        if (startRestartGroup.shouldExecute(((i6 & 306783379) != 306783378 && (306783379 & i18) == 306783378 && (i29 & 3) == 2) ? false : true, i6 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit AdvancedMarkerImpl_myiKm0s$lambda$1$0(com.google.android.gms.maps.model.Marker marker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(marker, "");
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit AdvancedMarkerImpl_myiKm0s$lambda$2$0(com.google.android.gms.maps.model.Marker marker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(marker, "");
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit AdvancedMarkerImpl_myiKm0s$lambda$3$0(com.google.android.gms.maps.model.Marker marker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(marker, "");
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x07cf  */
    /* JADX WARN: Removed duplicated region for block: B:190:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0798  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02eb  */
    /* renamed from: AdvancedMarkerImpl-myiKm0s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m10525AdvancedMarkerImplmyiKm0s(com.google.maps.android.compose.MarkerState markerState, java.lang.String str, float f, long j, boolean z, boolean z2, long j2, float f2, java.lang.String str2, java.lang.Object obj, java.lang.String str3, boolean z3, float f3, kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, java.lang.Boolean> function1, kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function12, kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function13, kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function14, kotlin.jvm.functions.Function3<? super com.google.android.gms.maps.model.Marker, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, kotlin.jvm.functions.Function3<? super com.google.android.gms.maps.model.Marker, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function32, com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptor, com.google.android.gms.maps.model.PinConfig pinConfig, android.view.View view, int i, androidx.compose.runtime.Composer composer, final int i2, final int i3, final int i4, final int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        final com.google.maps.android.compose.MarkerState markerState2;
        final java.lang.String str4;
        final float f4;
        final long j3;
        final boolean z4;
        final boolean z5;
        final long j4;
        final float f5;
        final java.lang.String str5;
        final java.lang.Object obj2;
        final java.lang.String str6;
        final boolean z6;
        float f6;
        final kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, java.lang.Boolean> function15;
        final kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function16;
        final kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function17;
        final kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function18;
        final kotlin.jvm.functions.Function3<? super com.google.android.gms.maps.model.Marker, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function33;
        final kotlin.jvm.functions.Function3<? super com.google.android.gms.maps.model.Marker, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function34;
        final com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptor2;
        final com.google.android.gms.maps.model.PinConfig pinConfig2;
        final android.view.View view2;
        final int i34;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        com.google.maps.android.compose.MarkerState markerState3;
        float f7;
        long j5;
        boolean z7;
        boolean z8;
        int i35;
        java.lang.String str7;
        long j6;
        long j7;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, java.lang.Boolean> function19;
        java.lang.String str8;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function110;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function111;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function112;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function113;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function114;
        java.lang.String str9;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function115;
        boolean z9;
        com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptor3;
        com.google.android.gms.maps.model.PinConfig pinConfig3;
        android.view.View view3;
        com.google.maps.android.compose.MarkerState markerState4;
        float f8;
        java.lang.String str10;
        java.lang.Object obj3;
        java.lang.String str11;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, java.lang.Boolean> function116;
        int i36;
        int i37;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function117;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function118;
        kotlin.jvm.functions.Function3<? super com.google.android.gms.maps.model.Marker, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function35;
        kotlin.jvm.functions.Function3<? super com.google.android.gms.maps.model.Marker, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function36;
        java.lang.Object obj4;
        float f9;
        float f10;
        long j8;
        long j9;
        long j10;
        float f11;
        int i38;
        com.google.maps.android.compose.MapApplier mapApplier;
        int i39;
        int i40;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(838140709);
        if ((i2 & 6) == 0) {
            if ((i5 & 1) == 0 && startRestartGroup.changed(markerState)) {
                i40 = 4;
                i6 = i40 | i2;
            }
            i40 = 2;
            i6 = i40 | i2;
        } else {
            i6 = i2;
        }
        int i41 = i5 & 2;
        if (i41 != 0) {
            i6 |= 48;
        } else if ((i2 & 48) == 0) {
            i6 |= startRestartGroup.changed(str) ? 32 : 16;
            i7 = i5 & 4;
            if (i7 == 0) {
                i6 |= 384;
            } else if ((i2 & 384) == 0) {
                i6 |= startRestartGroup.changed(f) ? 256 : 128;
                i8 = i5 & 8;
                if (i8 != 0) {
                    i6 |= 3072;
                } else if ((i2 & 3072) == 0) {
                    i6 |= startRestartGroup.changed(j) ? 2048 : 1024;
                }
                i9 = i5 & 16;
                if (i9 != 0) {
                    i6 |= 24576;
                } else if ((i2 & 24576) == 0) {
                    i6 |= startRestartGroup.changed(z) ? 16384 : 8192;
                    i10 = i5 & 32;
                    if (i10 == 0) {
                        i6 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i2 & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i6 |= startRestartGroup.changed(z2) ? 131072 : 65536;
                    }
                    i11 = i5 & 64;
                    if (i11 == 0) {
                        i6 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        i6 |= startRestartGroup.changed(j2) ? 1048576 : 524288;
                    }
                    i12 = i5 & 128;
                    if (i12 == 0) {
                        i6 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        i6 |= startRestartGroup.changed(f2) ? 8388608 : 4194304;
                    }
                    i13 = i5 & 256;
                    if (i13 == 0) {
                        i6 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        i6 |= startRestartGroup.changed(str2) ? 67108864 : 33554432;
                    }
                    i14 = i5 & 512;
                    if (i14 == 0) {
                        i6 |= 805306368;
                    } else if ((i2 & 805306368) == 0) {
                        i6 |= startRestartGroup.changedInstance(obj) ? 536870912 : 268435456;
                    }
                    i15 = i5 & 1024;
                    if (i15 == 0) {
                        i16 = i3 | 6;
                    } else if ((i3 & 6) == 0) {
                        i16 = i3 | (startRestartGroup.changed(str3) ? 4 : 2);
                    } else {
                        i16 = i3;
                    }
                    i17 = i5 & 2048;
                    if (i17 == 0) {
                        i16 |= 48;
                    } else if ((i3 & 48) == 0) {
                        i16 |= startRestartGroup.changed(z3) ? 32 : 16;
                    }
                    i18 = i16;
                    i19 = i5 & 4096;
                    if (i19 == 0) {
                        i18 |= 384;
                    } else if ((i3 & 384) == 0) {
                        i18 |= startRestartGroup.changed(f3) ? 256 : 128;
                        i20 = i5 & 8192;
                        if (i20 != 0) {
                            i18 |= 3072;
                            i21 = i20;
                        } else {
                            i21 = i20;
                            if ((i3 & 3072) == 0) {
                                i18 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
                                i22 = i5 & 16384;
                                if (i22 == 0) {
                                    i18 |= 24576;
                                    i23 = i22;
                                } else {
                                    i23 = i22;
                                    if ((i3 & 24576) == 0) {
                                        i18 |= startRestartGroup.changedInstance(function12) ? 16384 : 8192;
                                        i24 = i5 & 32768;
                                        if (i24 != 0) {
                                            i18 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                                        } else if ((i3 & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                            i18 |= startRestartGroup.changedInstance(function13) ? 131072 : 65536;
                                        }
                                        i25 = i5 & 65536;
                                        if (i25 != 0) {
                                            i18 |= 1572864;
                                        } else if ((i3 & 1572864) == 0) {
                                            i18 |= startRestartGroup.changedInstance(function14) ? 1048576 : 524288;
                                        }
                                        i26 = i5 & 131072;
                                        if (i26 != 0) {
                                            i18 |= 12582912;
                                        } else if ((i3 & 12582912) == 0) {
                                            i18 |= startRestartGroup.changedInstance(function3) ? 8388608 : 4194304;
                                        }
                                        i27 = i5 & 262144;
                                        if (i27 != 0) {
                                            i18 |= 100663296;
                                        } else if ((i3 & 100663296) == 0) {
                                            i18 |= startRestartGroup.changedInstance(function32) ? 67108864 : 33554432;
                                        }
                                        i28 = i5 & 524288;
                                        if (i28 == 0) {
                                            i39 = (i3 & 805306368) == 0 ? startRestartGroup.changed(bitmapDescriptor) ? 536870912 : 268435456 : 805306368;
                                            i29 = i5 & 1048576;
                                            if (i29 == 0) {
                                                i30 = i4 | 6;
                                            } else if ((i4 & 6) == 0) {
                                                i30 = i4 | (startRestartGroup.changed(pinConfig) ? 4 : 2);
                                            } else {
                                                i30 = i4;
                                            }
                                            i31 = i5 & 2097152;
                                            if (i31 == 0) {
                                                i30 |= 48;
                                            } else if ((i4 & 48) == 0) {
                                                i30 |= startRestartGroup.changedInstance(view) ? 32 : 16;
                                            }
                                            i32 = i30;
                                            i33 = i5 & 4194304;
                                            if (i33 == 0) {
                                                i32 |= 384;
                                            } else if ((i4 & 384) == 0) {
                                                i32 |= startRestartGroup.changed(i) ? 256 : 128;
                                                if (startRestartGroup.shouldExecute(((i6 & 306783379) != 306783378 && (306783379 & i18) == 306783378 && (i32 & 147) == 146) ? false : true, i6 & 1)) {
                                                    startRestartGroup.startDefaults();
                                                    if ((i2 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                                        startRestartGroup.skipToGroupEnd();
                                                        if ((i5 & 1) != 0) {
                                                            i6 &= -15;
                                                        }
                                                        markerState4 = markerState;
                                                        str11 = str;
                                                        f8 = f;
                                                        z7 = z;
                                                        z8 = z2;
                                                        j8 = j2;
                                                        f10 = f2;
                                                        str9 = str2;
                                                        obj4 = obj;
                                                        str10 = str3;
                                                        z9 = z3;
                                                        f9 = f3;
                                                        function116 = function1;
                                                        function117 = function12;
                                                        function35 = function3;
                                                        function36 = function32;
                                                        bitmapDescriptor3 = bitmapDescriptor;
                                                        pinConfig3 = pinConfig;
                                                        view3 = view;
                                                        i37 = i;
                                                        i36 = i6;
                                                        j9 = j;
                                                        function118 = function13;
                                                        function115 = function14;
                                                    } else {
                                                        if ((i5 & 1) != 0) {
                                                            markerState3 = rememberUpdatedMarkerState(null, startRestartGroup, 0, 1);
                                                            i6 &= -15;
                                                        } else {
                                                            markerState3 = markerState;
                                                        }
                                                        java.lang.String str12 = i41 != 0 ? "" : str;
                                                        float f12 = i7 != 0 ? 1.0f : f;
                                                        if (i8 != 0) {
                                                            f7 = f12;
                                                            j5 = androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(0.5f) << 32) | (java.lang.Float.floatToRawIntBits(1.0f) & 4294967295L));
                                                        } else {
                                                            f7 = f12;
                                                            j5 = j;
                                                        }
                                                        z7 = i9 != 0 ? false : z;
                                                        z8 = i10 != 0 ? false : z2;
                                                        if (i11 != 0) {
                                                            i35 = i6;
                                                            str7 = str12;
                                                            j6 = j5;
                                                            j7 = androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(0.5f) << 32) | (java.lang.Float.floatToRawIntBits(0.0f) & 4294967295L));
                                                        } else {
                                                            i35 = i6;
                                                            str7 = str12;
                                                            j6 = j5;
                                                            j7 = j2;
                                                        }
                                                        float f13 = i12 != 0 ? 0.0f : f2;
                                                        java.lang.String str13 = i13 != 0 ? null : str2;
                                                        java.lang.Object obj5 = i14 != 0 ? null : obj;
                                                        java.lang.String str14 = i15 != 0 ? null : str3;
                                                        boolean z10 = i17 != 0 ? true : z3;
                                                        float f14 = i19 != 0 ? 0.0f : f3;
                                                        if (i21 != 0) {
                                                            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                                                            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda52
                                                                    @Override // kotlin.jvm.functions.Function1
                                                                    public final java.lang.Object invoke(java.lang.Object obj6) {
                                                                        boolean AdvancedMarkerImpl_myiKm0s$lambda$0$0;
                                                                        AdvancedMarkerImpl_myiKm0s$lambda$0$0 = com.google.maps.android.compose.MarkerKt.AdvancedMarkerImpl_myiKm0s$lambda$0$0((com.google.android.gms.maps.model.Marker) obj6);
                                                                        return java.lang.Boolean.valueOf(AdvancedMarkerImpl_myiKm0s$lambda$0$0);
                                                                    }
                                                                };
                                                                startRestartGroup.updateRememberedValue(rememberedValue);
                                                            }
                                                            function19 = (kotlin.jvm.functions.Function1) rememberedValue;
                                                        } else {
                                                            function19 = function1;
                                                        }
                                                        if (i23 != 0) {
                                                            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                                                            str8 = str13;
                                                            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda64
                                                                    @Override // kotlin.jvm.functions.Function1
                                                                    public final java.lang.Object invoke(java.lang.Object obj6) {
                                                                        kotlin.Unit AdvancedMarkerImpl_myiKm0s$lambda$1$0;
                                                                        AdvancedMarkerImpl_myiKm0s$lambda$1$0 = com.google.maps.android.compose.MarkerKt.AdvancedMarkerImpl_myiKm0s$lambda$1$0((com.google.android.gms.maps.model.Marker) obj6);
                                                                        return AdvancedMarkerImpl_myiKm0s$lambda$1$0;
                                                                    }
                                                                };
                                                                startRestartGroup.updateRememberedValue(rememberedValue2);
                                                            }
                                                            function110 = (kotlin.jvm.functions.Function1) rememberedValue2;
                                                        } else {
                                                            str8 = str13;
                                                            function110 = function12;
                                                        }
                                                        if (i24 != 0) {
                                                            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                                                            function111 = function110;
                                                            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda72
                                                                    @Override // kotlin.jvm.functions.Function1
                                                                    public final java.lang.Object invoke(java.lang.Object obj6) {
                                                                        kotlin.Unit AdvancedMarkerImpl_myiKm0s$lambda$2$0;
                                                                        AdvancedMarkerImpl_myiKm0s$lambda$2$0 = com.google.maps.android.compose.MarkerKt.AdvancedMarkerImpl_myiKm0s$lambda$2$0((com.google.android.gms.maps.model.Marker) obj6);
                                                                        return AdvancedMarkerImpl_myiKm0s$lambda$2$0;
                                                                    }
                                                                };
                                                                startRestartGroup.updateRememberedValue(rememberedValue3);
                                                            }
                                                            function112 = (kotlin.jvm.functions.Function1) rememberedValue3;
                                                        } else {
                                                            function111 = function110;
                                                            function112 = function13;
                                                        }
                                                        if (i25 != 0) {
                                                            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                                                            function113 = function112;
                                                            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                                rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda73
                                                                    @Override // kotlin.jvm.functions.Function1
                                                                    public final java.lang.Object invoke(java.lang.Object obj6) {
                                                                        kotlin.Unit AdvancedMarkerImpl_myiKm0s$lambda$3$0;
                                                                        AdvancedMarkerImpl_myiKm0s$lambda$3$0 = com.google.maps.android.compose.MarkerKt.AdvancedMarkerImpl_myiKm0s$lambda$3$0((com.google.android.gms.maps.model.Marker) obj6);
                                                                        return AdvancedMarkerImpl_myiKm0s$lambda$3$0;
                                                                    }
                                                                };
                                                                startRestartGroup.updateRememberedValue(rememberedValue4);
                                                            }
                                                            function114 = (kotlin.jvm.functions.Function1) rememberedValue4;
                                                        } else {
                                                            function113 = function112;
                                                            function114 = function14;
                                                        }
                                                        kotlin.jvm.functions.Function3<? super com.google.android.gms.maps.model.Marker, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function37 = i26 != 0 ? null : function3;
                                                        kotlin.jvm.functions.Function3<? super com.google.android.gms.maps.model.Marker, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function38 = i27 != 0 ? null : function32;
                                                        com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptor4 = i28 != 0 ? null : bitmapDescriptor;
                                                        com.google.android.gms.maps.model.PinConfig pinConfig4 = i29 != 0 ? null : pinConfig;
                                                        android.view.View view4 = i31 != 0 ? null : view;
                                                        str9 = str8;
                                                        function115 = function114;
                                                        if (i33 != 0) {
                                                            z9 = z10;
                                                            bitmapDescriptor3 = bitmapDescriptor4;
                                                            pinConfig3 = pinConfig4;
                                                            view3 = view4;
                                                            markerState4 = markerState3;
                                                            java.lang.String str15 = str14;
                                                            f8 = f7;
                                                            str10 = str15;
                                                            obj3 = obj5;
                                                            str11 = str7;
                                                            function116 = function19;
                                                            i36 = i35;
                                                            i37 = 0;
                                                        } else {
                                                            z9 = z10;
                                                            bitmapDescriptor3 = bitmapDescriptor4;
                                                            pinConfig3 = pinConfig4;
                                                            view3 = view4;
                                                            markerState4 = markerState3;
                                                            java.lang.String str16 = str14;
                                                            f8 = f7;
                                                            str10 = str16;
                                                            obj3 = obj5;
                                                            str11 = str7;
                                                            function116 = function19;
                                                            i36 = i35;
                                                            i37 = i;
                                                        }
                                                        long j11 = j6;
                                                        function117 = function111;
                                                        function118 = function113;
                                                        function35 = function37;
                                                        function36 = function38;
                                                        obj4 = obj3;
                                                        f9 = f14;
                                                        f10 = f13;
                                                        j8 = j7;
                                                        j9 = j11;
                                                    }
                                                    startRestartGroup.endDefaults();
                                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                        f11 = f10;
                                                        j10 = j8;
                                                        androidx.compose.runtime.ComposerKt.traceEventStart(838140709, i36, i18, "com.google.maps.android.compose.AdvancedMarkerImpl (Marker.kt:837)");
                                                    } else {
                                                        j10 = j8;
                                                        f11 = f10;
                                                    }
                                                    androidx.compose.runtime.Applier<?> applier = startRestartGroup.getApplier();
                                                    if (applier instanceof com.google.maps.android.compose.MapApplier) {
                                                        mapApplier = (com.google.maps.android.compose.MapApplier) applier;
                                                        i38 = 0;
                                                    } else {
                                                        i38 = 0;
                                                        mapApplier = null;
                                                    }
                                                    final androidx.compose.runtime.CompositionContext rememberCompositionContext = androidx.compose.runtime.ComposablesKt.rememberCompositionContext(startRestartGroup, i38);
                                                    final boolean z11 = z8;
                                                    boolean z12 = (((i36 & 14) ^ 6) > 4 && startRestartGroup.changed(markerState4)) || (i36 & 6) == 4;
                                                    final boolean z13 = z7;
                                                    boolean z14 = (i32 & 896) == 256;
                                                    boolean changedInstance = startRestartGroup.changedInstance(view3);
                                                    final long j12 = j9;
                                                    boolean z15 = (i32 & 14) == 4;
                                                    boolean z16 = (1879048192 & i18) == 536870912;
                                                    final float f15 = f8;
                                                    boolean z17 = (i36 & 112) == 32;
                                                    final java.lang.String str17 = str11;
                                                    boolean z18 = (i36 & 896) == 256;
                                                    final android.view.View view5 = view3;
                                                    boolean z19 = (i36 & 7168) == 2048;
                                                    final com.google.maps.android.compose.MarkerState markerState5 = markerState4;
                                                    boolean z20 = (57344 & i36) == 16384;
                                                    boolean z21 = (458752 & i36) == 131072;
                                                    boolean z22 = (3670016 & i36) == 1048576;
                                                    boolean z23 = (29360128 & i36) == 8388608;
                                                    boolean z24 = (i36 & 234881024) == 67108864;
                                                    boolean z25 = (i18 & 14) == 4;
                                                    boolean z26 = (i18 & 112) == 32;
                                                    boolean z27 = (i18 & 896) == 256;
                                                    boolean changedInstance2 = startRestartGroup.changedInstance(mapApplier);
                                                    boolean changedInstance3 = startRestartGroup.changedInstance(obj4);
                                                    boolean changedInstance4 = startRestartGroup.changedInstance(rememberCompositionContext);
                                                    final java.lang.Object obj6 = obj4;
                                                    boolean z28 = (i18 & 7168) == 2048;
                                                    final com.google.maps.android.compose.MapApplier mapApplier2 = mapApplier;
                                                    boolean z29 = (57344 & i18) == 16384;
                                                    boolean z30 = (458752 & i18) == 131072;
                                                    boolean z31 = (3670016 & i18) == 1048576;
                                                    boolean z32 = (29360128 & i18) == 8388608;
                                                    boolean z33 = (i18 & 234881024) == 67108864;
                                                    java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                                                    if ((z23 | z18 | z15 | z12 | z14 | changedInstance | z16 | z17 | z19 | z20 | z21 | z22 | z24 | z25 | z26 | z27 | changedInstance2 | changedInstance3 | changedInstance4 | z28 | z29 | z30 | z31 | z32 | z33) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                        final int i42 = i37;
                                                        final com.google.android.gms.maps.model.PinConfig pinConfig5 = pinConfig3;
                                                        final com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptor5 = bitmapDescriptor3;
                                                        final long j13 = j10;
                                                        final float f16 = f11;
                                                        final java.lang.String str18 = str9;
                                                        final java.lang.String str19 = str10;
                                                        final boolean z34 = z9;
                                                        final float f17 = f9;
                                                        final kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, java.lang.Boolean> function119 = function116;
                                                        final kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function120 = function117;
                                                        final kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function121 = function118;
                                                        final kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function122 = function115;
                                                        final kotlin.jvm.functions.Function3<? super com.google.android.gms.maps.model.Marker, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function39 = function35;
                                                        final kotlin.jvm.functions.Function3<? super com.google.android.gms.maps.model.Marker, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function310 = function36;
                                                        rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda74
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final java.lang.Object invoke() {
                                                                com.google.maps.android.compose.MarkerNode AdvancedMarkerImpl_myiKm0s$lambda$4$0;
                                                                AdvancedMarkerImpl_myiKm0s$lambda$4$0 = com.google.maps.android.compose.MarkerKt.AdvancedMarkerImpl_myiKm0s$lambda$4$0(com.google.maps.android.compose.MarkerState.this, i42, view5, pinConfig5, bitmapDescriptor5, str17, f15, j12, z13, z11, j13, f16, str18, str19, z34, f17, mapApplier2, obj6, rememberCompositionContext, function119, function120, function121, function122, function39, function310);
                                                                return AdvancedMarkerImpl_myiKm0s$lambda$4$0;
                                                            }
                                                        };
                                                        startRestartGroup.updateRememberedValue(rememberedValue5);
                                                    }
                                                    kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue5;
                                                    if (!(startRestartGroup.getApplier() instanceof com.google.maps.android.compose.MapApplier)) {
                                                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                                                    }
                                                    startRestartGroup.startNode();
                                                    if (startRestartGroup.getInserting()) {
                                                        startRestartGroup.createNode(function0);
                                                    } else {
                                                        startRestartGroup.useNode();
                                                    }
                                                    androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                                                    kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, java.lang.Boolean> function123 = function116;
                                                    androidx.compose.runtime.Updater.m5310updateimpl(m5299constructorimpl, function123, (kotlin.jvm.functions.Function2<? super T, ? super kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, java.lang.Boolean>, kotlin.Unit>) new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda75
                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final java.lang.Object invoke(java.lang.Object obj7, java.lang.Object obj8) {
                                                            kotlin.Unit AdvancedMarkerImpl_myiKm0s$lambda$5$0;
                                                            AdvancedMarkerImpl_myiKm0s$lambda$5$0 = com.google.maps.android.compose.MarkerKt.AdvancedMarkerImpl_myiKm0s$lambda$5$0((com.google.maps.android.compose.MarkerNode) obj7, (kotlin.jvm.functions.Function1) obj8);
                                                            return AdvancedMarkerImpl_myiKm0s$lambda$5$0;
                                                        }
                                                    });
                                                    kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function124 = function117;
                                                    androidx.compose.runtime.Updater.m5310updateimpl(m5299constructorimpl, function124, (kotlin.jvm.functions.Function2<? super T, ? super kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit>, kotlin.Unit>) new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda76
                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final java.lang.Object invoke(java.lang.Object obj7, java.lang.Object obj8) {
                                                            kotlin.Unit AdvancedMarkerImpl_myiKm0s$lambda$5$1;
                                                            AdvancedMarkerImpl_myiKm0s$lambda$5$1 = com.google.maps.android.compose.MarkerKt.AdvancedMarkerImpl_myiKm0s$lambda$5$1((com.google.maps.android.compose.MarkerNode) obj7, (kotlin.jvm.functions.Function1) obj8);
                                                            return AdvancedMarkerImpl_myiKm0s$lambda$5$1;
                                                        }
                                                    });
                                                    kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function125 = function118;
                                                    androidx.compose.runtime.Updater.m5310updateimpl(m5299constructorimpl, function125, (kotlin.jvm.functions.Function2<? super T, ? super kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit>, kotlin.Unit>) new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda78
                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final java.lang.Object invoke(java.lang.Object obj7, java.lang.Object obj8) {
                                                            kotlin.Unit AdvancedMarkerImpl_myiKm0s$lambda$5$2;
                                                            AdvancedMarkerImpl_myiKm0s$lambda$5$2 = com.google.maps.android.compose.MarkerKt.AdvancedMarkerImpl_myiKm0s$lambda$5$2((com.google.maps.android.compose.MarkerNode) obj7, (kotlin.jvm.functions.Function1) obj8);
                                                            return AdvancedMarkerImpl_myiKm0s$lambda$5$2;
                                                        }
                                                    });
                                                    kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function126 = function115;
                                                    androidx.compose.runtime.Updater.m5310updateimpl(m5299constructorimpl, function126, (kotlin.jvm.functions.Function2<? super T, ? super kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit>, kotlin.Unit>) new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda79
                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final java.lang.Object invoke(java.lang.Object obj7, java.lang.Object obj8) {
                                                            kotlin.Unit AdvancedMarkerImpl_myiKm0s$lambda$5$3;
                                                            AdvancedMarkerImpl_myiKm0s$lambda$5$3 = com.google.maps.android.compose.MarkerKt.AdvancedMarkerImpl_myiKm0s$lambda$5$3((com.google.maps.android.compose.MarkerNode) obj7, (kotlin.jvm.functions.Function1) obj8);
                                                            return AdvancedMarkerImpl_myiKm0s$lambda$5$3;
                                                        }
                                                    });
                                                    kotlin.jvm.functions.Function3<? super com.google.android.gms.maps.model.Marker, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function311 = function36;
                                                    androidx.compose.runtime.Updater.m5310updateimpl(m5299constructorimpl, function311, (kotlin.jvm.functions.Function2<? super T, ? super kotlin.jvm.functions.Function3<? super com.google.android.gms.maps.model.Marker, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, kotlin.Unit>) new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda80
                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final java.lang.Object invoke(java.lang.Object obj7, java.lang.Object obj8) {
                                                            kotlin.Unit AdvancedMarkerImpl_myiKm0s$lambda$5$4;
                                                            AdvancedMarkerImpl_myiKm0s$lambda$5$4 = com.google.maps.android.compose.MarkerKt.AdvancedMarkerImpl_myiKm0s$lambda$5$4((com.google.maps.android.compose.MarkerNode) obj7, (kotlin.jvm.functions.Function3) obj8);
                                                            return AdvancedMarkerImpl_myiKm0s$lambda$5$4;
                                                        }
                                                    });
                                                    kotlin.jvm.functions.Function3<? super com.google.android.gms.maps.model.Marker, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function312 = function35;
                                                    androidx.compose.runtime.Updater.m5310updateimpl(m5299constructorimpl, function312, (kotlin.jvm.functions.Function2<? super T, ? super kotlin.jvm.functions.Function3<? super com.google.android.gms.maps.model.Marker, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, kotlin.Unit>) new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda53
                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final java.lang.Object invoke(java.lang.Object obj7, java.lang.Object obj8) {
                                                            kotlin.Unit AdvancedMarkerImpl_myiKm0s$lambda$5$5;
                                                            AdvancedMarkerImpl_myiKm0s$lambda$5$5 = com.google.maps.android.compose.MarkerKt.AdvancedMarkerImpl_myiKm0s$lambda$5$5((com.google.maps.android.compose.MarkerNode) obj7, (kotlin.jvm.functions.Function3) obj8);
                                                            return AdvancedMarkerImpl_myiKm0s$lambda$5$5;
                                                        }
                                                    });
                                                    androidx.compose.runtime.Updater.m5310updateimpl(m5299constructorimpl, java.lang.Float.valueOf(f15), (kotlin.jvm.functions.Function2<? super T, ? super java.lang.Float, kotlin.Unit>) new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda54
                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final java.lang.Object invoke(java.lang.Object obj7, java.lang.Object obj8) {
                                                            kotlin.Unit AdvancedMarkerImpl_myiKm0s$lambda$5$6;
                                                            AdvancedMarkerImpl_myiKm0s$lambda$5$6 = com.google.maps.android.compose.MarkerKt.AdvancedMarkerImpl_myiKm0s$lambda$5$6((com.google.maps.android.compose.MarkerNode) obj7, ((java.lang.Float) obj8).floatValue());
                                                            return AdvancedMarkerImpl_myiKm0s$lambda$5$6;
                                                        }
                                                    });
                                                    androidx.compose.runtime.Updater.m5310updateimpl(m5299constructorimpl, androidx.compose.ui.geometry.Offset.m5741boximpl(j12), (kotlin.jvm.functions.Function2<? super T, ? super androidx.compose.ui.geometry.Offset, kotlin.Unit>) new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda56
                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final java.lang.Object invoke(java.lang.Object obj7, java.lang.Object obj8) {
                                                            kotlin.Unit AdvancedMarkerImpl_myiKm0s$lambda$5$7;
                                                            AdvancedMarkerImpl_myiKm0s$lambda$5$7 = com.google.maps.android.compose.MarkerKt.AdvancedMarkerImpl_myiKm0s$lambda$5$7((com.google.maps.android.compose.MarkerNode) obj7, (androidx.compose.ui.geometry.Offset) obj8);
                                                            return AdvancedMarkerImpl_myiKm0s$lambda$5$7;
                                                        }
                                                    });
                                                    androidx.compose.runtime.Updater.m5310updateimpl(m5299constructorimpl, java.lang.Boolean.valueOf(z13), (kotlin.jvm.functions.Function2<? super T, ? super java.lang.Boolean, kotlin.Unit>) new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda57
                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final java.lang.Object invoke(java.lang.Object obj7, java.lang.Object obj8) {
                                                            kotlin.Unit AdvancedMarkerImpl_myiKm0s$lambda$5$8;
                                                            AdvancedMarkerImpl_myiKm0s$lambda$5$8 = com.google.maps.android.compose.MarkerKt.AdvancedMarkerImpl_myiKm0s$lambda$5$8((com.google.maps.android.compose.MarkerNode) obj7, ((java.lang.Boolean) obj8).booleanValue());
                                                            return AdvancedMarkerImpl_myiKm0s$lambda$5$8;
                                                        }
                                                    });
                                                    androidx.compose.runtime.Updater.m5310updateimpl(m5299constructorimpl, java.lang.Boolean.valueOf(z11), (kotlin.jvm.functions.Function2<? super T, ? super java.lang.Boolean, kotlin.Unit>) new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda58
                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final java.lang.Object invoke(java.lang.Object obj7, java.lang.Object obj8) {
                                                            kotlin.Unit AdvancedMarkerImpl_myiKm0s$lambda$5$9;
                                                            AdvancedMarkerImpl_myiKm0s$lambda$5$9 = com.google.maps.android.compose.MarkerKt.AdvancedMarkerImpl_myiKm0s$lambda$5$9((com.google.maps.android.compose.MarkerNode) obj7, ((java.lang.Boolean) obj8).booleanValue());
                                                            return AdvancedMarkerImpl_myiKm0s$lambda$5$9;
                                                        }
                                                    });
                                                    androidx.compose.runtime.Updater.m5310updateimpl(m5299constructorimpl, androidx.compose.ui.geometry.Offset.m5741boximpl(j10), (kotlin.jvm.functions.Function2<? super T, ? super androidx.compose.ui.geometry.Offset, kotlin.Unit>) new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda59
                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final java.lang.Object invoke(java.lang.Object obj7, java.lang.Object obj8) {
                                                            kotlin.Unit AdvancedMarkerImpl_myiKm0s$lambda$5$10;
                                                            AdvancedMarkerImpl_myiKm0s$lambda$5$10 = com.google.maps.android.compose.MarkerKt.AdvancedMarkerImpl_myiKm0s$lambda$5$10((com.google.maps.android.compose.MarkerNode) obj7, (androidx.compose.ui.geometry.Offset) obj8);
                                                            return AdvancedMarkerImpl_myiKm0s$lambda$5$10;
                                                        }
                                                    });
                                                    androidx.compose.runtime.Updater.m5310updateimpl(m5299constructorimpl, markerState5.getPosition(), (kotlin.jvm.functions.Function2<? super T, ? super com.google.android.gms.maps.model.LatLng, kotlin.Unit>) new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda60
                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final java.lang.Object invoke(java.lang.Object obj7, java.lang.Object obj8) {
                                                            kotlin.Unit AdvancedMarkerImpl_myiKm0s$lambda$5$11;
                                                            AdvancedMarkerImpl_myiKm0s$lambda$5$11 = com.google.maps.android.compose.MarkerKt.AdvancedMarkerImpl_myiKm0s$lambda$5$11((com.google.maps.android.compose.MarkerNode) obj7, (com.google.android.gms.maps.model.LatLng) obj8);
                                                            return AdvancedMarkerImpl_myiKm0s$lambda$5$11;
                                                        }
                                                    });
                                                    androidx.compose.runtime.Updater.m5310updateimpl(m5299constructorimpl, java.lang.Float.valueOf(f11), (kotlin.jvm.functions.Function2<? super T, ? super java.lang.Float, kotlin.Unit>) new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda61
                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final java.lang.Object invoke(java.lang.Object obj7, java.lang.Object obj8) {
                                                            kotlin.Unit AdvancedMarkerImpl_myiKm0s$lambda$5$12;
                                                            AdvancedMarkerImpl_myiKm0s$lambda$5$12 = com.google.maps.android.compose.MarkerKt.AdvancedMarkerImpl_myiKm0s$lambda$5$12((com.google.maps.android.compose.MarkerNode) obj7, ((java.lang.Float) obj8).floatValue());
                                                            return AdvancedMarkerImpl_myiKm0s$lambda$5$12;
                                                        }
                                                    });
                                                    java.lang.String str20 = str9;
                                                    androidx.compose.runtime.Updater.m5310updateimpl(m5299constructorimpl, str20, (kotlin.jvm.functions.Function2<? super T, ? super java.lang.String, kotlin.Unit>) new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda62
                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final java.lang.Object invoke(java.lang.Object obj7, java.lang.Object obj8) {
                                                            kotlin.Unit AdvancedMarkerImpl_myiKm0s$lambda$5$13;
                                                            AdvancedMarkerImpl_myiKm0s$lambda$5$13 = com.google.maps.android.compose.MarkerKt.AdvancedMarkerImpl_myiKm0s$lambda$5$13((com.google.maps.android.compose.MarkerNode) obj7, (java.lang.String) obj8);
                                                            return AdvancedMarkerImpl_myiKm0s$lambda$5$13;
                                                        }
                                                    });
                                                    androidx.compose.runtime.Updater.m5310updateimpl(m5299constructorimpl, obj6, (kotlin.jvm.functions.Function2<? super T, ? super java.lang.Object, kotlin.Unit>) new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda63
                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final java.lang.Object invoke(java.lang.Object obj7, java.lang.Object obj8) {
                                                            kotlin.Unit AdvancedMarkerImpl_myiKm0s$lambda$5$14;
                                                            AdvancedMarkerImpl_myiKm0s$lambda$5$14 = com.google.maps.android.compose.MarkerKt.AdvancedMarkerImpl_myiKm0s$lambda$5$14((com.google.maps.android.compose.MarkerNode) obj7, obj8);
                                                            return AdvancedMarkerImpl_myiKm0s$lambda$5$14;
                                                        }
                                                    });
                                                    java.lang.String str21 = str10;
                                                    androidx.compose.runtime.Updater.m5310updateimpl(m5299constructorimpl, str21, (kotlin.jvm.functions.Function2<? super T, ? super java.lang.String, kotlin.Unit>) new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda65
                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final java.lang.Object invoke(java.lang.Object obj7, java.lang.Object obj8) {
                                                            kotlin.Unit AdvancedMarkerImpl_myiKm0s$lambda$5$15;
                                                            AdvancedMarkerImpl_myiKm0s$lambda$5$15 = com.google.maps.android.compose.MarkerKt.AdvancedMarkerImpl_myiKm0s$lambda$5$15((com.google.maps.android.compose.MarkerNode) obj7, (java.lang.String) obj8);
                                                            return AdvancedMarkerImpl_myiKm0s$lambda$5$15;
                                                        }
                                                    });
                                                    final com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptor6 = bitmapDescriptor3;
                                                    final com.google.android.gms.maps.model.PinConfig pinConfig6 = pinConfig3;
                                                    androidx.compose.runtime.Updater.m5310updateimpl(m5299constructorimpl, pinConfig6, (kotlin.jvm.functions.Function2<? super T, ? super com.google.android.gms.maps.model.PinConfig, kotlin.Unit>) new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda67
                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final java.lang.Object invoke(java.lang.Object obj7, java.lang.Object obj8) {
                                                            kotlin.Unit AdvancedMarkerImpl_myiKm0s$lambda$5$16;
                                                            AdvancedMarkerImpl_myiKm0s$lambda$5$16 = com.google.maps.android.compose.MarkerKt.AdvancedMarkerImpl_myiKm0s$lambda$5$16(com.google.android.gms.maps.model.BitmapDescriptor.this, view5, pinConfig6, (com.google.maps.android.compose.MarkerNode) obj7, (com.google.android.gms.maps.model.PinConfig) obj8);
                                                            return AdvancedMarkerImpl_myiKm0s$lambda$5$16;
                                                        }
                                                    });
                                                    androidx.compose.runtime.Updater.m5310updateimpl(m5299constructorimpl, bitmapDescriptor6, (kotlin.jvm.functions.Function2<? super T, ? super com.google.android.gms.maps.model.BitmapDescriptor, kotlin.Unit>) new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda68
                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final java.lang.Object invoke(java.lang.Object obj7, java.lang.Object obj8) {
                                                            kotlin.Unit AdvancedMarkerImpl_myiKm0s$lambda$5$17;
                                                            AdvancedMarkerImpl_myiKm0s$lambda$5$17 = com.google.maps.android.compose.MarkerKt.AdvancedMarkerImpl_myiKm0s$lambda$5$17(view5, (com.google.maps.android.compose.MarkerNode) obj7, (com.google.android.gms.maps.model.BitmapDescriptor) obj8);
                                                            return AdvancedMarkerImpl_myiKm0s$lambda$5$17;
                                                        }
                                                    });
                                                    androidx.compose.runtime.Updater.m5310updateimpl(m5299constructorimpl, java.lang.Boolean.valueOf(z9), (kotlin.jvm.functions.Function2<? super T, ? super java.lang.Boolean, kotlin.Unit>) new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda69
                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final java.lang.Object invoke(java.lang.Object obj7, java.lang.Object obj8) {
                                                            kotlin.Unit AdvancedMarkerImpl_myiKm0s$lambda$5$18;
                                                            AdvancedMarkerImpl_myiKm0s$lambda$5$18 = com.google.maps.android.compose.MarkerKt.AdvancedMarkerImpl_myiKm0s$lambda$5$18((com.google.maps.android.compose.MarkerNode) obj7, ((java.lang.Boolean) obj8).booleanValue());
                                                            return AdvancedMarkerImpl_myiKm0s$lambda$5$18;
                                                        }
                                                    });
                                                    androidx.compose.runtime.Updater.m5310updateimpl(m5299constructorimpl, java.lang.Float.valueOf(f9), (kotlin.jvm.functions.Function2<? super T, ? super java.lang.Float, kotlin.Unit>) new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda70
                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final java.lang.Object invoke(java.lang.Object obj7, java.lang.Object obj8) {
                                                            kotlin.Unit AdvancedMarkerImpl_myiKm0s$lambda$5$19;
                                                            AdvancedMarkerImpl_myiKm0s$lambda$5$19 = com.google.maps.android.compose.MarkerKt.AdvancedMarkerImpl_myiKm0s$lambda$5$19((com.google.maps.android.compose.MarkerNode) obj7, ((java.lang.Float) obj8).floatValue());
                                                            return AdvancedMarkerImpl_myiKm0s$lambda$5$19;
                                                        }
                                                    });
                                                    startRestartGroup.endNode();
                                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                                                    }
                                                    str4 = str17;
                                                    function18 = function126;
                                                    function34 = function311;
                                                    function15 = function123;
                                                    pinConfig2 = pinConfig6;
                                                    bitmapDescriptor2 = bitmapDescriptor6;
                                                    z6 = z9;
                                                    f6 = f9;
                                                    i34 = i37;
                                                    markerState2 = markerState5;
                                                    z4 = z13;
                                                    function16 = function124;
                                                    function17 = function125;
                                                    str5 = str20;
                                                    obj2 = obj6;
                                                    view2 = view5;
                                                    function33 = function312;
                                                    f5 = f11;
                                                    z5 = z11;
                                                    j3 = j12;
                                                    f4 = f15;
                                                    str6 = str21;
                                                    j4 = j10;
                                                } else {
                                                    startRestartGroup.skipToGroupEnd();
                                                    markerState2 = markerState;
                                                    str4 = str;
                                                    f4 = f;
                                                    j3 = j;
                                                    z4 = z;
                                                    z5 = z2;
                                                    j4 = j2;
                                                    f5 = f2;
                                                    str5 = str2;
                                                    obj2 = obj;
                                                    str6 = str3;
                                                    z6 = z3;
                                                    f6 = f3;
                                                    function15 = function1;
                                                    function16 = function12;
                                                    function17 = function13;
                                                    function18 = function14;
                                                    function33 = function3;
                                                    function34 = function32;
                                                    bitmapDescriptor2 = bitmapDescriptor;
                                                    pinConfig2 = pinConfig;
                                                    view2 = view;
                                                    i34 = i;
                                                }
                                                endRestartGroup = startRestartGroup.endRestartGroup();
                                                if (endRestartGroup != null) {
                                                    final float f18 = f6;
                                                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda71
                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final java.lang.Object invoke(java.lang.Object obj7, java.lang.Object obj8) {
                                                            kotlin.Unit AdvancedMarkerImpl_myiKm0s$lambda$6;
                                                            AdvancedMarkerImpl_myiKm0s$lambda$6 = com.google.maps.android.compose.MarkerKt.AdvancedMarkerImpl_myiKm0s$lambda$6(com.google.maps.android.compose.MarkerState.this, str4, f4, j3, z4, z5, j4, f5, str5, obj2, str6, z6, f18, function15, function16, function17, function18, function33, function34, bitmapDescriptor2, pinConfig2, view2, i34, i2, i3, i4, i5, (androidx.compose.runtime.Composer) obj7, ((java.lang.Integer) obj8).intValue());
                                                            return AdvancedMarkerImpl_myiKm0s$lambda$6;
                                                        }
                                                    });
                                                    return;
                                                }
                                                return;
                                            }
                                            if (startRestartGroup.shouldExecute(((i6 & 306783379) != 306783378 && (306783379 & i18) == 306783378 && (i32 & 147) == 146) ? false : true, i6 & 1)) {
                                            }
                                            endRestartGroup = startRestartGroup.endRestartGroup();
                                            if (endRestartGroup != null) {
                                            }
                                        }
                                        i18 |= i39;
                                        i29 = i5 & 1048576;
                                        if (i29 == 0) {
                                        }
                                        i31 = i5 & 2097152;
                                        if (i31 == 0) {
                                        }
                                        i32 = i30;
                                        i33 = i5 & 4194304;
                                        if (i33 == 0) {
                                        }
                                        if (startRestartGroup.shouldExecute(((i6 & 306783379) != 306783378 && (306783379 & i18) == 306783378 && (i32 & 147) == 146) ? false : true, i6 & 1)) {
                                        }
                                        endRestartGroup = startRestartGroup.endRestartGroup();
                                        if (endRestartGroup != null) {
                                        }
                                    }
                                }
                                i24 = i5 & 32768;
                                if (i24 != 0) {
                                }
                                i25 = i5 & 65536;
                                if (i25 != 0) {
                                }
                                i26 = i5 & 131072;
                                if (i26 != 0) {
                                }
                                i27 = i5 & 262144;
                                if (i27 != 0) {
                                }
                                i28 = i5 & 524288;
                                if (i28 == 0) {
                                }
                                i18 |= i39;
                                i29 = i5 & 1048576;
                                if (i29 == 0) {
                                }
                                i31 = i5 & 2097152;
                                if (i31 == 0) {
                                }
                                i32 = i30;
                                i33 = i5 & 4194304;
                                if (i33 == 0) {
                                }
                                if (startRestartGroup.shouldExecute(((i6 & 306783379) != 306783378 && (306783379 & i18) == 306783378 && (i32 & 147) == 146) ? false : true, i6 & 1)) {
                                }
                                endRestartGroup = startRestartGroup.endRestartGroup();
                                if (endRestartGroup != null) {
                                }
                            }
                        }
                        i22 = i5 & 16384;
                        if (i22 == 0) {
                        }
                        i24 = i5 & 32768;
                        if (i24 != 0) {
                        }
                        i25 = i5 & 65536;
                        if (i25 != 0) {
                        }
                        i26 = i5 & 131072;
                        if (i26 != 0) {
                        }
                        i27 = i5 & 262144;
                        if (i27 != 0) {
                        }
                        i28 = i5 & 524288;
                        if (i28 == 0) {
                        }
                        i18 |= i39;
                        i29 = i5 & 1048576;
                        if (i29 == 0) {
                        }
                        i31 = i5 & 2097152;
                        if (i31 == 0) {
                        }
                        i32 = i30;
                        i33 = i5 & 4194304;
                        if (i33 == 0) {
                        }
                        if (startRestartGroup.shouldExecute(((i6 & 306783379) != 306783378 && (306783379 & i18) == 306783378 && (i32 & 147) == 146) ? false : true, i6 & 1)) {
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i20 = i5 & 8192;
                    if (i20 != 0) {
                    }
                    i22 = i5 & 16384;
                    if (i22 == 0) {
                    }
                    i24 = i5 & 32768;
                    if (i24 != 0) {
                    }
                    i25 = i5 & 65536;
                    if (i25 != 0) {
                    }
                    i26 = i5 & 131072;
                    if (i26 != 0) {
                    }
                    i27 = i5 & 262144;
                    if (i27 != 0) {
                    }
                    i28 = i5 & 524288;
                    if (i28 == 0) {
                    }
                    i18 |= i39;
                    i29 = i5 & 1048576;
                    if (i29 == 0) {
                    }
                    i31 = i5 & 2097152;
                    if (i31 == 0) {
                    }
                    i32 = i30;
                    i33 = i5 & 4194304;
                    if (i33 == 0) {
                    }
                    if (startRestartGroup.shouldExecute(((i6 & 306783379) != 306783378 && (306783379 & i18) == 306783378 && (i32 & 147) == 146) ? false : true, i6 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i10 = i5 & 32;
                if (i10 == 0) {
                }
                i11 = i5 & 64;
                if (i11 == 0) {
                }
                i12 = i5 & 128;
                if (i12 == 0) {
                }
                i13 = i5 & 256;
                if (i13 == 0) {
                }
                i14 = i5 & 512;
                if (i14 == 0) {
                }
                i15 = i5 & 1024;
                if (i15 == 0) {
                }
                i17 = i5 & 2048;
                if (i17 == 0) {
                }
                i18 = i16;
                i19 = i5 & 4096;
                if (i19 == 0) {
                }
                i20 = i5 & 8192;
                if (i20 != 0) {
                }
                i22 = i5 & 16384;
                if (i22 == 0) {
                }
                i24 = i5 & 32768;
                if (i24 != 0) {
                }
                i25 = i5 & 65536;
                if (i25 != 0) {
                }
                i26 = i5 & 131072;
                if (i26 != 0) {
                }
                i27 = i5 & 262144;
                if (i27 != 0) {
                }
                i28 = i5 & 524288;
                if (i28 == 0) {
                }
                i18 |= i39;
                i29 = i5 & 1048576;
                if (i29 == 0) {
                }
                i31 = i5 & 2097152;
                if (i31 == 0) {
                }
                i32 = i30;
                i33 = i5 & 4194304;
                if (i33 == 0) {
                }
                if (startRestartGroup.shouldExecute(((i6 & 306783379) != 306783378 && (306783379 & i18) == 306783378 && (i32 & 147) == 146) ? false : true, i6 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i8 = i5 & 8;
            if (i8 != 0) {
            }
            i9 = i5 & 16;
            if (i9 != 0) {
            }
            i10 = i5 & 32;
            if (i10 == 0) {
            }
            i11 = i5 & 64;
            if (i11 == 0) {
            }
            i12 = i5 & 128;
            if (i12 == 0) {
            }
            i13 = i5 & 256;
            if (i13 == 0) {
            }
            i14 = i5 & 512;
            if (i14 == 0) {
            }
            i15 = i5 & 1024;
            if (i15 == 0) {
            }
            i17 = i5 & 2048;
            if (i17 == 0) {
            }
            i18 = i16;
            i19 = i5 & 4096;
            if (i19 == 0) {
            }
            i20 = i5 & 8192;
            if (i20 != 0) {
            }
            i22 = i5 & 16384;
            if (i22 == 0) {
            }
            i24 = i5 & 32768;
            if (i24 != 0) {
            }
            i25 = i5 & 65536;
            if (i25 != 0) {
            }
            i26 = i5 & 131072;
            if (i26 != 0) {
            }
            i27 = i5 & 262144;
            if (i27 != 0) {
            }
            i28 = i5 & 524288;
            if (i28 == 0) {
            }
            i18 |= i39;
            i29 = i5 & 1048576;
            if (i29 == 0) {
            }
            i31 = i5 & 2097152;
            if (i31 == 0) {
            }
            i32 = i30;
            i33 = i5 & 4194304;
            if (i33 == 0) {
            }
            if (startRestartGroup.shouldExecute(((i6 & 306783379) != 306783378 && (306783379 & i18) == 306783378 && (i32 & 147) == 146) ? false : true, i6 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        i8 = i5 & 8;
        if (i8 != 0) {
        }
        i9 = i5 & 16;
        if (i9 != 0) {
        }
        i10 = i5 & 32;
        if (i10 == 0) {
        }
        i11 = i5 & 64;
        if (i11 == 0) {
        }
        i12 = i5 & 128;
        if (i12 == 0) {
        }
        i13 = i5 & 256;
        if (i13 == 0) {
        }
        i14 = i5 & 512;
        if (i14 == 0) {
        }
        i15 = i5 & 1024;
        if (i15 == 0) {
        }
        i17 = i5 & 2048;
        if (i17 == 0) {
        }
        i18 = i16;
        i19 = i5 & 4096;
        if (i19 == 0) {
        }
        i20 = i5 & 8192;
        if (i20 != 0) {
        }
        i22 = i5 & 16384;
        if (i22 == 0) {
        }
        i24 = i5 & 32768;
        if (i24 != 0) {
        }
        i25 = i5 & 65536;
        if (i25 != 0) {
        }
        i26 = i5 & 131072;
        if (i26 != 0) {
        }
        i27 = i5 & 262144;
        if (i27 != 0) {
        }
        i28 = i5 & 524288;
        if (i28 == 0) {
        }
        i18 |= i39;
        i29 = i5 & 1048576;
        if (i29 == 0) {
        }
        i31 = i5 & 2097152;
        if (i31 == 0) {
        }
        i32 = i30;
        i33 = i5 & 4194304;
        if (i33 == 0) {
        }
        if (startRestartGroup.shouldExecute(((i6 & 306783379) != 306783378 && (306783379 & i18) == 306783378 && (i32 & 147) == 146) ? false : true, i6 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.google.maps.android.compose.MarkerNode AdvancedMarkerImpl_myiKm0s$lambda$4$0(com.google.maps.android.compose.MarkerState markerState, int i, android.view.View view, com.google.android.gms.maps.model.PinConfig pinConfig, com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptor, java.lang.String str, float f, long j, boolean z, boolean z2, long j2, float f2, java.lang.String str2, java.lang.String str3, boolean z3, float f3, com.google.maps.android.compose.MapApplier mapApplier, java.lang.Object obj, androidx.compose.runtime.CompositionContext compositionContext, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function1 function13, kotlin.jvm.functions.Function1 function14, kotlin.jvm.functions.Function3 function3, kotlin.jvm.functions.Function3 function32) {
        com.google.android.gms.maps.GoogleMap map;
        com.google.android.gms.maps.model.Marker addMarker;
        com.google.android.gms.maps.model.AdvancedMarkerOptions collisionBehavior = new com.google.android.gms.maps.model.AdvancedMarkerOptions().position(markerState.getPosition()).collisionBehavior(i);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(collisionBehavior, "");
        if (view != null) {
            collisionBehavior.iconView(view);
        } else if (pinConfig != null) {
            collisionBehavior.icon(com.google.android.gms.maps.model.BitmapDescriptorFactory.fromPinConfig(pinConfig));
        } else if (bitmapDescriptor != null) {
            collisionBehavior.icon(bitmapDescriptor);
        }
        collisionBehavior.contentDescription(str);
        collisionBehavior.alpha(f);
        collisionBehavior.anchor(java.lang.Float.intBitsToFloat((int) (j >> 32)), java.lang.Float.intBitsToFloat((int) (j & 4294967295L)));
        collisionBehavior.draggable(z);
        collisionBehavior.flat(z2);
        collisionBehavior.infoWindowAnchor(java.lang.Float.intBitsToFloat((int) (j2 >> 32)), java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L)));
        collisionBehavior.position(markerState.getPosition());
        collisionBehavior.rotation(f2);
        collisionBehavior.snippet(str2);
        collisionBehavior.title(str3);
        collisionBehavior.visible(z3);
        collisionBehavior.zIndex(f3);
        if (mapApplier == null || (map = mapApplier.getMap()) == null || (addMarker = map.addMarker(collisionBehavior)) == null) {
            throw new java.lang.IllegalStateException("Error adding marker".toString());
        }
        addMarker.setTag(obj);
        return new com.google.maps.android.compose.MarkerNode(compositionContext, addMarker, markerState, function1, function12, function13, function14, function3, function32);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit AdvancedMarkerImpl_myiKm0s$lambda$5$0(com.google.maps.android.compose.MarkerNode markerNode, kotlin.jvm.functions.Function1 function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(markerNode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        markerNode.setOnMarkerClick(function1);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit AdvancedMarkerImpl_myiKm0s$lambda$5$1(com.google.maps.android.compose.MarkerNode markerNode, kotlin.jvm.functions.Function1 function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(markerNode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        markerNode.setOnInfoWindowClick(function1);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit AdvancedMarkerImpl_myiKm0s$lambda$5$2(com.google.maps.android.compose.MarkerNode markerNode, kotlin.jvm.functions.Function1 function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(markerNode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        markerNode.setOnInfoWindowClose(function1);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit AdvancedMarkerImpl_myiKm0s$lambda$5$3(com.google.maps.android.compose.MarkerNode markerNode, kotlin.jvm.functions.Function1 function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(markerNode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        markerNode.setOnInfoWindowLongClick(function1);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit AdvancedMarkerImpl_myiKm0s$lambda$5$4(com.google.maps.android.compose.MarkerNode markerNode, kotlin.jvm.functions.Function3 function3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(markerNode, "");
        markerNode.setInfoContent(function3);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit AdvancedMarkerImpl_myiKm0s$lambda$5$5(com.google.maps.android.compose.MarkerNode markerNode, kotlin.jvm.functions.Function3 function3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(markerNode, "");
        markerNode.setInfoWindow(function3);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit AdvancedMarkerImpl_myiKm0s$lambda$5$6(com.google.maps.android.compose.MarkerNode markerNode, float f) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(markerNode, "");
        markerNode.getMarker().setAlpha(f);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit AdvancedMarkerImpl_myiKm0s$lambda$5$7(com.google.maps.android.compose.MarkerNode markerNode, androidx.compose.ui.geometry.Offset offset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(markerNode, "");
        markerNode.getMarker().setAnchor(java.lang.Float.intBitsToFloat((int) (offset.m5762unboximpl() >> 32)), java.lang.Float.intBitsToFloat((int) (offset.m5762unboximpl() & 4294967295L)));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit AdvancedMarkerImpl_myiKm0s$lambda$5$8(com.google.maps.android.compose.MarkerNode markerNode, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(markerNode, "");
        markerNode.getMarker().setDraggable(z);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit AdvancedMarkerImpl_myiKm0s$lambda$5$9(com.google.maps.android.compose.MarkerNode markerNode, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(markerNode, "");
        markerNode.getMarker().setFlat(z);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit AdvancedMarkerImpl_myiKm0s$lambda$5$10(com.google.maps.android.compose.MarkerNode markerNode, androidx.compose.ui.geometry.Offset offset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(markerNode, "");
        markerNode.getMarker().setInfoWindowAnchor(java.lang.Float.intBitsToFloat((int) (offset.m5762unboximpl() >> 32)), java.lang.Float.intBitsToFloat((int) (offset.m5762unboximpl() & 4294967295L)));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit AdvancedMarkerImpl_myiKm0s$lambda$5$11(com.google.maps.android.compose.MarkerNode markerNode, com.google.android.gms.maps.model.LatLng latLng) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(markerNode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(latLng, "");
        markerNode.getMarker().setPosition(latLng);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit AdvancedMarkerImpl_myiKm0s$lambda$5$12(com.google.maps.android.compose.MarkerNode markerNode, float f) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(markerNode, "");
        markerNode.getMarker().setRotation(f);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit AdvancedMarkerImpl_myiKm0s$lambda$5$13(com.google.maps.android.compose.MarkerNode markerNode, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(markerNode, "");
        markerNode.getMarker().setSnippet(str);
        if (markerNode.getMarker().isInfoWindowShown()) {
            markerNode.getMarker().showInfoWindow();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit AdvancedMarkerImpl_myiKm0s$lambda$5$14(com.google.maps.android.compose.MarkerNode markerNode, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(markerNode, "");
        markerNode.getMarker().setTag(obj);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit AdvancedMarkerImpl_myiKm0s$lambda$5$15(com.google.maps.android.compose.MarkerNode markerNode, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(markerNode, "");
        markerNode.getMarker().setTitle(str);
        if (markerNode.getMarker().isInfoWindowShown()) {
            markerNode.getMarker().showInfoWindow();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit AdvancedMarkerImpl_myiKm0s$lambda$5$16(com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptor, android.view.View view, com.google.android.gms.maps.model.PinConfig pinConfig, com.google.maps.android.compose.MarkerNode markerNode, com.google.android.gms.maps.model.PinConfig pinConfig2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(markerNode, "");
        if (bitmapDescriptor == null && view == null) {
            markerNode.getMarker().setIcon(pinConfig != null ? com.google.android.gms.maps.model.BitmapDescriptorFactory.fromPinConfig(pinConfig) : null);
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit AdvancedMarkerImpl_myiKm0s$lambda$5$17(android.view.View view, com.google.maps.android.compose.MarkerNode markerNode, com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(markerNode, "");
        if (view == null) {
            markerNode.getMarker().setIcon(bitmapDescriptor);
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit AdvancedMarkerImpl_myiKm0s$lambda$5$18(com.google.maps.android.compose.MarkerNode markerNode, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(markerNode, "");
        markerNode.getMarker().setVisible(z);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit AdvancedMarkerImpl_myiKm0s$lambda$5$19(com.google.maps.android.compose.MarkerNode markerNode, float f) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(markerNode, "");
        markerNode.getMarker().setZIndex(f);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Marker_qld6geY$lambda$4(com.google.maps.android.compose.MarkerState markerState, java.lang.String str, float f, long j, boolean z, boolean z2, com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptor, long j2, float f2, java.lang.String str2, java.lang.Object obj, java.lang.String str3, boolean z3, float f3, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function1 function13, kotlin.jvm.functions.Function1 function14, int i, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        m10526Markerqld6geY(markerState, str, f, j, z, z2, bitmapDescriptor, j2, f2, str2, obj, str3, z3, f3, function1, function12, function13, function14, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Marker_qld6geY$lambda$0$0(com.google.android.gms.maps.model.Marker marker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(marker, "");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit MarkerInfoWindow_jYtn1XM$lambda$4(com.google.maps.android.compose.MarkerState markerState, float f, long j, boolean z, java.lang.String str, boolean z2, com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptor, long j2, float f2, java.lang.String str2, java.lang.Object obj, java.lang.String str3, boolean z3, float f3, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function1 function13, kotlin.jvm.functions.Function1 function14, kotlin.jvm.functions.Function3 function3, int i, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        m10529MarkerInfoWindowjYtn1XM(markerState, f, j, z, str, z2, bitmapDescriptor, j2, f2, str2, obj, str3, z3, f3, function1, function12, function13, function14, function3, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MarkerInfoWindow_jYtn1XM$lambda$0$0(com.google.android.gms.maps.model.Marker marker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(marker, "");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit MarkerInfoWindowContent_dVEpkwM$lambda$4(com.google.maps.android.compose.MarkerState markerState, float f, long j, boolean z, boolean z2, com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptor, long j2, float f2, java.lang.String str, java.lang.Object obj, java.lang.String str2, boolean z3, float f3, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function1 function13, kotlin.jvm.functions.Function1 function14, kotlin.jvm.functions.Function3 function3, int i, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        m10531MarkerInfoWindowContentdVEpkwM(markerState, f, j, z, z2, bitmapDescriptor, j2, f2, str, obj, str2, z3, f3, function1, function12, function13, function14, function3, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MarkerInfoWindowContent_dVEpkwM$lambda$0$0(com.google.android.gms.maps.model.Marker marker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(marker, "");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit MarkerInfoWindowComposable_LZmgDss$lambda$5(java.lang.Object[] objArr, com.google.maps.android.compose.MarkerState markerState, float f, long j, boolean z, boolean z2, long j2, float f2, java.lang.String str, java.lang.Object obj, java.lang.String str2, boolean z3, float f3, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function1 function13, kotlin.jvm.functions.Function1 function14, kotlin.jvm.functions.Function3 function3, kotlin.jvm.functions.Function2 function2, int i, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        m10530MarkerInfoWindowComposableLZmgDss(objArr, markerState, f, j, z, z2, j2, f2, str, obj, str2, z3, f3, function1, function12, function13, function14, function3, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MarkerInfoWindowComposable_LZmgDss$lambda$0$0(com.google.android.gms.maps.model.Marker marker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(marker, "");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit MarkerImpl_khPtz74$lambda$6(com.google.maps.android.compose.MarkerState markerState, java.lang.String str, float f, long j, boolean z, boolean z2, com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptor, long j2, float f2, java.lang.String str2, java.lang.Object obj, java.lang.String str3, boolean z3, float f3, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function1 function13, kotlin.jvm.functions.Function1 function14, kotlin.jvm.functions.Function3 function3, kotlin.jvm.functions.Function3 function32, int i, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        m10528MarkerImplkhPtz74(markerState, str, f, j, z, z2, bitmapDescriptor, j2, f2, str2, obj, str3, z3, f3, function1, function12, function13, function14, function3, function32, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MarkerImpl_khPtz74$lambda$0$0(com.google.android.gms.maps.model.Marker marker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(marker, "");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit MarkerComposable_Khg_OnI$lambda$5(java.lang.Object[] objArr, com.google.maps.android.compose.MarkerState markerState, java.lang.String str, float f, long j, boolean z, boolean z2, long j2, float f2, java.lang.String str2, java.lang.Object obj, java.lang.String str3, boolean z3, float f3, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function1 function13, kotlin.jvm.functions.Function1 function14, kotlin.jvm.functions.Function2 function2, int i, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        m10527MarkerComposableKhg_OnI(objArr, markerState, str, f, j, z, z2, j2, f2, str2, obj, str3, z3, f3, function1, function12, function13, function14, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MarkerComposable_Khg_OnI$lambda$0$0(com.google.android.gms.maps.model.Marker marker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(marker, "");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit AdvancedMarker_3D_2zJA$lambda$4(com.google.maps.android.compose.MarkerState markerState, java.lang.String str, float f, long j, boolean z, boolean z2, long j2, float f2, java.lang.String str2, java.lang.Object obj, java.lang.String str3, boolean z3, float f3, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function1 function13, kotlin.jvm.functions.Function1 function14, com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptor, com.google.android.gms.maps.model.PinConfig pinConfig, android.view.View view, int i, int i2, int i3, int i4, int i5, androidx.compose.runtime.Composer composer, int i6) {
        m10524AdvancedMarker3D2zJA(markerState, str, f, j, z, z2, j2, f2, str2, obj, str3, z3, f3, function1, function12, function13, function14, bitmapDescriptor, pinConfig, view, i, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1), androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i3), androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i4), i5);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AdvancedMarker_3D_2zJA$lambda$0$0(com.google.android.gms.maps.model.Marker marker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(marker, "");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit AdvancedMarkerImpl_myiKm0s$lambda$6(com.google.maps.android.compose.MarkerState markerState, java.lang.String str, float f, long j, boolean z, boolean z2, long j2, float f2, java.lang.String str2, java.lang.Object obj, java.lang.String str3, boolean z3, float f3, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function1 function13, kotlin.jvm.functions.Function1 function14, kotlin.jvm.functions.Function3 function3, kotlin.jvm.functions.Function3 function32, com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptor, com.google.android.gms.maps.model.PinConfig pinConfig, android.view.View view, int i, int i2, int i3, int i4, int i5, androidx.compose.runtime.Composer composer, int i6) {
        m10525AdvancedMarkerImplmyiKm0s(markerState, str, f, j, z, z2, j2, f2, str2, obj, str3, z3, f3, function1, function12, function13, function14, function3, function32, bitmapDescriptor, pinConfig, view, i, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1), androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i3), androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i4), i5);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AdvancedMarkerImpl_myiKm0s$lambda$0$0(com.google.android.gms.maps.model.Marker marker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(marker, "");
        return false;
    }
}
